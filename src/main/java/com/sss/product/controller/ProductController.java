package com.sss.product.controller;

import com.sss.product.dataobject.ProductCategory;
import com.sss.product.dataobject.ProductInfo;
import com.sss.product.service.CategoryService;
import com.sss.product.service.ProductService;
import com.sss.product.utils.ResultVOUtil;
import com.sss.product.vo.ProductInfoVO;
import com.sss.product.vo.ProductVO;
import com.sss.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shishusheng
 * @date 2018/6/9 07:38
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list() throws Exception {
        // 1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        // 2. 获取类名 type 列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        // 3. 从数据库查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        // 4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                ProductInfoVO productInfoVO = new ProductInfoVO();
                BeanUtils.copyProperties(productInfo, productInfoVO);
                productInfoVOList.add(productInfoVO);
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}

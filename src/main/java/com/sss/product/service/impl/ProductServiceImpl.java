package com.sss.product.service.impl;

import com.sss.product.dataobject.ProductInfo;
import com.sss.product.enums.ProductStatusEnum;
import com.sss.product.repository.ProductInfoRepository;
import com.sss.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shishusheng
 * @date 2018/6/9 14:13
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() throws Exception {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}

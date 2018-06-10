package com.sss.product.repository;

import com.sss.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author shishusheng
 * @date 2018/6/9 07:57
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 检查在售状态
     *
     * @param productStatus 商品在售状态
     * @return 状态列表
     * @throws Exception e
     */
    List<ProductInfo> findByProductStatus(Integer productStatus) throws Exception;

}

package com.sss.product.service;

import com.sss.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author shishusheng
 * @date 2018/6/9 14:11
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll() throws Exception;
}

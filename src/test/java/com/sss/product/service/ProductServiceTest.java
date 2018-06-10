package com.sss.product.service;

import com.sss.product.ProductApplicationTests;
import com.sss.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author shishusheng
 * @date 2018/6/9 14:24
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }
}

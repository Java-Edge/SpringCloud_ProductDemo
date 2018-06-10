package com.sss.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.math.BigDecimal;

/**
 * @author shishusheng
 * @date 2018/6/10 04:10
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String ProductId;

    @JsonProperty("name")
    private String ProductName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productionIcon;

}

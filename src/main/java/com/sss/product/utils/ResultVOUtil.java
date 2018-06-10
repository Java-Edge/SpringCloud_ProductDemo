package com.sss.product.utils;

import com.sss.product.vo.ResultVO;

/**
 * @author shishusheng
 * @date 2018/6/10 06:46
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}

package com.xkj.util;

import com.xkj.vo.ResultVO;

/**
 * 返回数据封装工具类
 * Created by JIN on 2019/4/4.
 */
public class ResultVoUtil {

    /**
     * 成功有返回数据
     * @param object
     * @return
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        return resultVO;
    }

    /**
     * 成功无返回数据
     * @return
     */
    public static ResultVO success() {
        return success(null);
    }

    /**
     * 错误
     * @param code
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}

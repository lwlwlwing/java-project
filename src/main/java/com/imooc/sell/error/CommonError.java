package com.imooc.sell.error;

/**
 * @author Jeremy
 * @date 2020/2/6 16:28
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}

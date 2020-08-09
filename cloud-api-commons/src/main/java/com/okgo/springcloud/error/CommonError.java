package com.okgo.springcloud.error;

/**
 * @author Shawn
 * @date 2019/8/1 0:09
 * @title Function
 */
public interface CommonError {
    int getErrCode();
    String getErrMsg();
    CommonError setErrMsg(String errMsg);
}

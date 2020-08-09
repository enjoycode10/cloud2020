package com.okgo.springcloud.error;

/**
 * @author Shawn
 * @date 2019/8/1 0:12
 * @title Function
 */
public enum EmBusinessError implements CommonError {
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOW_ERROR(10002, "未知错误"),
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003, "用户未登录"),
    STOCK_NOT_ENOUGH(30001, "库存不足")
    ;

    private int errCode;
    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

/*    if (!StringUtils.equals(otpCode, inSessionOtpCode)) {
        throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "短信验证码不正确");
    }*/
}

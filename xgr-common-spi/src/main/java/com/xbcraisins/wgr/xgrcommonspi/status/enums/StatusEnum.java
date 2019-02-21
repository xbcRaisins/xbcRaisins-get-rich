package com.xbcraisins.wgr.xgrcommonspi.status.enums;

import com.xbcraisins.wgr.xgrcommonspi.status.StatusCode;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/2/21 13:39
 */
public enum StatusEnum implements StatusCode {
    OK(0, "success"),
    ERROR(-1, "error");


    StatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.code + "|" + this.getMessage();
    }
}

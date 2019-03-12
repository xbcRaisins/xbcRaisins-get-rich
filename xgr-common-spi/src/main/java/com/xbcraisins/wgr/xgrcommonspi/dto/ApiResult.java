package com.xbcraisins.wgr.xgrcommonspi.dto;

import com.xbcraisins.wgr.xgrcommonspi.status.StatusCode;
import com.xbcraisins.wgr.xgrcommonspi.status.enums.StatusEnum;

import java.io.Serializable;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/2/21 13:31
 */
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 4315496618973196429L;

    private Integer status;
    private String message;
    private T data;
    private String innerMsg;

    private ApiResult() {
        this(StatusEnum.OK);
    }

    public ApiResult(StatusCode statusCode) {
        this.status = statusCode.getCode();
        this.message = statusCode.getMessage();
    }

    public ApiResult(StatusCode statusCode, String message) {
        this(statusCode);
        if (message != null) {
            this.message = message;
        }
    }

    public ApiResult(T data, String message) {
        this();
        this.data = data;
        if (message != null) {
            this.message = message;
        }
    }
}

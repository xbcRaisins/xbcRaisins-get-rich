package com.xbcraisins.wgr.xgrcommonspi.status;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/2/21 13:37
 */
public interface StatusCode {

    /**
     * 获取状态码
     *
     * @param
     * @return int
     * @date 2019/2/21 13:38
     * @author xbcRaisins
     */
    int getCode();

    /**
     * 获取提示信息
     *
     * @param
     * @return java.lang.String
     * @date 2019/2/21 13:38
     * @author xbcRaisins
     */
    String getMessage();
}

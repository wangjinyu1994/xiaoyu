package com.xiaoyu.provider.order.interceptor;

import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.provider.order.util.HttpRequestWrapperUtil;


import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * WJY
 */
public class HttpRequestRepeatReadBodyWrapper extends HttpServletRequestWrapper {

    private final byte[] body;
    public HttpRequestRepeatReadBodyWrapper(HttpServletRequest request) throws IOException {
        super(request);
        body = HttpRequestWrapperUtil.getBodyString(request).getBytes(Charset.forName(SysConstantsEnum.SYS_ZFJ.getValue()));
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        final ByteArrayInputStream bais = new ByteArrayInputStream(body);
        return new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return bais.read();
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {
            }
        };
    }
}

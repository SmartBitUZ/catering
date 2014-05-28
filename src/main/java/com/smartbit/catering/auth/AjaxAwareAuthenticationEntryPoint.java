package com.smartbit.catering.auth;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrey on 27.03.2014.
 */
public final class AjaxAwareAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {

    public AjaxAwareAuthenticationEntryPoint(String loginUrl) {
        super(loginUrl);
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        boolean isAjax = "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
        if (isAjax) {
            String ajaxRedirectXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><partial-response><redirect url=\"login\"></redirect></partial-response>";
            response.setContentType("text/xml");
            response.getWriter().write(ajaxRedirectXml);
        } else {
            super.commence(request, response, authException);
        }
    }
}


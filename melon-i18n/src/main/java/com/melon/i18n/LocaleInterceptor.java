package com.melon.i18n;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author keith
 */
@Configuration
public class LocaleInterceptor implements HandlerInterceptor {

    private static final String LANGUAGE_KEY = "Accept-Language";

    private static final String ZH = "zh";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String header = request.getHeader(LANGUAGE_KEY);
        Locale locale;
        if (header != null && header.startsWith(ZH)) {
            locale = Locale.SIMPLIFIED_CHINESE;
        } else {
            locale = Locale.US;
        }
        LocaleContext.set(locale);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        LocaleContext.remove();
    }
}

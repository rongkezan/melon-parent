package com.melon.i18n;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Locale;

/**
 * @author keith
 */
@RestController
public class TestController {

    @Resource
    private MessageSource messageSource;

    @GetMapping("hello")
    public String hello(String code) {
        Locale locale = LocaleContext.get();
        Object[] args = {
                "Tom"
        };
        return messageSource.getMessage(code, args, locale);
    }
}

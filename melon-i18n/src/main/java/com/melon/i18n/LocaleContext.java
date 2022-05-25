package com.melon.i18n;

import java.util.Locale;

/**
 * 语言上下文
 *
 * @author keith
 */
public class LocaleContext {

    public static final ThreadLocal<Locale> LOCALE_INFO = new ThreadLocal<>();

    public static Locale get() {
        return LOCALE_INFO.get();
    }

    public static void set(Locale userDto) {
        LOCALE_INFO.set(userDto);
    }

    public static void remove() {
        LOCALE_INFO.remove();
    }
}

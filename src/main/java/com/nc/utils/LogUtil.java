package com.nc.utils;

import java.util.Date;

public class LogUtil {

    public static String getCurrentDateTime() {
        return "[" + new Date() + "]";
    }
}
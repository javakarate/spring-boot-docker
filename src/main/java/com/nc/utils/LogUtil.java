package com.nc.utils;

import java.util.Date;

/**
* Util class for logging to be used in logging purposes
**/
public class LogUtil {

    public static String getCurrentDateTime() {
        return "[" + new Date() + "]";
    }
}
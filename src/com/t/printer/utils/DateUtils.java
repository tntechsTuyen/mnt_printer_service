/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tuyen
 */
public class DateUtils {
    /**
     * @param p: ex[yyyy/MM/dd HH:mm:ss]
     */
    public static String format(Date d, String p){
        SimpleDateFormat dateFormat = new SimpleDateFormat(p);
        return dateFormat.format(d);
    }
}

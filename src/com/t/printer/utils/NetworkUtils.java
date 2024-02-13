/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer.utils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author Tuyen
 */
public class NetworkUtils {
    
    public static String getIp(){
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
    public static String getMac(){
        InetAddress ip;
        try{
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);

            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            return sb.toString();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer.services;
import com.t.printer.dto.LoginDTO;
import java.net.HttpURLConnection;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author Tuyen
 */
public class LoginService {
    
    private static final String URL = "http://localhost/project/demo.json";
    private static final String CHARSET = "UTF-8";
    
    public void loginSystem(LoginDTO loginDTO) throws MalformedURLException, IOException{
        StringBuilder data = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) ((new URL(URL).openConnection()));
        con.setRequestMethod("GET");
        con.setDoOutput(true);
        String s;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            while ((s = in.readLine()) != null) {
                data.append(s);
            }
        }
        System.out.println(data.toString());
    }
}

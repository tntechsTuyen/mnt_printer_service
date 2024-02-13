/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer;
import com.t.printer.database.SQLiteDB;
import com.t.printer.dto.LoginDTO;
import com.t.printer.repository.TaskRepository;
import com.t.printer.services.LoginService;
import com.t.printer.utils.NetworkUtils;
import java.io.IOException;
import java.net.InetAddress;

import java.net.NetworkInterface;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Tuyen
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginService loginService = new LoginService();
        try {
            loginService.loginSystem(new LoginDTO("Test"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        TaskRepository taskRepository = new TaskRepository();
        taskRepository.getList();
    }
    
}

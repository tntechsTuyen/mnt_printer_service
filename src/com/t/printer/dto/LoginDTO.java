/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer.dto;

/**
 *
 * @author Tuyen
 */
public class LoginDTO {
    private String tokenID;

    public LoginDTO(String tokenID) {
        this.tokenID = tokenID;
    }
    
    public String getTokenID() {
        return tokenID;
    }

    public void setTokenID(String tokenID) {
        this.tokenID = tokenID;
    }
}

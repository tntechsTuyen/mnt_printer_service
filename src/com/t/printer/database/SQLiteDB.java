/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Tuyen
 */
public class SQLiteDB {
    
    private Connection conn;
    
    public SQLiteDB(){
        
    }
    
    private Connection connect(){
        try{
          String url = "jdbc:sqlite:‪‪database.db";
          return DriverManager.getConnection(url);
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            try{
                if(this.conn != null) this.conn.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public void exec(String sql, Callback callback){
        try{
            this.conn = this.connect();
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                callback.mapping(rs);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public interface Callback{
        void mapping(ResultSet rs);
    }
}

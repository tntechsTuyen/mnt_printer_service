/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t.printer.repository;

import com.t.printer.database.SQLiteDB;
import com.t.printer.models.TaskDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuyen
 */
public class TaskRepository {
    
    private SQLiteDB db;

    public TaskRepository() {
        this.db = new SQLiteDB();
    }
    
    public List<TaskDTO> getList(){
        String sql = "SELECT * FROM task";
        db.exec(sql, new SQLiteDB.Callback() {
            @Override
            public void mapping(ResultSet rs) {
                try {
                    System.out.println(rs.getString("name"));
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        return new ArrayList<>();
    }
}

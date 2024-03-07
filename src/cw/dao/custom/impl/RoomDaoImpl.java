/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dao.custom.impl;

import cw.dao.CrudUtil;
import cw.dao.custom.RoomDao;
import cw.entity.RoomEntity;

import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author chira
 */
public class RoomDaoImpl implements RoomDao {
       @Override
    public boolean add(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Rooms VALUES(?,?,?,?)", 
                t.getRoomid(),
                t.getRoomno(),
                t.getCategoryid(),
                t.getStatus());
                
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Rooms SET RoomID=?, RoomNumber=?, CategoryID =?, Status=?", 
                t.getRoomid(),
                t.getRoomno(),
                t.getCategoryid(),
                t.getStatus());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Rooms WHERE RoomID=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room WHERE RoomID=?", id);
        while (rst.next()) {            
            return new RoomEntity(rst.getInt("RoomID"),  
                    rst.getInt("RoomNumber"), 
                    rst.getInt("CategoryID"), 
                    rst.getEnum("Status"));
        }
        return null;
    }

    @Override
    public ArrayList<RoomEntity> getAll() throws Exception {
        ArrayList<RoomEntity> roomEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room");
        while (rst.next()) {            
            roomEntities.add( new RoomEntity(rst.getInt("RoomID"), 
                    rst.getInt("RoomNumber"), 
                    rst.getInt("CategoryID"), 
                    rst.getEnum("Status")));
        }
        return roomEntities;
    }

}


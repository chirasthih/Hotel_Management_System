/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dao.custom.impl;

import cw.dao.CrudUtil;
import cw.dao.custom.RoomCategoryDao;
import cw.entity.RoomCategoryEntity;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author chira
 */
public class RoomCategoryDaoImpl implements RoomCategoryDao {
      @Override
    public boolean save(RoomCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Roomcategories VALUES(?,?,?)",
              t.getCategoryid(),
              t.getCategoryname(),
              t.getDescription());
    }

    @Override
    public boolean update(RoomCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Roomcategories SET categoryname=?, description=? WHERE categoryid=?",
             t.getCategoryid(),
              t.getCategoryname(),
              t.getDescription());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Roomcategories WHERE categoryid=?",
                id);
    }

    @Override
    public RoomCategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Roomcategories WHERE categoryid=?", id);
        while (rst.next()) {
            return new RoomCategoryEntity(rst.getInt("categoryid"),
                     rst.getString("categoryname"),
                    rst.getString("description"));
        }
        return null;
    }

    @Override
    public List<RoomCategoryEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Roomcategories");
        List<RoomCategoryEntity> roomCategoryEntities = new ArrayList<>();

        while (rst.next()) {
            roomCategoryEntities.add(new RoomCategoryEntity(rst.getInt("categoryid"),
                     rst.getString("categoryname"),
                    rst.getString("Description")));
                    
                   
        }
        return roomCategoryEntities;
    }
}

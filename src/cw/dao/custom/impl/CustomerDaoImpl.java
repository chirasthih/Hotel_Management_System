/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dao.custom.impl;

import cw.dao.CrudUtil;
import cw.dao.custom.CustomerDao;
import cw.entity.CustomerEntity;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author chira
 */
public class CustomerDaoImpl implements CustomerDao {
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?,?)",
                t.getCustid(),
                t.getFname(),
                t.getLname(),
                t.getEmail(),
                t.getPhone());
}
      @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET CustomerId=?, FirstName=?, " 
                + "LastName=?, Email=?, Phone=?  "
                + "WHERE Custid=?",
                 t.getCustid(),
                t.getFname(),
                t.getLname(),
                t.getEmail(),
                t.getPhone());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
        while (rst.next()) {
            return new CustomerEntity(
                    rst.getString("CustID"),                 
                    rst.getString("CustFname"),
                    rst.getString("CustLname"),                   
                    rst.getString("email"),
                    rst.getString("phone"));
                    
        }
        
        return null;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        List<CustomerEntity> customerEntities = new ArrayList<>();
        
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustID"),                 
                    rst.getString("CustFname"),
                    rst.getString("CustLname"),                   
                    rst.getString("email"),
                    rst.getString("phone")));
        }
        
        return customerEntities;
    }

}
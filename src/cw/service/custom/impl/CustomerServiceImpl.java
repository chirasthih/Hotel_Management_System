/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.service.custom.impl;

import cw.dao.DaoFactory;
import cw.dao.custom.CustomerDao;
import cw.dto.CustomerDto;
import cw.entity.CustomerEntity;
import cw.service.custom.CustomerService;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chira
 */
public class CustomerServiceImpl implements CustomerService{
      private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);
      
      @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustid(), dto.getFname(),
                dto.getLname(), dto.getEmail(),
                dto.getPhone()); 

        if (customerDao.add(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustid(), dto.getFname(),
                dto.getLname(), dto.getEmail(),
                dto.getPhone()); 

        if (customerDao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        if (entity != null) {
            return new CustomerDto(entity.getCustid(),entity.getFname(),
                entity.getLname(), entity.getEmail(),
                entity.getPhone()); 
        }
        return null;
    }

    @Override
    public List<CustomerDto> getAll() throws Exception {
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {
            customerDtos.add(new CustomerDto(entity.getCustid(),
                     entity.getFname(),entity.getLname(),
                    entity.getEmail(), entity.getPhone())); 
        }
        return customerDtos;
    }

}


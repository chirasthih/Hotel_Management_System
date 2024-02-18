/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.controller;

import cw.dto.CustomerDto;
import cw.service.ServiceFactory;
import cw.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author chira
 */
public class CustomerController {
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDto getCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }
    
    public List<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getAll();
    }
}
 


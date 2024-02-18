/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.service.custom;

import cw.dto.CustomerDto;
import cw.service.SuperService;
import java.util.List;
/**
 *
 * @author chira
 */
public interface CustomerService extends SuperService{

    String addCustomer(CustomerDto dto) throws Exception;

    String updateCustomer(CustomerDto dto) throws Exception;

    String deleteCustomer(String id) throws Exception;
    
    CustomerDto getCustomer(String id) throws Exception;
    
    List<CustomerDto> getAll() throws Exception;
    
}

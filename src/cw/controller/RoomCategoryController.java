/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.controller;

import cw.dto.RoomCategoryDto;
import cw.service.ServiceFactory;
import cw.service.custom.RoomCategoryService;
import java.util.List;
/**
 *
 * @author chira
 */
public class RoomCategoryController {
     private RoomCategoryService roomCategoryService = (RoomCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMCATEGORIES);
    
    public String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception{
        return roomCategoryService.saveRoomCategory(roomCategoryDto);
    }
    
    public RoomCategoryDto get(String id) throws Exception{
        return roomCategoryService.getRoomCategory(id);
    }
    
    public List<RoomCategoryDto> getAll() throws Exception{
        return roomCategoryService.getAll();
    }
}


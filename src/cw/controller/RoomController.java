/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.controller;

import cw.dto.RoomDto;
import cw.service.ServiceFactory;
import cw.service.custom.RoomService;
import java.util.List;
/**
 *
 * @author chira
 */
public class RoomController {
      private RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMS);

    public String save(RoomDto roomDto) throws Exception{
        return roomService.saveRoom(roomDto);
    }
    
    public String update(RoomDto roomDto) throws Exception{
        return roomService.UpdateRoom(roomDto);
    }
    
    public String delete(String itemId) throws Exception{
        return roomService.deleteItem(itemId);
    }
    
    public RoomDto get(String itemId) throws Exception{
        return roomService.getRoom(itemId);
    }
    
    public List<RoomDto> getAll() throws Exception{
        return roomService.getAll();
    }
}

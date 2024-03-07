/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cw.service.custom;

import cw.dto.RoomDto;
import cw.service.SuperService;
import java.util.List;
/**
 *
 * @author chira
 */
public interface RoomService extends SuperService {
      String saveRoom(RoomDto roomDto) throws Exception;
    String updateRoom(RoomDto roomDto) throws Exception;
    String deleteRoom(String id) throws Exception;
    RoomDto getRoom(String id) throws Exception;
    List<RoomDto> getAll() throws Exception;
}

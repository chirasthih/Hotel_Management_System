/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cw.service.custom;

import cw.dto.RoomCategoryDto;
import cw.service.SuperService;
import java.util.List;
/**
 *
 * @author chira
 */

public interface RoomCategoryService extends SuperService{
    String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception;
    String updateRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception;
    String deleteRoomCategory(String id) throws Exception;
    RoomCategoryDto getRoomCategory(String id) throws Exception;
    List<RoomCategoryDto> getAll() throws Exception;
}


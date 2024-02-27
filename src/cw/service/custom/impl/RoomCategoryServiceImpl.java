/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.service.custom.impl;

import cw.dao.DaoFactory;
import cw.dao.custom.RoomCategoryDao;
import cw.dto.RoomCategoryDto;
import cw.entity.RoomCategoryEntity;
import cw.service.custom.RoomCategoryService;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chira
 */
public class RoomCategoryServiceImpl {
      private RoomCategoryDao roomCategoryDao = (RoomCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOMCATEGORIES);

    @Override
    public String saveItem(RoomCategoryDto dto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(dto.getCategoryid(),
               dto.getCategoryname(), dto.getDescription());
        if (roomCategoryDao.save(entity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateItem(RoomCategoryDto dto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(dto.getCategoryid(),
               dto.getCategoryname(), dto.getDescription());
        if (roomCategoryDao.update(entity)) {
            return "Successfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if (roomCategoryDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public RoomCategoryDto getRoomCategory(String id) throws Exception {
        RoomCategoryEntity e = roomCategoryDao.get(id);
        return new RoomCategoryDto(e.getCategoryid(),
                e.getCategoryname(),
                e.getDescription());
    }

    @Override
    public List<RoomCategoryDto> getAll() throws Exception {
        List<RoomCategoryDto> roomCategoryDtos = new ArrayList<>();
        List<RoomCategoryEntity> itemEntities = roomCategoryDao.getAll();

        for (RoomCategoryEntity e : itemEntities) {
            roomCategoryDtos.add(new RoomCategoryDto(e.getCategoryid(),
                    e.getCategoryname(), e.getDescription()));
        }
        return roomCategoryDtos;
    }

}

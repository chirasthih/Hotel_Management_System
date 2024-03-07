/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.service.custom.impl;

 import cw.dao.DaoFactory;
import cw.dao.custom.RoomDao;
import cw.dto.RoomDto;
import cw.entity.RoomEntity;
import cw.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chira
 */
public class RoomServiceImpl implements RoomService{
     private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOMS);

    @Override
    public String saveItem(RoomDto dto) throws Exception {
        RoomEntity entity = new RoomEntity(dto.getRoomid(),
                dto.getRoomno(), dto.getCategoryid(), dto.getStatus());
        if (roomDao.save(entity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateItem(RoomDto dto) throws Exception {
        RoomEntity entity = new RoomEntity(dto.getRoomid(),
                dto.getRoomno(), dto.getCategoryid(), dto.getStatus());
        if (roomDao.update(entity)) {
            return "Successfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if (roomDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public RoomDto getItem(String id) throws Exception {
        RoomEntity e = roomDao.get(id);
        return new RoomDto(e.getRoomid(),
                e.getRoomno(), e.getCategoryid(), e.getStatus());
    }

    @Override
    public List<RoomDto> getAll() throws Exception {
        List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntities = roomDao.getAll();

        for (RoomEntity e : roomEntities) {
            roomDtos.add(new RoomDto(e.getRoomid(),
                e.getRoomno(), e.getCategoryid(), e.getStatus()));
        }
        return roomDtos;
    }

}

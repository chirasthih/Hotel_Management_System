/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.entity;

/**
 *
 * @author chira
 */
public class RoomEntity {
    
    private Integer roomid;
    private Integer roomno;
    private Integer categoryid;
    private Enum status;
    

    public RoomEntity() {
    }

    public RoomEntity(Integer roomid, Integer roomno, Integer categoryid, Enum status) {
        this.roomid = roomid;
        this.roomno = roomno;
        this.categoryid = categoryid;
        this.status = status;
        
    }

    /**
     * @return the roomid
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * @param roomid the roomid to set
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * @return the roomno
     */
    public Integer getRoomno() {
        return roomno;
    }

    /**
     * @param roomno the roomno to set
     */
    public void setRoomno(Integer roomno) {
        this.roomno = roomno;
    }

    /**
     * @return the categoryid
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid the categoryid to set
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * @return the status
     */
    public Enum getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Enum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomEntity{" + "roomid=" + roomid + ", roomno=" + roomno + ", categoryid=" + categoryid + ", status=" + status + '}';
    }
    
}

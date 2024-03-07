/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dto;

/**
 *
 * @author chira
 */
public class RoomDto {

    private Integer Roomid;
     private Integer Roomno;
     private Integer Categoryid;
     private Enum Status;
   
   
    
     public RoomDto() {
    }

    public RoomDto(Integer Roomid, Integer Roomno, Integer Categoryid, Enum Status) {
       this.Roomid=Roomid;
       this.Roomno=Roomno;
       this.Categoryid=Categoryid;
       this.Status=Status;
      
    }

    /**
     * @return the Roomid
     */
    public Integer getRoomid() {
        return Roomid;
    }

    /**
     * @param Roomid the Roomid to set
     */
    public void setRoomid(Integer Roomid) {
        this.Roomid = Roomid;
    }

    /**
     * @return the Roomno
     */
    public Integer getRoomno() {
        return Roomno;
    }

    /**
     * @param Roomno the Roomno to set
     */
    public void setRoomno(Integer Roomno) {
        this.Roomno = Roomno;
    }

    /**
     * @return the Categoryid
     */
    public Integer getCategoryid() {
        return Categoryid;
    }

    /**
     * @param Categoryid the Categoryid to set
     */
    public void setCategoryid(Integer Categoryid) {
        this.Categoryid = Categoryid;
    }

    /**
     * @return the Status
     */
    public Enum getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(Enum Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "RoomDto{" + "Roomid=" + Roomid + ", Roomno=" + Roomno + ", Categoryid=" + Categoryid + ", Status=" + Status + '}';
    }

}
  

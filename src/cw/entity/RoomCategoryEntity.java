/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.entity;

/**
 *
 * @author chira
 */
public class RoomCategoryEntity {
     private Integer categoryid;
     private String categoryname;
     private String description;
   
   
    
     public RoomCategoryEntity() {
    }

    public RoomCategoryEntity(Integer categoryid, String categoryname, String description) {
       this.categoryid=categoryid;
       this.categoryname=categoryname;
       this.description=description;
      
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
     * @return the categoryname
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * @param categoryname the categoryname to set
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoomCategoryEntity{" + "categoryid=" + categoryid + ", categoryname=" + categoryname + ", description=" + description + '}';
    }
    
}

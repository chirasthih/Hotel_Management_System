/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dto;

/**
 *
 * @author chira
 */
public class RoomCategoryDto {
     private String categoryid;
     private String categoryname;
     private String description;
   
   
    
     public RoomCategoryDto() {
    }

    public RoomCategoryDto(String categoryid, String categoryname, String description) {
       this.categoryid=categoryid;
       this.categoryname=categoryname;
       this.description=description;
      
    }

    /**
     * @return the categoryid
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid the categoryid to set
     */
    public void setCategoryid(String categoryid) {
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
        return "RoomCategoryDto{" + "categoryid=" + categoryid + ", categoryname=" + categoryname + ", description=" + description + '}';
    }
    
}

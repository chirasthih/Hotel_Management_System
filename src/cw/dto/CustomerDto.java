/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dto;

/**
 *
 * @author chira
 */
public class CustomerDto {
     private String custid;
    private String fname;
    private String lname;
    private String email;
    private String phone;
   
    public CustomerDto() {
    }

    public CustomerDto(String custid, String fname, String lname, String email, String phone) {
          this.custid = custid;
        this.fname = fname;
        this.lname = lname;
        this.email= email;
        this.phone = phone;
        
       
    }

    /**
     * @return the custid
     */
    public String getCustid() {
        return custid;
    }

    /**
     * @param custid the custid to set
     */
    public void setCustid(String custid) {
        this.custid = custid;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class ChatLieu {
  
    private String maCL;
    private String tenCL;

    public ChatLieu(String maCL, String tenCL) {
        this.maCL = maCL;
        this.tenCL = tenCL;
    }

    public ChatLieu() {
    }

    public String getMaCL() {
        return maCL;
    }

    public void setMaCL(String maCL) {
        this.maCL = maCL;
    }

    public String getTenCL() {
        return tenCL;
    }

    public void setTenCL(String tenCL) {
        this.tenCL = tenCL;
    }
    public Object[] toDataRow(){
        return new Object[]{maCL,tenCL};
    }
}

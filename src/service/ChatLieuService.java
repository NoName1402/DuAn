/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.ChatLieu;

/**
 *
 * @author Long
 */
public interface ChatLieuService {
    public ArrayList<ChatLieu> getList();
    
    public Boolean add(ChatLieu cl);
    
    public Boolean update(String maCL, ChatLieu cl);
    
    public Boolean delete(String maCL);
    
    public ArrayList<ChatLieu> find(String maCL);
}

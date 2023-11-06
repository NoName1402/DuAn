/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implements;

import java.util.ArrayList;
import model.ChatLieu;
import repository.chatLieuRepository;
import service.ChatLieuService;

/**
 *
 * @author Long
 */
public class ChatLieuImplements implements ChatLieuService {

    private chatLieuRepository clrepo = new chatLieuRepository();

    @Override
    public ArrayList<ChatLieu> getList() {
        return clrepo.getList();
    }

    @Override
    public Boolean add(ChatLieu cl) {
        clrepo.add(cl);
        return true;
    }

    @Override
    public Boolean update(String maCL, ChatLieu cl) {
        clrepo.update(maCL, cl);
        return true;
    }

    @Override
    public Boolean delete(String maCL) {
        clrepo.delete(maCL);
        return true;
    }

    @Override
    public ArrayList<ChatLieu> find(String maCL) {
       return clrepo.find(maCL);
    }
}

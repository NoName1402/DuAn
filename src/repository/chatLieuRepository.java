/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import database.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ChatLieu;

/**
 *
 * @author Long
 */
public class chatLieuRepository {
    private DatabaseHelper connection;

    public ArrayList<ChatLieu> getList() {
        ArrayList<ChatLieu> list = new ArrayList<>();
        String sql = "select MaCL, TenCL  from ChatLieu";
        try (Connection con = connection.getDBConnect(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChatLieu cl = new ChatLieu();
                cl.setMaCL(rs.getString(1));
                cl.setTenCL(rs.getString(2));
                list.add(cl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    public boolean add(ChatLieu cl) {
        String sql = "insert into ChatLieu(MaCL, TenCL) values (?,?)";
        try (Connection con = connection.getDBConnect(); PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, cl.getMaCL());
            ps.setObject(2, cl.getTenCL());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String id, ChatLieu cl) {
        int check = 0;
        String sql = "update ChatLieu set MaCL=?, TenCL=? where Id like ?";
        try (Connection con = connection.getDBConnect(); PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, cl.getMaCL());
            ps.setObject(2, cl.getTenCL());
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String sql = "delete from ChatLieu where MaCL like ?";
        try (Connection con = connection.getDBConnect(); PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, ma);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<ChatLieu> find(String ten) {
        ArrayList<ChatLieu> listTK = new ArrayList<>();
        String sql = "select MaCL, TenCL from ChatLieu";
        try (Connection con = connection.getDBConnect(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).contains(ten)) {
                    ChatLieu cl = new ChatLieu();
                    cl.setMaCL(rs.getString(1));
                    cl.setTenCL(rs.getString(2));
                    listTK.add(cl);
                }
            }
            if (listTK.isEmpty()) {
                return null;
            }
            return listTK;

        } catch (Exception e) {
            return null;
        }
    }
}

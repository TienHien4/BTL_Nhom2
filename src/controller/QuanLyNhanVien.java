package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import model.NhanVienQL;
import view.FrameQuanLy;
import view.FrameChiTietNhanVien;

public class QuanLyNhanVien {
    JTable table;
    NhanVienQL nhanVienQL;

    public QuanLyNhanVien(JTable table) {
        this.table = table;
        nhanVienQL = new NhanVienQL();
    }

    public QuanLyNhanVien() {
        nhanVienQL = new NhanVienQL();
    }

    public ArrayList<NhanVien> getDS_NhanVien() {
        return nhanVienQL.getDS_NhanVien();
    }

    public void load_NhanVien() {
        ArrayList<NhanVien> ds_NhanVien = getDS_NhanVien();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (int i = 0; i < ds_NhanVien.size(); i++) {
            model.addRow(new Object[]{i + 1,
                ds_NhanVien.get(i).getMaNhanVien(),
                ds_NhanVien.get(i).getTenNhanVien(),
                ds_NhanVien.get(i).getGioiTinh(), 
                ds_NhanVien.get(i).getNgaySinh(),
                ds_NhanVien.get(i).getChucVu(),
            });
        }
    }

    public void themNhanVien(){
        FrameChiTietNhanVien fr = new FrameChiTietNhanVien(1 ,0 ,this);
        fr.setVisible(true);
    }
    
    public void themNhanVien(NhanVien nv) {
    	if (nhanVienQL.isMaNhanVienExist(nv.getMaNhanVien())) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được! Mã nhân viên đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            nhanVienQL.themNhanVien(nv);
            load_NhanVien();
        }
    
    }
    
    public void suaThongTinNhanVien(int index){
        FrameChiTietNhanVien fr = new FrameChiTietNhanVien(2, index , this);
        fr.setVisible(true);
    }
    
    public void suaThongTinNhanVien(NhanVien nv, int index){
        nhanVienQL.suaThongTin(nv, index);
        load_NhanVien();
    }
    
    public void xoaNhanVien(int index) {
        nhanVienQL.xoaNhanVien(index);
        load_NhanVien();
        JOptionPane.showMessageDialog(null, "xoá thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
       
    }
     
    public void writeNhanVienToFile() {
        nhanVienQL.writeNhanVienToFile();
    }
    
   
}

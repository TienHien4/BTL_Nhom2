
package model;

import java.io.Serializable;

public class Sach extends SanPham implements Serializable {
	private String tacGia;
	private String nhaXuatBan;

	public Sach(String maSanPham, String tenSanPham, int giaMua, int giaBan, String nhaCungCap, int soLuong,
			String tacGia, String nhaXuatBan) {
		super(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong);
		this.tacGia = tacGia;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

}

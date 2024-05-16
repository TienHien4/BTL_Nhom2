
package model;

import java.io.Serializable;

public class SanPham implements Serializable {
	private String maSanPham;
	private String tenSanPham;
	private int giaMua;
	private int giaBan;
	private String nhaCungCap;

	private int soLuong;

	public SanPham(String maSanPham, String tenSanPham, int giaMua, int giaBan, String nhaCungCap, int soLuong) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
		this.nhaCungCap = nhaCungCap;
		this.soLuong = soLuong;
	}

	public SanPham(String maSanPham, String tenSanPham, int giaBan, int soLuong) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(int giaMua) {
		this.giaMua = giaMua;
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}

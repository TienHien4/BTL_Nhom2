package view;

import Data.FileData;
import controller.QuanLySanPham;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import model.DiaNhac;
import model.DiaPhim;
import model.Sach;
import model.SanPham;

public class FrameChiTietSanPham extends javax.swing.JFrame {

	int type;
	int index;
	QuanLySanPham qlsp;

	public FrameChiTietSanPham() {
		initComponents();
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public FrameChiTietSanPham(QuanLySanPham qlsp, int index, int type) {
		initComponents();
		setLocationRelativeTo(null);
		setResizable(false);
		this.type = type;
		this.index = index;
		this.qlsp = qlsp;
		if (this.type == 1) {
			setTitle("CẬP NHẬT THÔNG TIN SÁCH");
			lbTitel.setText("Cập Nhật");
			this.setTitle("Sách");
			cbLoaiSanPham.setSelectedIndex(0);
			cbLoaiSanPham.setEnabled(false);
			lbthem1.setText("Tác Giả");
			lbthem2.setText("Nhà Xuất Bản");
			tfMaSanPham.setText(qlsp.getDS_Sach().get(index).getMaSanPham());
			tfTenSanPham.setText(qlsp.getDS_Sach().get(index).getTenSanPham());
			tfNhaCungCap.setText(qlsp.getDS_Sach().get(index).getNhaCungCap());
			tfSoLuong.setText(qlsp.getDS_Sach().get(index).getSoLuong() + "");
			tfGiaMua.setText(qlsp.getDS_Sach().get(index).getGiaMua() + "");
			tfGiaBan.setText(qlsp.getDS_Sach().get(index).getGiaBan() + "");
			tfThem1.setText(qlsp.getDS_Sach().get(index).getTacGia());
			tfThem2.setText(qlsp.getDS_Sach().get(index).getNhaXuatBan());
		} else if (this.type == 2) {
			setTitle("CẬP NHẬT THÔNG TIN ĐĨA NHẠC");
			lbTitel.setText("Cập Nhật");
			this.setTitle("Đĩa Nhạc");
			cbLoaiSanPham.setSelectedIndex(1);
			cbLoaiSanPham.setEnabled(false);
			lbthem1.setText("Tên Ca Sỹ");
			lbthem2.setText("Thể Loại");
			tfMaSanPham.setText(qlsp.getDS_DiaNhac().get(index).getMaSanPham());
			tfTenSanPham.setText(qlsp.getDS_DiaNhac().get(index).getTenSanPham());
			tfNhaCungCap.setText(qlsp.getDS_DiaNhac().get(index).getNhaCungCap());
			tfSoLuong.setText(qlsp.getDS_DiaNhac().get(index).getSoLuong() + "");
			tfGiaMua.setText(qlsp.getDS_DiaNhac().get(index).getGiaMua() + "");
			tfGiaBan.setText(qlsp.getDS_DiaNhac().get(index).getGiaBan() + "");
			tfThem1.setText(qlsp.getDS_DiaNhac().get(index).getTenCaSy());
			tfThem2.setText(qlsp.getDS_DiaNhac().get(index).getTheLoai());
		} else if (this.type == 3) {
			setTitle("CẬP NHẬT THÔNG TIN ĐĨA PHIM");
			lbTitel.setText("Cập Nhật");
			this.setTitle("Đĩa Phim");
			cbLoaiSanPham.setSelectedIndex(2);
			cbLoaiSanPham.setEnabled(false);
			lbthem1.setText("Tên Đạo Diễn");
			lbthem2.setText("Tên Diễn Viên");
			tfMaSanPham.setText(qlsp.getDS_DiaPhim().get(index).getMaSanPham());
			tfTenSanPham.setText(qlsp.getDS_DiaPhim().get(index).getTenSanPham());
			tfNhaCungCap.setText(qlsp.getDS_DiaPhim().get(index).getNhaCungCap());
			tfSoLuong.setText(qlsp.getDS_DiaPhim().get(index).getSoLuong() + "");
			tfGiaMua.setText(qlsp.getDS_DiaPhim().get(index).getGiaMua() + "");
			tfGiaBan.setText(qlsp.getDS_DiaPhim().get(index).getGiaBan() + "");
			tfThem1.setText(qlsp.getDS_DiaPhim().get(index).getTenDaoDien());
			tfThem2.setText(qlsp.getDS_DiaPhim().get(index).getTenDienVien());
		} else {
			setTitle("THÊM SẢN PHẨM");
			lbTitel.setText("Thêm Sản Phẩm");
			this.setTitle("Thêm Sản Phẩm");
			lbthem1.setText("Tác Giả");
			lbthem2.setText("Nhà Xuất Bản");
		}
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		lbTitel = new javax.swing.JLabel();
		lblMaSanPham2 = new javax.swing.JLabel();
		lblTenSanPham2 = new javax.swing.JLabel();
		lblNhaCungCap2 = new javax.swing.JLabel();
		lblLoaiSanPham2 = new javax.swing.JLabel();
		cbLoaiSanPham = new javax.swing.JComboBox<>();
		lbthem1 = new javax.swing.JLabel();
		lblGiaBan2 = new javax.swing.JLabel();
		btThemSanPham = new javax.swing.JButton();
		tfMaSanPham = new javax.swing.JTextField();
		tfTenSanPham = new javax.swing.JTextField();
		tfNhaCungCap = new javax.swing.JTextField();
		tfThem1 = new javax.swing.JTextField();
		tfThem2 = new javax.swing.JTextField();
		lblGiaMua3 = new javax.swing.JLabel();
		lbthem2 = new javax.swing.JLabel();
		tfGiaMua = new javax.swing.JTextField();
		jLabel46 = new javax.swing.JLabel();
		tfGiaBan = new javax.swing.JTextField();
		jLabel47 = new javax.swing.JLabel();
		btHuy = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		lblNhaCungCap3 = new javax.swing.JLabel();
		tfSoLuong = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		lbTitel.setFont(new java.awt.Font("Tahoma", 1, 30));
		lbTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbTitel.setText("Cập Nhật Thông Tin ");

		lblMaSanPham2.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblMaSanPham2.setText("Mã Sản Phẩm:");

		lblTenSanPham2.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblTenSanPham2.setText("Tên Sản Phẩm:");

		lblNhaCungCap2.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblNhaCungCap2.setText("Nhà Cung Cấp:");

		lblLoaiSanPham2.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblLoaiSanPham2.setText("Loại Sản Phẩm:");

		cbLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sách", "Đĩa Nhạc", "Đĩa Phim" }));
		cbLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbLoaiSanPhamActionPerformed(evt);
			}
		});

		lbthem1.setFont(new java.awt.Font("Tahoma", 1, 14));
		lbthem1.setText("...");

		lblGiaBan2.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblGiaBan2.setText("Giá Bán:");

		btThemSanPham.setFont(new java.awt.Font("Tahoma", 1, 14));
		btThemSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ok.png")));
		btThemSanPham.setText("OK");
		btThemSanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btThemSanPhamActionPerformed(evt);
			}
		});

		lblGiaMua3.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblGiaMua3.setText("Giá Mua:");

		lbthem2.setFont(new java.awt.Font("Tahoma", 1, 14));
		lbthem2.setText("...");

		tfGiaMua.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				tfGiaMuaKeyTyped(evt);
			}
		});

		jLabel46.setFont(new java.awt.Font("Tahoma", 2, 14));
		jLabel46.setForeground(new java.awt.Color(0, 204, 0));
		jLabel46.setText("VND");

		tfGiaBan.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				tfGiaBanKeyTyped(evt);
			}
		});

		jLabel47.setFont(new java.awt.Font("Tahoma", 2, 14));
		jLabel47.setForeground(new java.awt.Color(0, 204, 0));
		jLabel47.setText("VND");

		btHuy.setFont(new java.awt.Font("Tahoma", 1, 14));
		btHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove-button.png")));
		btHuy.setText("Hủy");
		btHuy.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btHuyActionPerformed(evt);
			}
		});

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product.png")));

		lblNhaCungCap3.setFont(new java.awt.Font("Tahoma", 1, 14));
		lblNhaCungCap3.setText("Số Lượng:");

		tfSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				tfSoLuongKeyTyped(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22)
										.addComponent(btThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 127,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77,
												Short.MAX_VALUE)
										.addComponent(btHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(16, 16, 16)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblGiaMua3, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNhaCungCap3, javax.swing.GroupLayout.PREFERRED_SIZE,
														122, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNhaCungCap2, javax.swing.GroupLayout.PREFERRED_SIZE,
														122, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMaSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE,
														122, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTenSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE,
														122, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblLoaiSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE,
														122, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGiaBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lbthem1, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lbthem2, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(cbLoaiSanPham, 0, 211, Short.MAX_VALUE)
												.addComponent(tfTenSanPham).addComponent(tfMaSanPham)
												.addComponent(tfNhaCungCap).addComponent(tfSoLuong)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(tfGiaMua, javax.swing.GroupLayout.DEFAULT_SIZE,
																167, Short.MAX_VALUE)
														.addComponent(tfGiaBan))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel47,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel46,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)))
												.addComponent(tfThem1).addComponent(tfThem2))))
						.addComponent(lbTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 362,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(16, 16, 16)));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { lblGiaBan2, lblGiaMua3,
				lblLoaiSanPham2, lblMaSanPham2, lblNhaCungCap2, lblNhaCungCap3, lblTenSanPham2, lbthem1, lbthem2 });

		jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { btHuy, btThemSanPham });

		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lbTitel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblLoaiSanPham2, javax.swing.GroupLayout.DEFAULT_SIZE, 28,
										Short.MAX_VALUE)
								.addComponent(cbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTenSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMaSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(tfNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNhaCungCap2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNhaCungCap3, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblGiaMua3, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfGiaMua, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblGiaBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbthem1, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfThem1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbthem2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfThem2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(22, 22, 22)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btHuy))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { cbLoaiSanPham, lblGiaBan2, lblGiaMua3, lblLoaiSanPham2, lblMaSanPham2,
						lblNhaCungCap2, lblNhaCungCap3, lblTenSanPham2, lbthem1, lbthem2 });

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { jLabel46, jLabel47,
				tfGiaBan, tfGiaMua, tfMaSanPham, tfNhaCungCap, tfSoLuong, tfTenSanPham, tfThem1, tfThem2 });

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { btHuy, btThemSanPham });

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void cbLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {
		String loaiSanPham = cbLoaiSanPham.getSelectedItem().toString();
		if (loaiSanPham == "Sách") {
			lbthem1.setText("Tác Giả");
			lbthem2.setText("Nhà Xuất Bản");
		} else if (loaiSanPham == "Đĩa Nhạc") {
			lbthem1.setText("Tên Ca Sỹ");
			lbthem2.setText("Thể Loại");
		} else {
			lbthem1.setText("Tên Đạo Diễn");
			lbthem2.setText("Tên Diễn Viên");
		}
	}

	private void btThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {
		String thongBao = "";
		if (tfMaSanPham.getText().trim().length() == 0) {
			thongBao += "Chưa Điền mã sản phẩm";
		}
		if (tfTenSanPham.getText().trim().length() == 0) {
			thongBao += "\nChưa Điền tên sản phẩm";
		}
		if (tfNhaCungCap.getText().trim().length() == 0) {
			thongBao += "\nChưa điền nhà cung cấp";
		}
		if (tfGiaMua.getText().trim().length() == 0) {
			thongBao += "\nChưa điền giá mua";
		}
		if (tfGiaBan.getText().trim().length() == 0) {
			thongBao += "\nChưa điền giá Bán";
		}
		if (tfSoLuong.getText().trim().length() == 0) {
			thongBao += "\nChưa điền số lượng";
		}
		if (thongBao.length() != 0) {
			JOptionPane.showMessageDialog(null, thongBao, "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			String loaiSanPham = cbLoaiSanPham.getSelectedItem().toString();
			String maSanPham = tfMaSanPham.getText();
			String tenSanPham = tfTenSanPham.getText();
			String nhaCungCap = tfNhaCungCap.getText();
			int giaMua = Integer.parseInt(tfGiaMua.getText());
			int giaBan = Integer.parseInt(tfGiaBan.getText());
			int soLuong = Integer.parseInt(tfSoLuong.getText());

			switch (this.type) {
			case 0:
				SanPham sp = null;
				if (loaiSanPham == "Sách") {
					String tacGia = tfThem1.getText();
					String nhaXuatBan = tfThem2.getText();
					sp = new Sach(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong, tacGia, nhaXuatBan);
				} else if (loaiSanPham == "Đĩa Nhạc") {
					String tenCaSy = tfThem1.getText();
					String theLoai = tfThem2.getText();
					sp = new DiaNhac(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong, tenCaSy, theLoai);
				} else {
					String tenDaoDien = tfThem1.getText();
					String tenDienVien = tfThem2.getText();
					sp = new DiaPhim(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong, tenDaoDien,
							tenDienVien);
				}
				qlsp.themSanPham(sp);
				break;
			case 1:
				String tacGia = tfThem1.getText();
				String nhaXuatBan = tfThem2.getText();
				Sach s = new Sach(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong, tacGia, nhaXuatBan);
				qlsp.suaThongTin(s, index);
				break;
			case 2:
				String tenCaSy = tfThem1.getText();
				String theLoai = tfThem2.getText();
				DiaNhac dn = new DiaNhac(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong, tenCaSy, theLoai);
				qlsp.suaThongTin(dn, index);
				break;
			default:
				String tenDaoDien = tfThem1.getText();
				String tenDienVien = tfThem2.getText();
				DiaPhim dp = new DiaPhim(maSanPham, tenSanPham, giaMua, giaBan, nhaCungCap, soLuong, tenDaoDien,
						tenDienVien);
				qlsp.suaThongTin(dp, index);
				break;
			}
			this.dispose();
		}
	}

	private void tfSoLuongKeyTyped(java.awt.event.KeyEvent evt) {

		if (evt.getKeyChar() > KeyEvent.VK_9 || evt.getKeyChar() < KeyEvent.VK_0) {
			Toolkit.getDefaultToolkit().beep();
			evt.consume();
		}
	}

	private void tfGiaMuaKeyTyped(java.awt.event.KeyEvent evt) {

		if (evt.getKeyChar() > KeyEvent.VK_9 || evt.getKeyChar() < KeyEvent.VK_0) {
			Toolkit.getDefaultToolkit().beep();
			evt.consume();
		}
	}

	private void tfGiaBanKeyTyped(java.awt.event.KeyEvent evt) {

		if (evt.getKeyChar() > KeyEvent.VK_9 || evt.getKeyChar() < KeyEvent.VK_0) {
			Toolkit.getDefaultToolkit().beep();
			evt.consume();
		}
	}

	private javax.swing.JButton btHuy;
	private javax.swing.JButton btThemSanPham;
	private javax.swing.JComboBox<String> cbLoaiSanPham;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lbTitel;
	private javax.swing.JLabel lblGiaBan2;
	private javax.swing.JLabel lblGiaMua3;
	private javax.swing.JLabel lblLoaiSanPham2;
	private javax.swing.JLabel lblMaSanPham2;
	private javax.swing.JLabel lblNhaCungCap2;
	private javax.swing.JLabel lblNhaCungCap3;
	private javax.swing.JLabel lblTenSanPham2;
	private javax.swing.JLabel lbthem1;
	private javax.swing.JLabel lbthem2;
	private javax.swing.JTextField tfGiaBan;
	private javax.swing.JTextField tfGiaMua;
	private javax.swing.JTextField tfMaSanPham;
	private javax.swing.JTextField tfNhaCungCap;
	private javax.swing.JTextField tfSoLuong;
	private javax.swing.JTextField tfTenSanPham;
	private javax.swing.JTextField tfThem1;
	private javax.swing.JTextField tfThem2;

}

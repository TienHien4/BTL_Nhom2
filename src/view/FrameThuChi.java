package view;

import controller.QuanLyThuChi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ThuChi;
public class FrameThuChi extends javax.swing.JFrame {

    QuanLyThuChi qlThuChi;
    int type;
    String s;

    public FrameThuChi(QuanLyThuChi qltc, int type, String s) {
        this.type = type;
        initComponents();
        this.qlThuChi = qltc;
        this.s = s;
        ArrayList<ThuChi> ds_ThuChi = new ArrayList<>();
        ds_ThuChi = qlThuChi.get_DS_ThuChi();
        this.setLocationRelativeTo(null);
        if (this.type == 1) {
            setTitle("THÊM THU CHI");
            tfTenThuChi.setText("");
            tfTien.setText("");
            textNoiDung.setText("");
        } else {
            setTitle("CHI TIẾT THU CHI");
            lbtieude.setText("Chi Tiết");
            for (int i = 0; i < ds_ThuChi.size(); i++) {
                if (ds_ThuChi.get(i).getTenChiPhi().equals(s)) {
                    tfTenThuChi.setText(s);
                    tfTenThuChi.setEditable(false);
                    tfTien.setText(ds_ThuChi.get(i).getMucChiPhi() + "");
                    tfTien.setEditable(false);
                    textNoiDung.append(ds_ThuChi.get(i).getNoiDung());
                    textNoiDung.setEditable(false);
                    if (ds_ThuChi.get(i).getLoaichiphi().equalsIgnoreCase("Chi") || ds_ThuChi.get(i).getLoaichiphi().equalsIgnoreCase("Nhập Kho") || ds_ThuChi.get(i).getLoaichiphi().equalsIgnoreCase("Trả Lương")) {
                        cbloaiThuChi.setSelectedIndex(1);
                        cbloaiThuChi.setEnabled(false);
                    }
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbtieude = new javax.swing.JLabel();
        lblTenNhanVien1 = new javax.swing.JLabel();
        lblTenNhanVien2 = new javax.swing.JLabel();
        tfTenThuChi = new javax.swing.JTextField();
        tfTien = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbloaiThuChi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textNoiDung = new javax.swing.JTextArea();
        lbNoiDung = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbtieude.setFont(new java.awt.Font("Tahoma", 1, 30));        
        lbtieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtieude.setText("Thêm Thu Chi");

        lblTenNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        lblTenNhanVien1.setText("Loại Thu Chi :");

        lblTenNhanVien2.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblTenNhanVien2.setText("Thành Tiền :");

        btOk.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ok.png"))); 
        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove-button.png"))); 
        btHuy.setText("Hủy");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); 
        jLabel1.setText("VNĐ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Tên Chu Chi :");

        cbloaiThuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu", "Chi" }));

        textNoiDung.setColumns(20);
        textNoiDung.setRows(5);
        jScrollPane1.setViewportView(textNoiDung);

        lbNoiDung.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        lbNoiDung.setText("Nội Dung :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(lblTenNhanVien1)
                                .addComponent(lblTenNhanVien2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(lbNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbloaiThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfTenThuChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(tfTien, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(lbtieude, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, lblTenNhanVien1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtieude, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTenThuChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbloaiThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(tfTien, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, lblTenNhanVien1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.type == 1) {
            String thongBao = "";
            if (tfTenThuChi.getText().trim().length() == 0) {
                thongBao += "Chưa Điền Tên Thu Chi";
            }
            if (tfTien.getText().trim().length() == 0) {
                thongBao += "\nChưa Điền Số Tiền";
            }
            if (textNoiDung.getText().trim().length() == 0) {
                thongBao += "\nChưa Điền Nội dung";
            }
            if (thongBao.length() != 0) {
                JOptionPane.showMessageDialog(null, thongBao, "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String tenThuChi = tfTenThuChi.getText().trim();
                long tongTien = Long.parseLong(tfTien.getText().trim());
                String noiDung = textNoiDung.getText();
                qlThuChi.themThuChi(new ThuChi(tenThuChi, tongTien, getCurrentDate(), cbloaiThuChi.getSelectedItem().toString(), noiDung));
            }
        }
        this.dispose();
    }

    private String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dates = new Date();
        return dateFormat.format(dates);
    }

 
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btOk;
    private javax.swing.JComboBox<String> cbloaiThuChi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNoiDung;
    private javax.swing.JLabel lblTenNhanVien1;
    private javax.swing.JLabel lblTenNhanVien2;
    private javax.swing.JLabel lbtieude;
    private javax.swing.JTextArea textNoiDung;
    private javax.swing.JTextField tfTenThuChi;
    private javax.swing.JTextField tfTien;
}

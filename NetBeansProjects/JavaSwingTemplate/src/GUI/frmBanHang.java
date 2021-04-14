/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import OBJ.HoaDon;
import OBJ.KhachHang;
import OBJ.SanPham;
import Utils.ValidateData;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.chart.PieChart;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Linh
 */
public class frmBanHang extends javax.swing.JPanel {

    /**
     * Creates new form frmBanHang
     */
    private DefaultTableModel defaultTableModel;
    ArrayList<HoaDon> listGioHang = new ArrayList<>();
    NumberFormat formatter = new DecimalFormat("###,###");
    KhachHang kh = new KhachHang();
    SanPham sp = new SanPham();
    int index;
    ValidateData validate = new ValidateData();

    public frmBanHang() {
        initComponents();
        getDataKH(LoadKH());
        getDataSP(LoadSP());
    }

    public ArrayList<KhachHang> LoadKH() {
        frmKhachHang frm_KH = new frmKhachHang();
        frm_KH.loadFile();
        return frm_KH.listKH;
    }

    private void getDataKH(ArrayList<KhachHang> listKH) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Họ tên KH");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Email ");
        defaultTableModel.addColumn("Giới tính ");
        defaultTableModel.addColumn("Nhóm");
        defaultTableModel.addColumn("Trạng thái");

        for (KhachHang obj : listKH) {
            Vector vector = new Vector();
            vector.add(obj.getMaKhachHang());
            vector.add(obj.getHoTen());
            vector.add(obj.getSoDienThoai());
            vector.add(obj.getEmail());
            vector.add(obj.getGioiTinh());
            vector.add(obj.getNhom() == 1 ? "Thường" : "Thân thiết");
            vector.add(obj.getTrangThai() == 1 ? "Hoạt động" : "Đã khóa");

            defaultTableModel.addRow(vector);
        }
        tbl_KH.setModel(defaultTableModel);
    }

    public ArrayList<SanPham> LoadSP() {
        frmSanPham frm_SP = new frmSanPham();
        frm_SP.loadFile();
        return frm_SP.listSP;
    }

    private void getDataSP(ArrayList<SanPham> listSP) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên SP");
        defaultTableModel.addColumn("Tên NSX");
        defaultTableModel.addColumn("Đơn vị tính");
        defaultTableModel.addColumn("Giá nhập");
        defaultTableModel.addColumn("Giá bán");
        defaultTableModel.addColumn("Số lượng");

        for (SanPham obj : listSP) {
            Vector vector = new Vector();
            vector.add(obj.getMaSanPham());
            vector.add(obj.getTenSP());
            vector.add(obj.getTenNSX());
            vector.add(obj.getDonViTinh());
            vector.add(obj.getGiaNhap());
            vector.add(obj.getGiaBan());
            vector.add(obj.getSoLuong());

            defaultTableModel.addRow(vector);
        }
        tbl_SP.setModel(defaultTableModel);
    }

    public void saveFile() {

        try {
            BufferedWriter bw = null; //Khởi tạo
            FileWriter fw = null; //Khởi tạo
            String data = ""; //Tạo một string data bằng rỗng.
            for (int i = 0; i < listGioHang.size(); i++) {
                String row = ""; //tạo hàng rỗng
                row = row + listGioHang.get(i).getMaHD() + "\t";
                row = row + listGioHang.get(i).getMaNV() + "\t";
                row = row + listGioHang.get(i).getMaKH() + "\t";
                row = row + listGioHang.get(i).getMaSP() + "\t";
                row = row + listGioHang.get(i).getSoLuong() + "\t";
                row = row + listGioHang.get(i).getDonGia() + "\t";
                row = row + listGioHang.get(i).getThanhTien() + "\t";
                row = row + listGioHang.get(i).getNgayBan() + "\n";
                data += row;
            }
            fw = new FileWriter("hoadon.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(frmNhanVienTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadGioHang(ArrayList<HoaDon> listHD) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên SP");
        defaultTableModel.addColumn("Đơn vị tính");
        defaultTableModel.addColumn("Số lượng mua");
        defaultTableModel.addColumn("Đơn giá");
        defaultTableModel.addColumn("Thành tiền");

        for (HoaDon hd : listHD) {
            frmBanHang frmBanHang = new frmBanHang();
            SanPham sp = frmBanHang.getSPbyCode(hd.getMaSP());
            Vector vector = new Vector();
            vector.add(hd.getMaSP());
            vector.add(sp.getTenSP());
            vector.add(sp.getDonViTinh());
            vector.add(formatter.format(hd.getSoLuong()));
            vector.add(formatter.format(hd.getDonGia()));
            vector.add(formatter.format(hd.getThanhTien()));

            defaultTableModel.addRow(vector);
        }
        tbl_gioHang.setModel(defaultTableModel);
        if (listHD.size() > 0) {
            btn_thanhToan.setEnabled(true);
        } else {
            btn_thanhToan.setEnabled(false);
        }
    }

    public SanPham getSPbyCode(String maSP) {
        ArrayList<SanPham> listSP = LoadSP();
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSanPham())) {
                return listSP.get(i);
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_KhachHang = new javax.swing.JPanel();
        txt_timKiemKH = new javax.swing.JTextField();
        btn_timKiemKH = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_KH = new javax.swing.JTable();
        pnl_nhanVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SP = new javax.swing.JTable();
        txt_timKiemSP = new javax.swing.JTextField();
        btn_timKiemSP = new javax.swing.JButton();
        pnl_thongTinHoaDon = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_diaChi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_gioHang = new javax.swing.JTable();
        btn_xoaSP = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_maKH = new javax.swing.JLabel();
        lbl_gioiTinh = new javax.swing.JLabel();
        lbl_sdt = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_hoTen = new javax.swing.JLabel();
        lbl_tongTien = new javax.swing.JLabel();
        btn_thanhToan = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        btn_themSP = new javax.swing.JButton();
        txt_soLuongSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(877, 527));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LimaFruits");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HÓA ĐƠN BÁN HÀNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(174, 174, 174)
                .addComponent(jLabel2)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 877, 53);

        pnl_KhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách Hàng"));
        pnl_KhachHang.setToolTipText("");

        btn_timKiemKH.setText("Tìm Kiếm");
        btn_timKiemKH.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_timKiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemKHActionPerformed(evt);
            }
        });

        tbl_KH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_KH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_KHMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_KH);

        javax.swing.GroupLayout pnl_KhachHangLayout = new javax.swing.GroupLayout(pnl_KhachHang);
        pnl_KhachHang.setLayout(pnl_KhachHangLayout);
        pnl_KhachHangLayout.setHorizontalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_timKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnl_KhachHangLayout.setVerticalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_timKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_timKiemKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        add(pnl_KhachHang);
        pnl_KhachHang.setBounds(20, 60, 380, 182);

        pnl_nhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản Phẩm"));

        tbl_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SP);

        btn_timKiemSP.setText("Tìm Kiếm");
        btn_timKiemSP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_timKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_nhanVienLayout = new javax.swing.GroupLayout(pnl_nhanVien);
        pnl_nhanVien.setLayout(pnl_nhanVienLayout);
        pnl_nhanVienLayout.setHorizontalGroup(
            pnl_nhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_nhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnl_nhanVienLayout.setVerticalGroup(
            pnl_nhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_nhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_timKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiemSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        add(pnl_nhanVien);
        pnl_nhanVien.setBounds(20, 250, 380, 182);
        pnl_nhanVien.getAccessibleContext().setAccessibleName("Nhân Viên");

        pnl_thongTinHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Hóa Đơn"));

        jLabel5.setText("Mã Khách Hàng: ");

        jLabel6.setText("Số điện thoại: ");

        lbl_diaChi.setText("Giới tính");

        jLabel8.setText("Email: ");

        jLabel10.setText("Họ và Tên: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Giỏ Hàng: ");

        tbl_gioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_gioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_gioHang);

        btn_xoaSP.setText("Xóa khỏi giỏ hàng");
        btn_xoaSP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_xoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaSPActionPerformed(evt);
            }
        });

        jLabel11.setText("Tổng tiền: ");

        jLabel12.setText("(VND)");

        lbl_maKH.setText("...");

        lbl_gioiTinh.setText("...");

        lbl_sdt.setText("...");

        lbl_email.setText("...");

        lbl_hoTen.setText("...");

        lbl_tongTien.setText("...");

        javax.swing.GroupLayout pnl_thongTinHoaDonLayout = new javax.swing.GroupLayout(pnl_thongTinHoaDon);
        pnl_thongTinHoaDon.setLayout(pnl_thongTinHoaDonLayout);
        pnl_thongTinHoaDonLayout.setHorizontalGroup(
            pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                        .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_sdt)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_thongTinHoaDonLayout.createSequentialGroup()
                                        .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(lbl_diaChi))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_gioiTinh)
                                            .addComponent(lbl_maKH))
                                        .addGap(88, 88, 88)))
                                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_thongTinHoaDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_xoaSP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_thongTinHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_tongTien)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel12)))))
                .addContainerGap())
        );
        pnl_thongTinHoaDonLayout.setVerticalGroup(
            pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(lbl_maKH)
                    .addComponent(lbl_hoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(lbl_email)
                    .addComponent(lbl_sdt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_diaChi)
                    .addComponent(lbl_gioiTinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoaSP)
                .addGap(18, 18, 18)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(lbl_tongTien))
                .addGap(26, 26, 26))
        );

        add(pnl_thongTinHoaDon);
        pnl_thongTinHoaDon.setBounds(410, 60, 452, 349);

        btn_thanhToan.setText("Thanh Toán");
        btn_thanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });
        add(btn_thanhToan);
        btn_thanhToan.setBounds(480, 440, 122, 37);

        btn_thoat.setText("Thoát");
        btn_thoat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        add(btn_thoat);
        btn_thoat.setBounds(720, 440, 74, 37);

        btn_themSP.setText("Thêm vào giỏ hàng");
        btn_themSP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_themSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themSPActionPerformed(evt);
            }
        });
        add(btn_themSP);
        btn_themSP.setBounds(230, 450, 143, 25);

        txt_soLuongSP.setText("0");
        txt_soLuongSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soLuongSPActionPerformed(evt);
            }
        });
        add(txt_soLuongSP);
        txt_soLuongSP.setBounds(110, 450, 75, 22);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Số lượng: ");
        add(jLabel4);
        jLabel4.setBounds(40, 450, 60, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hinh-nen-trai-cay-dep-7.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-9, 46, 910, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed
        if (kh.getMaKhachHang() == null || kh.getMaKhachHang().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng trước!");
            return;
        } else {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
            String maHD = kh.getMaKhachHang() + "-" + sdf.format(date);
            for (int i = 0; i < listGioHang.size(); i++) {
                HoaDon hd = listGioHang.get(i);
                hd.setMaHD(maHD);
                hd.setMaKH(kh.getMaKhachHang());
                hd.setMaNV(frmlogin.maNVlogin);
                hd.setNgayBan(sdf2.format(date));
                listGioHang.set(i, hd);
            }
            JTextField txtSoTien = new JTextField(10);
            JPanel myPanel = new JPanel();
            myPanel.add(Box.createHorizontalStrut(10));
            myPanel.add(new JLabel("Số tiền khách đưa: "));
            myPanel.add(txtSoTien);
            int result = JOptionPane.showConfirmDialog(null, myPanel, "Số tiền khách thanh toán", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                double soTienKhachDua = Double.parseDouble(txtSoTien.getText());
                if (!validate.checkNumber(txtSoTien.getText())) {
                    JOptionPane.showMessageDialog(this, "Số tiền nhập vào không được chứa ký tự đặc biệt!");
                    return;
                }
                if (soTienKhachDua < tongTien) {
                    JOptionPane.showMessageDialog(this, "Số tiền khách trả chưa đủ!");
                    return;
                } else if (soTienKhachDua > tongTien) {
                    JOptionPane.showMessageDialog(this, "Nhân viên trả lại cho khách " + (soTienKhachDua - tongTien) + "đ.");
                }
                saveFile();
                JOptionPane.showMessageDialog(this, "Thanh toán thành công!");
                frmSanPham frmSP = new frmSanPham();
                frmSP.loadFile();
                for (int i = 0; i < listGioHang.size(); i++) {
                    updateSoLuong(listGioHang.get(i).getMaSP(), listGioHang.get(i).getSoLuong(), frmSP.listSP);
                }
                frmSP.saveFile();
                sendhdToEmail(listGioHang, kh.getEmail(), String.valueOf(tongTien));
                listGioHang = new ArrayList<>();
                reset();
            }
        }

    }//GEN-LAST:event_btn_thanhToanActionPerformed

    public void sendhdToEmail(ArrayList<HoaDon> list, String mail, String sum) {
        try {
            Email email = new SimpleEmail();

            // Cấu hình thông tin Email Server
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("LinhVu03031999@gmail.com", "Toitaigioi1999"));

            // Với gmail cái này là bắt buộc.
            email.setSSLOnConnect(true);

            // Người gửi
            email.setFrom("LinhVu03031999@gmail.com", "Hệ thống quản lý bán hàng");

            // Tiêu đề
            email.setSubject("HÓA ĐƠN MUA HÀNG TẠI CỬA HÀNG LIMA FRUITS"); //Tiêu đề khi gửi email

            // Nội dung email
            String tt = "";
            tt = tt + "                                                                                ---------- THÔNG TIN HÓA ĐƠN MUA HÀNG ------------- \n\n";
            for (int i = 0; i < list.size(); i++) {
                tt = tt + "Mã sản phẩm: " + list.get(i).getMaSP().toUpperCase() + "\t\t\t Số lượng: " + list.get(i).getSoLuong() + "\t\t\t Đơn giá: " + list.get(i).getDonGia() + "\n";
            }

            email.setMsg(tt + "TỔNG TIỀN SẢN PHẨM (ĐÃ BAO GỒM THUẾ VAT VÀ CHIẾT KHẤU SẢN PHẨM): " + sum + " VNĐ\n\n"
                    + "Cảm ơn quý khách đã mua hàng tại hệ thống cửa hàng của chúng tôi! \n\n"
                    + "Trân trọng cảm ơn!"); //Nội dung email bạn muốn gửi.
            // Người nhận
            email.addTo(mail); //Đia chỉ email người nhận
            email.send(); //Thực hiện gửi.
        } catch (EmailException ex) {
            System.err.println("==> GỬI KHÔNG THÀNH CÔNG!");
        }
    }

    public void updateSoLuong(String maSP, int soLuongMua, ArrayList<SanPham> listSP) {
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSanPham())) {
                SanPham sp = listSP.get(i);
                int soLuong = Integer.parseInt(sp.getSoLuong());
                sp.setSoLuong(String.valueOf(soLuong - soLuongMua));
                listSP.set(i, sp);
            }
        }
    }
    private void txt_soLuongSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soLuongSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_soLuongSPActionPerformed

    private void btn_xoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaSPActionPerformed
        double tienGiam;
        for (int i = 0; i < listGioHang.size(); i++) {
            if (maSP.equals(listGioHang.get(i).getMaSP())) {
                tienGiam = listGioHang.get(i).getThanhTien();
                listGioHang.remove(i);
                tongTien = tongTien - tienGiam;
                lbl_tongTien.setText(String.valueOf(tongTien));
            }
        }
        loadGioHang(listGioHang);
    }//GEN-LAST:event_btn_xoaSPActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        btn_xoaSPActionPerformed(evt);
        reset();
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void tbl_KHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KHMouseClicked
        int row = tbl_KH.getSelectedRow();
        String maKH = tbl_KH.getValueAt(row, 0).toString();
        ArrayList<KhachHang> listKH = LoadKH();
        for (int i = 0; i < listKH.size(); i++) {
            if (maKH.equals(listKH.get(i).getMaKhachHang())) {
                kh = listKH.get(i);
                index = i;
                break;
            }
        }
        lbl_maKH.setText(kh.getMaKhachHang());
        lbl_sdt.setText(kh.getSoDienThoai());
        lbl_gioiTinh.setText(kh.getGioiTinh());
        lbl_hoTen.setText(kh.getHoTen());
        lbl_email.setText(kh.getEmail());
    }//GEN-LAST:event_tbl_KHMouseClicked

    private void tbl_SPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SPMouseClicked
        int row = tbl_SP.getSelectedRow();
        String maSP = tbl_SP.getValueAt(row, 0).toString();
        ArrayList<SanPham> listSP = LoadSP();
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSanPham())) {
                sp = listSP.get(i);
                index = i;
                break;
            }
        }
        txt_soLuongSP.setText("1");
    }//GEN-LAST:event_tbl_SPMouseClicked
    double tongTien;
    private void btn_themSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themSPActionPerformed
        int soLuongMua = Integer.parseInt(txt_soLuongSP.getText());
        if (soLuongMua <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm phải lớn hơn 0!");
        } else if (soLuongMua > Integer.parseInt(sp.getSoLuong())) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm vượt quá số lượng hiện có trong kho!");
        } else {
            HoaDon hd = new HoaDon();
            hd.setMaSP(sp.getMaSanPham());
            hd.setSoLuong(soLuongMua);
            hd.setDonGia(Double.parseDouble(sp.getGiaBan()));
            hd.setThanhTien(soLuongMua * Double.parseDouble(sp.getGiaBan()));
            if (checkSPExistGioHang(hd.getMaSP(), listGioHang)) {
                HoaDon hoaDon = listGioHang.get(indexMaSPTrungTrongGioHang);
                hoaDon.setSoLuong(Integer.parseInt(txt_soLuongSP.getText()) + hoaDon.getSoLuong());
                listGioHang.set(indexMaSPTrungTrongGioHang, hoaDon);
            } else {
                listGioHang.add(hd);
            }
            loadGioHang(listGioHang);
            JOptionPane.showMessageDialog(this, "Thêm vào giỏ hàng thành công!");
            tongTien = 0;
            for (int i = 0; i < listGioHang.size(); i++) {
                tongTien += listGioHang.get(i).getThanhTien();
            }
            lbl_tongTien.setText(formatter.format(tongTien));
        }
    }//GEN-LAST:event_btn_themSPActionPerformed
    int indexMaSPTrungTrongGioHang;

    public boolean checkSPExistGioHang(String maSP, ArrayList<HoaDon> listHD) {
        for (int i = 0; i < listHD.size(); i++) {
            if (maSP.equals(listHD.get(i).getMaSP())) {
                indexMaSPTrungTrongGioHang = i;
                return true;
            }
        }
        return false;
    }
    String maSP;
    private void tbl_gioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gioHangMouseClicked
        int row = tbl_gioHang.getSelectedRow();
        maSP = tbl_gioHang.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tbl_gioHangMouseClicked

    private void btn_timKiemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemKHActionPerformed
        ArrayList<KhachHang> listKH = LoadKH();
        String tuKhoa = txt_timKiemKH.getText();
        if (tuKhoa.equals("")) {
            getDataKH(listKH);
        } else {
            ArrayList<KhachHang> listKH_Search = new ArrayList<>();
            for (int i = 0; i < listKH.size(); i++) {
                if ((listKH.get(i).getHoTen().contains(tuKhoa)) || (listKH.get(i).getEmail().contains(tuKhoa)) || (listKH.get(i).getMaKhachHang().contains(tuKhoa))) {
                    listKH_Search.add(listKH.get(i));
                }
            }

            getDataKH(listKH_Search);
            if (listKH_Search.size() == 0) {
                JOptionPane.showMessageDialog(this, "Nhân viên cần tìm không tồn tại!");
                reset();
                getDataKH(listKH);
            }
        }
    }//GEN-LAST:event_btn_timKiemKHActionPerformed

    private void btn_timKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemSPActionPerformed
        ArrayList<SanPham> listSP = LoadSP();
        String tuKhoa = txt_timKiemKH.getText();
        if (tuKhoa.equals("")) {
            getDataSP(listSP);
        } else {
            ArrayList<SanPham> listSP_Search = new ArrayList<>();
            for (int i = 0; i < listSP.size(); i++) {
                if ((listSP.get(i).getTenSP().contains(tuKhoa)) || (listSP.get(i).getTenNSX().contains(tuKhoa)) || (listSP.get(i).getMaSanPham().contains(tuKhoa))) {
                    listSP_Search.add(listSP.get(i));
                }
            }

            getDataSP(listSP_Search);
            if (listSP_Search.size() == 0) {
                JOptionPane.showMessageDialog(this, "Nhân viên cần tìm không tồn tại!");
                reset();
                getDataSP(listSP);
            }
        }
    }//GEN-LAST:event_btn_timKiemSPActionPerformed

    public void reset() {
        getDataKH(LoadKH());
        getDataSP(LoadSP());
        loadGioHang(listGioHang);
        lbl_maKH.setText("...");
        lbl_hoTen.setText("...");
        lbl_sdt.setText("...");
        lbl_gioiTinh.setText("...");
        lbl_email.setText("...");
        tongTien = 0;
        lbl_tongTien.setText("...");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JButton btn_themSP;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timKiemKH;
    private javax.swing.JButton btn_timKiemSP;
    private javax.swing.JButton btn_xoaSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_diaChi;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_gioiTinh;
    private javax.swing.JLabel lbl_hoTen;
    private javax.swing.JLabel lbl_maKH;
    private javax.swing.JLabel lbl_sdt;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JPanel pnl_KhachHang;
    private javax.swing.JPanel pnl_nhanVien;
    private javax.swing.JPanel pnl_thongTinHoaDon;
    private javax.swing.JTable tbl_KH;
    private javax.swing.JTable tbl_SP;
    private javax.swing.JTable tbl_gioHang;
    private javax.swing.JTextField txt_soLuongSP;
    private javax.swing.JTextField txt_timKiemKH;
    private javax.swing.JTextField txt_timKiemSP;
    // End of variables declaration//GEN-END:variables

}

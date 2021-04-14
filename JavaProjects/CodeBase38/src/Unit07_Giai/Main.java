/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_Giai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linh
 */
public class Main {

    private static boolean flagTK = false;
    static ArrayList<NhanVien> listNV = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    |            HỆ THỐNG QUẢN LÝ NHÂN VIÊN             |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    | [1] |   Xem danh sách toàn bộ nhân viên           |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    | [2] |   Thêm mới một nhân viên                    |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    | [3] |   Xóa thông tin nhân viên                   |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    | [4] |   Sửa thông tin nhân viên                   |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    | [5] |   Tìm kiếm nhân viên theo MSNV/SĐT/EMAIL    |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.println("    | [6] |   Thoát                                     |");
            System.out.println("    +-----+---------------------------------------------+");
            System.out.print("    Mời bạn chọn chức năng: ");
            chon = sc.nextInt();
            System.out.println("");
            switch (chon) {
                case 1: {
                    docFileNV();
                    xemDS(listNV);
                    break;
                }
                case 2: {
                    docFileNV();
                    themNV();
                    break;
                }
                case 3: {
                    docFileNV();
                    xoaNV();
                    break;
                }
                case 4: {
                    docFileNV();
                    suaNV();
                    break;
                }
                case 5: {
                    docFileNV();
                    flagTK = true;
                    xemDS(timKiemTheoTuKhoa());
                    flagTK = false;
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.err.println("==>> BẠN CHỌN SAI CHỨC NĂNG !");
                }
                System.out.println("");
            }
        } while (chon != 6);
    }

    public static void docFileNV() {
        try {
            FileReader fr = new FileReader("NhanVien.txt");
            BufferedReader br = new BufferedReader(fr);
            listNV = new ArrayList<>();
            String info = null;
            try {
                while ((info = br.readLine()) != null) {
                    String chiaTT[] = info.split("\t");
                    NhanVien nv = new NhanVien();
                    if (chiaTT.length == 1) {
                        return;
                    }
                    nv.setID(chiaTT[0]);
                    nv.setHoTen(chiaTT[1]);
                    nv.setSdt(chiaTT[2]);
                    nv.setEmail(chiaTT[3]);
                    nv.setGioiTinh(chiaTT[4]);
                    nv.setNamSinh(chiaTT[5]);
                    nv.setQueQuan(chiaTT[6]);
                    listNV.add(nv);

                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class
                        .getName()).log(Level.SEVERE, null, ex);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ghiFileNV() {
        try {
            String data = "";
            for (int i = 0; i < listNV.size(); i++) {
                data += listNV.get(i).getID().toUpperCase() + "\t";
                data += listNV.get(i).getHoTen() + "\t";
                data += listNV.get(i).getSdt() + "\t";
                data += listNV.get(i).getEmail() + "\t";
                data += listNV.get(i).getGioiTinh() + "\t";
                data += listNV.get(i).getNamSinh() + "\t";
                data += listNV.get(i).getQueQuan() + "\n";
            }
            FileWriter fw = new FileWriter("NhanVien.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void xemDS(ArrayList<NhanVien> list) {
        if (flagTK == true && list.isEmpty()) {
            System.err.println("==>> KHÔNG TÌM THẤY TỪ KHÓA TRONG DANH SÁCH NHÂN VIÊN !");
            return;
        }
        if (list.isEmpty()) {
            System.err.println("==>> CHƯA CÓ NHÂN VIÊN NÀO TRONG DANH SÁCH !");
        } else {
            if (flagTK == true) {
                System.out.println("==>> KẾT QUẢ TÌM KIẾM :");
            }
            System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                                          DANH SÁCH THÔNG TIN NHÂN VIÊN                                                             |");
            System.out.println("+-------+-----------+--------------------------+-----------------+---------------------------------------+-------------+------------+----------------+");
            System.out.println("|  STT  |   MÃ NV   |        HỌ VÀ TÊN         |       SĐT       |                 EMAIL                 |  GIỚI TÍNH  |  NĂM SINH  |    QUÊ QUÁN    |");
            System.out.println("+-------+-----------+--------------------------+-----------------+---------------------------------------+-------------+------------+----------------+");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("|%7d|%11s|%26s|%17s|%39s|%13s|%12s|%16s|\n", (i + 1), listNV.get(i).getID(), listNV.get(i).getHoTen(), listNV.get(i).getSdt(), listNV.get(i).getEmail(), listNV.get(i).getGioiTinh(), listNV.get(i).getNamSinh(), listNV.get(i).getQueQuan());
            }
            System.out.println("+-------+-----------+--------------------------+-----------------+---------------------------------------+-------------+------------+----------------+");
            System.out.println("");
        }
    }

    public static boolean kiemTraMaNV(String ma) {
        boolean flag = false;
        for (int i = 0; i < listNV.size(); i++) {
            if (ma.equalsIgnoreCase(listNV.get(i).getID())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void themNV() {
        NhanVien nv = new NhanVien();
        Scanner input = new Scanner(System.in);
        System.out.println("NHẬP THÔNG TIN ĐỂ THÊM MỚI NHÂN VIÊN");
        System.out.println("");
        do {
            System.out.print("Mã nhân viên: ");
            nv.setID(input.nextLine());
            if ("".equals(nv.getID())) {
                System.err.println("Mã nhân viên không được bỏ trống !");
            }
        } while ("".equals(nv.getID()));
        if (kiemTraMaNV(nv.getID())) {
            System.err.println("==>> MÃ NHÂN VIÊN ĐÃ TỒN TẠI !");
            return;
        } else {
            System.out.print("Tên nhân viên: ");
            nv.setHoTen(input.nextLine());
            System.out.print("Nhập SĐT nhân viên: ");
            nv.setSdt(input.nextLine());

            System.out.print("Nhập Email nhân viên: ");
            nv.setEmail(input.nextLine());

            System.out.print("Nhập giới tính nhân viên: ");
            nv.setGioiTinh(input.nextLine());

            System.out.print("Nhập năm sinh nhân viên: ");
            nv.setNamSinh(input.nextLine());

            System.out.print("Nhập quê quán nhân viên: ");
            nv.setQueQuan(input.nextLine());
        }
        listNV.add(nv);
        ghiFileNV();
        System.err.println("==>> THÊM MỚI NHÂN VIÊN THÀNH CÔNG !");
        System.out.println("");
    }

    private static int chiSo;

    public static NhanVien timNV(String ma) {
        for (int i = 0; i < listNV.size(); i++) {
            if (ma.equalsIgnoreCase(listNV.get(i).getID())) {
                chiSo = i;
                return listNV.get(i);
            }
        }
        return null;
    }

    public static void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập mã nhân viên cần xóa: ");
        String ma = sc.nextLine();
        NhanVien nv = timNV(ma);
        if (nv == null) {
            System.err.println("==>> NHÂN VIÊN BẠN VỪA NHẬP KHÔNG TỒN TẠI TRONG HỆ THỐNG !");
        } else {
            listNV.remove(nv);
            System.out.println("");
            System.err.println("==>> XÓA THÀNH CÔNG NHÂN VIÊN CÓ MÃ " + nv.getID());
            ghiFileNV();
        }
    }

    public static void suaNV() {
        Scanner input = new Scanner(System.in);
        NhanVien nv;
        do {
            System.out.print("Mời bạn nhập mã nhân viên cần sửa: ");
            String maNV = input.nextLine();
            nv = timNV(maNV);
            if (nv == null) {
                System.err.println("Mã nhân viên bạn vừa nhập không tồn tại !");
                System.out.println("Vui lòng thử lại ... ");
            }
        } while (nv == null);
        if (nv != null) {
            System.out.print("Tên nhân viên: ");
            nv.setHoTen(input.nextLine());

            System.out.print("Nhập SĐT nhân viên: ");
            nv.setSdt(input.nextLine());

            System.out.print("Nhập Email nhân viên: ");
            nv.setEmail(input.nextLine());

            System.out.print("Nhập giới tính nhân viên: ");
            nv.setGioiTinh(input.nextLine());

            System.out.print("Nhập năm sinh nhân viên: ");
            nv.setNamSinh(input.nextLine());

            System.out.print("Nhập quê quán nhân viên: ");
            nv.setQueQuan(input.nextLine());
            listNV.set(chiSo, nv);
            ghiFileNV();
            System.err.println("==>> CẬP NHẬT THÔNG TIN CỦA NHÂN VIÊN THÀNH CÔNG !");
            System.out.println("");
        }
    }

    public static ArrayList<NhanVien> timKiemTheoTuKhoa() {
        ArrayList<NhanVien> listNVTimKiem = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào thông tin nhân viên cần tìm: ");
        String input = sc.nextLine();
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getID().contains(input) || listNV.get(i).getSdt().contains(input) || listNV.get(i).getEmail().contains(input)) {
                listNVTimKiem.add(listNV.get(i));
            }
        }
        return listNVTimKiem;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

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

    private static boolean flagTk = false;
    static ArrayList<NhanVien> listNV = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("---------------------------------------Quản lý nhân viên-----------------------------------");
            System.out.println("1 - Xem thông tin nhân viên.");
            System.out.println("2 - Thêm thông tin nhân viên.");
            System.out.println("3 - Xóa thông tin nhân viên.");
            System.out.println("4 - Sửa thông tin nhân viên.");
            System.out.println("5 - Tìm kiếm nhân viên theo MSNV/Email/SDT.");
            System.out.println("6 - Thoát.");
            System.out.println("Bạn muốn chọn: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);
                    break;
                default: {
                    System.out.println("==>> BẠN CHỌN SAI CHỨC NĂNG.");
                }
                System.out.println("");
            }
        } while (chon != 6);

    }

    public static void docFile() {
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
                    nv.setHoVaTen(chiaTT[1]);
                    nv.setSdt(chiaTT[2]);
                    nv.setEmail(chiaTT[3]);
                    nv.setGioiTinh(chiaTT[4]);
                    nv.setNamSinh(chiaTT[5]);
                    nv.setQueQuan(chiaTT[6]);
                    listNV.add(nv);
                }

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ghiFile() {
        FileWriter fw = null;
        try {
            String data = "";
            for (int i = 0; i < listNV.size(); i++) {
                data += listNV.get(i).getID().toUpperCase() + "\t";
                data += listNV.get(i).getHoVaTen() + "\t";
                data += listNV.get(i).getSdt()+ "\t";
                data += listNV.get(i).getGioiTinh()+ "\t";
                data += listNV.get(i).getEmail()+ "\t";
                data += listNV.get(i).getNamSinh()+ "\t";
                data += listNV.get(i).getQueQuan()+ "\n";
            }   
            fw = new FileWriter("NhanVien.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void xemDS(ArrayList<NhanVien> list){
        if( flagTk = true && list.isEmpty()){
            System.out.println("==>> KHÔNG TÌM THẤY TỪ KHÓA TRONG DANH SÁCH NHÂN VIÊN.");
            return;
        }
        if(list.isEmpty()){
            System.out.println("==>> CHƯA CÓ NHÂN VIÊN NÀY TRONG DANH SÁCH.");
        } else{
            if(flagTk = true){
                System.out.println("==>> KẾT QUẢ TÌM KIẾM: ");
            }
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("-----------------DANH SACH NHAN VIEN -------------------------------------");
            System.out.println(" STT | MA NHAN VIEN |   HO VA TEN   |    SDT   |    EMAIL          |      GIOI TINH   |    NAM SINH   |   QUE QUAN   ");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%5s|%14s|%15s|%10s|%19s|%18s|%15s|%14s",(i+1), list.get(i).getID(),list.get(i).getHoVaTen(),list.get(i).getSdt(),list.get(i).getEmail(),list.get(i).getGioiTinh(),list.get(i).getNamSinh(),list.get(i).getQueQuan());
            }
        }
    }
    public static boolean kiemTraMaNV(String ma){
        boolean flag = false;
        for (int i = 0; i < listNV.size(); i++) {
            if( ma.equalsIgnoreCase(listNV.get(i).getID())){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void themNV(){
        
    }
    private static int chiSo;
    public static NhanVien timNV( String ma){
        return null;
    }
    public static void xoaNV(){
        
    }
    public static void suaNV(){
        
    }
    public static ArrayList<NhanVien> timTheoTuKhoa(){
        ArrayList<NhanVien> listNVTimKiem = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào thông tin nhân viên cần tìm: ");
        String input = sc.nextLine();
        for (int i = 0; i < listNV.size(); i++) {
            if(listNV.get(i).getID().contains(input)||listNV.get(i).getSdt().contains(input)|| listNV.get(i).getEmail().contains(input)){
                listNVTimKiem.add(listNV.get(i));
            }
        }
        return listNVTimKiem;
    }
}

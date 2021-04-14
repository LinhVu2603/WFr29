/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class NhanVien {

    private String ID;
    private String hoVaTen;
    private String sdt;
    private String email;
    private String gioiTinh;
    private String namSinh;
    private String queQuan;

    public NhanVien() {
        
    }

    public NhanVien(String ID, String hoVaTen, String sdt, String email, String gioiTinh, String namSinh, String queQuan) {
        this.ID = ID;
        this.hoVaTen = hoVaTen;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thông tin nhân viên: ");
        System.out.print("ID: ");
        ID = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        hoVaTen = sc.nextLine();
        System.out.print("Số điện thoại: ");
        sdt = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.print("Năm sinh: ");
        namSinh = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Quê quán: ");
        queQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        return this.ID + " - " + this.hoVaTen + " - " + this.namSinh;
    }

}

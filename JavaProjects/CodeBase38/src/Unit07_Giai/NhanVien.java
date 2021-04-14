/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_Giai;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class NhanVien {

    private String ID;
    private String hoTen;
    private String sdt;
    private String email;
    private String gioiTinh;
    private String namSinh;
    private String queQuan;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public NhanVien() {
    }

    public NhanVien(String ID, String hoTen, String sdt, String email, String gioiTinh, String namSinh, String queQuan) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        ID = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap SDT: ");
        sdt = sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        return ID + " - " + hoTen + " - " + namSinh;
    }
}
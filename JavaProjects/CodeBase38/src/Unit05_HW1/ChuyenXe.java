/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW1;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class ChuyenXe {

    private String maChuyen;
    private String tenTaiXe;
    private int soXe;
    private int doanhThu;

    public String getMaChuyen() {
        return maChuyen;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma chuyen xe: ");
        maChuyen = sc.nextLine();
        System.out.println("Ten tai xe: ");
        tenTaiXe = sc.nextLine();
        System.out.println("So Xe: ");
        soXe = sc.nextInt();
        System.out.println("Doanh thu: ");
        doanhThu = sc.nextInt();
    }

    public void inTT() {
        System.out.println("Ma chuyen xe: " + maChuyen);
        System.out.println("Ten tai xe: " + tenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("Doanh thu: " + doanhThu);
    }
}

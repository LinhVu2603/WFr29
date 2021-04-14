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
public class xeNgoaiThanh extends ChuyenXe {

    private String noiDen;
    private int soNgayDi;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public xeNgoaiThanh() {

    }

    public xeNgoaiThanh(String noiDen, int soNgayDi) {
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.println("Noi den: ");
        noiDen = sc.nextLine();
        System.out.println("So ngay di duoc: ");
        soNgayDi = sc.nextInt();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Noi den " + noiDen);
        System.out.println("So ngay di duoc: " + soNgayDi);
    }
}

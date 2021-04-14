/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class SV {

    private String hoTen;
    private int ma;
    private String lop  ;
    private String truong;
        private String que;

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getma() {
        return ma;
    }

    public void setma(int ma) {
        this.ma = ma;
    }

    public String getlop() {
        return lop;
    }

    public void setlop(String lop) {
        this.lop = lop;
    }

    public String gettruong() {
        return truong;
    }

    public void settruong(String truong) {
        this.truong = truong;
    }

    public String getque() {
        return que;
    }

    public void setString(String string) {
        this.que = que;
    }

    public SV() {

    }

    public SV(String hoTen, int ma, String lop, String truong, String que) {
        this.hoTen = hoTen;
        this.ma = ma;
        this.lop = lop;
        this.truong = truong;
        this.que = que;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sinh Vien: ");
        hoTen = sc.nextLine();
        System.out.println("ma: ");
        ma = sc.nextInt();
        System.out.println("lop: ");
        lop = sc.nextLine();
        System.out.println("truong: ");
        truong = sc.nextLine();
        System.out.println("que: ");
        que = sc.nextLine();
    }

    public void inTT() {
        System.out.println("Sinh Vien: "+hoTen);
        System.out.println("ma: "+ma);
        System.out.println("lop: "+lop);
        System.out.println("Sinh Vien: ");
        System.out.println("Sinh Vien: ");
    }
}

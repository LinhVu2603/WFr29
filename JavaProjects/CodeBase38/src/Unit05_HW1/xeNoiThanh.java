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
public class xeNoiThanh extends ChuyenXe {

    private int soTuyen;
    private int soKmDi;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDi() {
        return soKmDi;
    }

    public void setSoKmDi(int soKmDi) {
        this.soKmDi = soKmDi;
    }

    public xeNoiThanh() {

    }

    public xeNoiThanh(int soTuyen, int soKmDi) {
        this.soTuyen = soTuyen;
        this.soKmDi = soKmDi;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.println("So Tuyen: " );
        soTuyen = sc.nextInt();
        System.out.println("So km di duoc: ");
        soKmDi = sc.nextInt();
    }

    public void inTT() {
        super.inTT();
        System.out.println("So Tuyen " + soTuyen);
        System.out.println("So km di duoc: " + soKmDi);
    }

}

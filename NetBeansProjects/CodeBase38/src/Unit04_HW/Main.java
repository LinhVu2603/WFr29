/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

/**
 *
 * @author Linh
 */
public class Main {

    public static void main(String[] args) {
        SV[] SinhViens = new SV[10];
        SinhViens[0] = new SV();
        SinhViens[1] = new SV();
        SinhViens[0].nhapTT();
        SinhViens[1].nhapTT();
        System.out.println("------");
        SinhViens[0].inTT();
        SinhViens[1].inTT();
    }
}

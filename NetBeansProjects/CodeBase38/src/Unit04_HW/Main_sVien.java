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
public class Main_sVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien:");
        int n = sc.nextInt();
        SV[] SVs = new SV[n];
        for (int i = 0; i < SVs.length; i++) {
            SVs[i] = new SV();
            SVs[i].nhapTT();
            SVs[i].inTT();
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit03_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: n = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        xuatMang(n, arr);
        System.out.print("\n");
        System.out.println("Phan tu muon xoa la phan tu vi tri = ");
        int pos = sc.nextInt();
        xoaPhanTu(n, pos, arr);
        xuatMang(n, arr);
    }

    public static void xuatMang(int n, int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("\t");
        }
        System.out.print("\n");
    } 

    public static void xoaPhanTu(int n, int pos, int a[]) {
        if (pos < 0) {
            pos = 0;
        } else if (pos >= n) {
            pos = n - 1;
        }
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        --n;
    }
}
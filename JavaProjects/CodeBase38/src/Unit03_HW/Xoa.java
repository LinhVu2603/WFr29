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
public class Xoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        nhapMang(n, arr);
        System.out.print("Phan tu muon xoa la phan tu thu ");
        int pos = sc.nextInt();
        xoaPhanTu(n, arr, pos);
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    public static void nhapMang(int n, int a[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int n, int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("\t");
        }
        System.out.println("\n");
    }

    public static void xoaPhanTu(int n, int a[], int pos) {
        if (pos < 0) {
            pos = 0;
        } else if (pos >= n) {
            pos = n - 1;
        }
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
    }
}

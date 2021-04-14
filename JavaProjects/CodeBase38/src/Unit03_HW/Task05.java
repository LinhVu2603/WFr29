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
public class Task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: n = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arrChan[] = new int[n];
        int arrLe[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        xuatMang(n, arr);
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrChan[j] = arr[i];
                j++;
            } else {
                arrLe[k] = arr[i];
                k++;
            }
        }
        System.out.println("Mang chan la: ");
        xuatMang(n, arrChan);
        System.out.println("Mang le la: ");
        xuatMang(n, arrLe);
    }

    public static void xuatMang(int n, int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("\t");
        }
        System.out.print("\n");
    }
}

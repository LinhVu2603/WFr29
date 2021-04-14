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
public class Task09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
        System.out.print("Nhap vao so phan tu cua mang:");
        n = sc.nextInt();
            if (n < 0) {
                System.out.println("Số lượng thì phải lớn hơn 0!!! ");
            }
        } while (n < 0);
        int arr[] = new int[n];
        if (n <= 0) {
            System.out.println("Mang khong co phan tu nao.");
        } else {
            nhapMang(n, arr);
        }
        int max = arr[0];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                    pos = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat cua mang la phan tu thu " + (pos + 1) + " co gia tri: " + max);
    }

    public static void nhapMang(int n, int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println("Phan tu khong hop le!");
            } else {
            }
        }
    }
}

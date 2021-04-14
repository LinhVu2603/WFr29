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
public class Task10 {

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
        int sum = 0;
        int giaTriTB = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            giaTriTB = sum / (i + 1);
        }
        System.out.println("Gia tri trung binh la " + giaTriTB);
    }

    public static void nhapMang(int n, int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

}

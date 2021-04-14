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
public class Task08 {

    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);

        int arr[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhập vào giá trị phần tử cần kiểm tra: ");
        int number = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == number) {
                count++;
            }
        }

        System.out.println("Số phần tử " + number + " có trong mảng = " + count);
    }

    public static void nhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
    }
}

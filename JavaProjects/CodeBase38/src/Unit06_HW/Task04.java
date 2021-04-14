/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        int first = str.indexOf(" ");
        int last = str.lastIndexOf(" ");
        System.out.println("Họ: " + str.substring(0, first).trim());
        System.out.println("Đệm: " + str.substring(first, last).trim());
        System.out.println("Tên: " + str.substring(last, str.length()).trim());
        str = str.replace(" ", "\t");
        String arr[] = str.split("\t");
        System.out.println("Họ: " + arr[0]);
        System.out.println("Đệm: " + arr[1]);
        System.out.println("Tên: " + arr[2]);
    }
}

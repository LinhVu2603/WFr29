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
public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        int end = str.length();
        System.out.println("Ký tự đầu tiên của chuỗi là: ");
        System.out.println(str.charAt(0));
        System.out.println("Ký tự cuối cùng của chuỗi là: ");
        System.out.println(str.charAt(end - 1));
    }
}

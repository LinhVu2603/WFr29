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
public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        str = str.toLowerCase();
        String arr[] = str.split(" ");
        String st = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1) + " ";
            st = st.concat(arr[i]);
        }
        st = st.trim();
        System.out.println(st);
        st = st.concat(".");
        System.out.println(st);
    }
}

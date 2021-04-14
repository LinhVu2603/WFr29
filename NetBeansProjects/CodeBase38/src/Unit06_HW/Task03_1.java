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
public class Task03_1 {
        public boolean checkplaindrome(String str) {
        if (str.length() < 2) {
            return true;
        } else {
            if (str.charAt(0) != str.charAt(str.length() - 1)) { //so sánh kí tự đầu tiên và kí tự cuối cùng
                return false;
            }
            return checkplaindrome(str.substring(1, str.length() - 1));  //Sau mỗi lần so sánh thì cắt bỏ kí tự đầu cuối đi và tiếp tục so sánh
        }

    }

    public static void main(String[] args) {
        Task03_1 check = new Task03_1();
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi: ");
        str = input.nextLine();
        if (check.checkplaindrome(str) == true) {
            System.out.println("Chuỗi " + str + " là chuỗi plaindrome");
        } else {
            System.out.println("Chuỗi " + str + " là không phải là chuỗi plaindrome");
        }
    }
}

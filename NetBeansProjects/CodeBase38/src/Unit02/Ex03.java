/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Ex03 {

    public static void main(String[] args) {
        int numb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        numb = sc.nextInt();
        switch (numb) {
            case 2: {
                System.out.println("Today is Monday!");
            }
            break;
            case 3: {
                System.out.println("Today is Tuesday!");
            }
            break;
            case 4: {
                System.out.println("Today is Wednesday!");
            }
            break;
            case 5: {
                System.out.println("Today is Thursday!");
            }
            break;
            case 6: {
                System.out.println("Today is Friday!");
            }
            break;
            case 7: {
                System.out.println("Today is Saturday!");
            }
            break;
            case 8: {
                System.out.println("Today is Sunday!");
            }
            break;
            default:
                System.out.println("Khong hop le!");
                break;
        }
    } 
}

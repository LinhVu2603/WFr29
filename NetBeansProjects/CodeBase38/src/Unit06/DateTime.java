/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Linh
 */
public class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        //ICT = Information & Communication Technologies
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH/mm/ss");
        System.out.println(sdf.format(date));
    }
}

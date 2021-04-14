/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04;

/**
 *
 * @author Linh
 */
public class Main {

    public static void main(String[] args) {
        Xe mazda_6 = new Xe("Mazda",2019);
//        mazda_6.setTenXe("Mazda6");
        System.out.println(mazda_6.getTenXe());
        mazda_6.nhapTT();
        System.out.println("---------------");
        mazda_6.inTT();
        mazda_6.chay();
        
//        Xe santaFe = new Xe();
//
//        santaFe.tenXe = "SantaFe";
//        santaFe.hangXe = "Toyota";
//        santaFe.namSX = 2019;
//        santaFe.mauSac = "Do";
//        santaFe.soCho = 7;
//
//        System.out.println("Ten xe:"+santaFe.tenXe);
//        System.out.println("Hang xe:"+santaFe.hangXe);
//        System.out.println("Nam san xuat:"+santaFe.namSX);
//        System.out.println("Mau sac:"+santaFe.mauSac);
//        System.out.println("So cho:"+santaFe.soCho);

    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Xe {

    private String tenXe;
    String hangXe;
    private int namSX;
    String mauSac;
    int soCho;

    public Xe(){
    }
    
    public Xe(String tenXe, int namSX){
        this.tenXe = tenXe;
        this.namSX = namSX;
    }
    
    public String getTenXe(){
        return tenXe;
    }
    
    public void setTenXe(String tenXe){
        this.tenXe = tenXe;
    }
    
    public int getNamSX(){
        return namSX;
    }
    
    public void setNamSX(int namSX){
        this.namSX = namSX;
    }
    public void chay() {
        System.out.println("Day la phuong thuc chay cua xe.");
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên xe:");
        tenXe = sc.nextLine();
        System.out.print("Mời nhập hãng xe:");
        hangXe = sc.nextLine();
        System.out.print("Mời nhập màu xe:");
        mauSac = sc.nextLine();       
        System.out.print("Mời nhập năm sản xuất xe:");
        namSX = sc.nextInt();
        System.out.print("Mời nhập số chỗ xe:");
        soCho = sc.nextInt();
    }

    public void inTT() {
        System.out.println("Ten xe: " + tenXe);
        System.out.println("Hang xe: " + hangXe);
        System.out.println("Nam san xuat xe: " + namSX);
        System.out.println("Mau sac xe: " + mauSac);
        System.out.println("So cho xe: " + soCho);
    }

    void setTenXe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

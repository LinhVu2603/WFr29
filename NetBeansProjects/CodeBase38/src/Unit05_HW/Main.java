/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW;

/**
 *
 * @author Linh
 */
public class Main {

    public static void main(String[] args) {
        Chim boiCa = new Chim();
        Ca map = new Ca();
        MayBay boeing_747 = new MayBay();
        Thuyen thuyenNgam = new Thuyen();
        boiCa.Bay();
        boeing_747.Bay();
        System.out.println("---------");
        boiCa.setthucAn("Thức ăn của bói cá là cá");
        System.out.println(boiCa.getthucAn());
        map.setthucAn("Thức ăn của cá mập là cá bé hơn hoặc thịt.");
        System.out.println(map.getthucAn());
        System.out.println("---------");
        map.Boi();
        thuyenNgam.Boi();
        System.out.println("---------");
        boeing_747.setnhieuLieu("Máy bay hoạt động bằng dầu.");
        System.out.println(boeing_747.getnhienLieu());
        thuyenNgam.setnhieuLieu("Thuyền ngầm hoạt động bằng dầu.");
        System.out.println(thuyenNgam.getnhienLieu());
        System.out.println("---------");
        boiCa.sinhSan();
    }
}

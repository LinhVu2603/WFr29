/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06;


/**
 *
 * @author Linh
 */
public class Ex02 {

    public static void main(String[] args) {
        String s = "Zent Coding School Z 5";
        // Tra ve ki tu tai vi tri truyen vao
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(9));
        // Noi chuoi
        System.out.println(s.concat("!"));
        //Kiem tra chuoi truyen vao co chua trong chuoi goc
        System.out.println(s.contains("Sch"));
        //Kiem tra chuoi bang 100%
        System.out.println(s.equals("zent Coding School"));
        //Kiem tra chuoi bang khong phan viet hoa thuong
        System.out.println(s.equalsIgnoreCase("Zent coding School"));
        // Nhap vao String tra ve vi tri
        System.out.println(s.indexOf("Z"));
        System.out.println(s.indexOf("Z", 5));
        //Cung tra ve vi tri nhung tu sau ve truoc
        System.out.println(s.lastIndexOf("Z"));
        System.out.println(s.lastIndexOf(5));
        //Kiem tra chuoi rong
        System.out.println(s.isEmpty());
        // Lay chieu dai cua chuoi
        System.out.println(s.length());
        //Thay the chuoi goc bang chuoi moi
        System.out.println(s.replace("oding", "O"));
        String str = "    asdkhasd    da    sdasd";
        System.out.println(str.replaceAll("\\s+", " "));
        //Cat chuoi theo 1 dinh dang mong muon
        String info = "Vũ Linh\t0971524178\tHải Phòng";
        String arr[] = info.split("\t");
        System.out.println("Họ tên: " + arr[0]);
        System.out.println("SĐT: " + arr[1]);
        System.out.println("Quê Quán: " + arr[2]);
        //Cat chuoi 
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, 10));
        //viet thuong het
        System.out.println(s.toLowerCase());
        //Viet hoa
        System.out.println(s.toUpperCase());
        //Xóa khoảng trắng đầu cuối
        System.out.println(str.trim());
        
        String S = "Bạn vừa nạp thành công 100.000 VNĐ vào sđt 0971524178";
        int a = S.indexOf("100.000");
        System.out.println(S.substring(a,a+7));
        int b = S.indexOf("thành công ")+"thành công ".length();
        int c = S.indexOf("VNĐ");
        System.out.println(S.substring(b, c).trim().replace(".",""));
        
    }
}

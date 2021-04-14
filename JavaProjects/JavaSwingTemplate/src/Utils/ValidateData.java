/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import GUI.frmNhanVien;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linh
 */
public class ValidateData {

    public boolean kiemTraEmail(String email) {
        String dinhDangEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean ktEmail = email.matches(dinhDangEmail);
        return ktEmail;
    }
    public static boolean checkNumber(String s) 
    {
        for(int i =0 ; i< s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
               return false;
            }
        }
        return true;
    }

    public boolean kiemTraTen(String ten) {
        for (int i = 0; i < 10; i++) {
            if (ten.contains(i + "")) {
                return false;
            }
        }
        return true;
    }

    public String kiemTraSdt(String sdt) {
        sdt = sdt.trim();
        sdt = sdt.replace(".", "");
        sdt = sdt.replace(",", "");
        sdt = sdt.replace(" ", "");
        sdt = sdt.replaceAll("\\s+", "");
        try {
            if(!sdt.startsWith(0+"")){
                return "Số điện thoại phải bắt đầu bằng số 0!";
            } else if(sdt.length()!=10){
                return "Số điện thoại phải có 10 chữ số!";
            } 
            long sdt_long = Long.parseLong(sdt);//Để check điều kiện không chứa chữ cái
        } catch (NumberFormatException ex) {
            return "Số điện thoại không được chứa chữ cái!";
        } catch(Exception ex){
            return "Fail"+ex.getMessage();
        }
        return "Correct!";
    }

    public static String md5(String str) {
        String result = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest.digest());
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}

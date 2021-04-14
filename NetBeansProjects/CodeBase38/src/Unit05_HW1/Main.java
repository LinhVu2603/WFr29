/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW1;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[----------------------------QuanLy---------------------------]");
        System.out.println("[1 - Nhập và in thông tin chuyến xe nội thành.                ]");
        System.out.println("[-------------------------------------------------------------]");
        System.out.println("[2 - Nhập và in chuyến xe ngoại thành.                        ]");
        System.out.println("[-------------------------------------------------------------]");
        System.out.println("[3 - Thoát.                                                   ]");
        System.out.println("[-------------------------------------------------------------]");
        System.out.print("Bạn muốn chọn: ");
        int number = sc.nextInt();
        do {
            switch (number) {
                case 1:
                    int tongSoXeNT;
                    System.out.println("Mời nhập vào tổng số xe: ");
                    tongSoXeNT = sc.nextInt();
                    xeNoiThanh arrXe_NT[] = new xeNoiThanh[tongSoXeNT];
                    for (int i = 0; i < arrXe_NT.length; i++) {
                        arrXe_NT[i] = new xeNoiThanh();
                        System.out.println("Mời bạn nhập thông tin chuyến xe thứ " + (i + 1));
                        arrXe_NT[i].nhapTT();
                    }
                    System.out.println("[--------------------------------------------------------------------------------------------------------]");
                    System.out.println("[                                      Danh Sách Chuyến Xe Nội Thành                                     ]");
                    System.out.println("[--------------------------------------------------------------------------------------------------------]");
                    System.out.println("[ STT |   MS Chuyến   |     Tên tài xế      |    Số xe   |   Số Tuyến  |  Số km đi được  |  Doanh thu  ]");
                    for (int i = 0; i < tongSoXeNT; i++) {
                        System.out.printf("[%5d|%15s|%21s|%12d|%13d|%17d|%13d]\n",i+1, arrXe_NT[i].getMaChuyen(),arrXe_NT[i].getTenTaiXe(),arrXe_NT[i].getSoXe(),arrXe_NT[i].getSoTuyen(), arrXe_NT[i].getSoKmDi(), arrXe_NT[i].getDoanhThu());
                    }
                    System.out.println("[--------------------------------------------------------------------------------------------------------]");
                    int tongDoanhThu = 0;
                    for (int i = 0; i < tongSoXeNT; i++) {
                        tongDoanhThu = tongDoanhThu + arrXe_NT[i].getDoanhThu();
                    }
                    System.out.println("Tổng doanh thu là "+ tongDoanhThu);
                    break;
                case 2:
                    int tongSoXeNgT;
                    System.out.println("Mời nhập vào tổng số xe: ");
                    tongSoXeNgT = sc.nextInt();
                    xeNgoaiThanh arrXe_NgT[] = new xeNgoaiThanh[tongSoXeNgT];
                    for (int i = 0; i < arrXe_NgT.length; i++) {
                        arrXe_NgT[i] = new xeNgoaiThanh();
                        System.out.println("Mời bạn nhập thông tin chuyến xe thứ " + (i + 1));
                        arrXe_NgT[i].nhapTT();
                    }
                    System.out.println("[--------------------------------------------------------------------------------------------------------]");
                    System.out.println("[                                      Danh Sách Chuyến Xe Ngoại Thành                                     ]");
                    System.out.println("[--------------------------------------------------------------------------------------------------------]");
                    System.out.println("[ STT |   MS Chuyến   |     Tên tài xế      |    Số xe   |   Nơi đến  |  Số ngày đi được  |  Doanh thu  ]");
                    for (int i = 0; i < tongSoXeNgT; i++) {
                        System.out.printf("[%5d|%15s|%21s|%12d|%12d|%19d|%13d]\n",i+1, arrXe_NgT[i].getMaChuyen(),arrXe_NgT[i].getTenTaiXe(),arrXe_NgT[i].getSoXe(),arrXe_NgT[i].getNoiDen(), arrXe_NgT[i].getSoNgayDi(), arrXe_NgT[i].getDoanhThu());
                    }
                    System.out.println("[--------------------------------------------------------------------------------------------------------]");
                    int tongDoanhThu1 = 0;
                    for (int i = 0; i < tongSoXeNgT; i++) {
                        tongDoanhThu = tongDoanhThu1 + arrXe_NgT[i].getDoanhThu();
                    }
                    System.out.println("Tổng doanh thu là "+ tongDoanhThu1);
                    break;
                default:
                    
                    System.exit(0);
            }

        } while ((number < 1) && (number > 3));

    }
}

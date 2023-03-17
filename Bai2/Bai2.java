/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai2;



/**
// *
 * @author THIEN
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HocSinh hs = new HocSinh();
        double tinhDiem = hs.tinhDiemTrungBinh();
        System.out.println("Diem trung binh cua hoc sinh : " + tinhDiem );
        HocSinhChuyenToan hs2 = new HocSinhChuyenToan();
        double tinhDiem2 = hs2.tinhDiemTrungBinh();
        System.out.println("Diem trung binh cua hoc sinh chuyen toan : " + tinhDiem2 );

    }
    
}

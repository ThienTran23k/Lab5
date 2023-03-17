/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author THIEN
 */
public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(){

    }
    public HocSinhChuyenToan(String hoTen , String lop , double toan , double ly , double hoa,double diemTrungBinh ){
        super(hoTen,lop,toan,ly,hoa,diemTrungBinh);
    }
    
    @Override
    public double tinhDiemTrungBinh(){
        return (toan *2 + ly + hoa) /4;
    }
}

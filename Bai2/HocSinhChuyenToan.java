package Bai2;

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
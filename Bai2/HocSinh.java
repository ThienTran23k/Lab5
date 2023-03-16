package Bai2;

public class HocSinh {
    public String hoTen;
    public String lop ;
    public double toan;
    public double ly;
    public double hoa ;
    public double diemTrungBinh;

    public HocSinh(){

    }

    public HocSinh(String hoTen,String lop , double toan , double ly , double hoa , double diemTrungBinh){
    this.hoTen = hoTen;
    this.lop = lop;
    this.toan = toan;
    this.ly = ly;
    this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public double getToan() {
        return toan;
    }
    public void setToan(double toan) {
        this.toan = toan;
    }
    public double getLy() {
        return ly;
    }
    public void setLy(double ly) {
        this.ly = ly;
    }
    public double getHoa() {
        return hoa;
    }
    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public double tinhDiemTrungBinh(){
        return (toan + ly + hoa) /3;
    }
    
}

package quanlidonhang;

public interface IDonHang {
public sanPham FindSP(int ma);
public void insertSP(sanPham sp, int soLuong);
public void xoaSP(int ma);
public void xuatSP();
}

package quanlidonhang;



public class Client {
	public static void main(String[] args) {
		donHang dh = new donHang();
		sanPham sp = new sanPham(1,"ruou",3,3000.0);
		sanPham sp1 = new sanPham(2,"ru",6,9000.0);
		khachHang kh = new khachHang(2,"Vu","BD");
		cuaHang ch = new cuaHang("GG","SG");
		dh.insertSP(sp1, 1);
		dh.insertSP(sp, 2);
		System.out.println(dh.FindSP(1));
		dh.xoaSP(2);
		dh.xuatSP();
		
	}
}

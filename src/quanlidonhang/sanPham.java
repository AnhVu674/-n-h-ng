package quanlidonhang;

public class sanPham {

	private int maSP;
	private String tenSP;
	private int soLuong;
	private double gia;

	public sanPham(int maSP, String tenSP, int soLuong, double gia) {
		this.maSP=maSP;
		this.tenSP=tenSP;
		this.soLuong=0;
		this.gia=gia;
	}

	@Override
	public String toString() {
		return "sanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", gia=" + gia + "]";
	}

	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

}

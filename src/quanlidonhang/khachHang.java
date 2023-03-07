package quanlidonhang;

import java.util.ArrayList;
import java.util.List;

public class khachHang {
	private List<IDonHang> ds = null;
	private int maKH;
	private String tenKH;
	private String diaChi;

	public khachHang(int maKH, String tenKH, String diaChi) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
	}

	public khachHang() {
		ds = new ArrayList<IDonHang>();
	}

	@Override
	public String toString() {
		return "khachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + "]";
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void themDH(IDonHang dh) {
		ds.add(dh);
	}
}

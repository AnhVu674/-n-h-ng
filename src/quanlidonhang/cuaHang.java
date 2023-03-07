package quanlidonhang;

import java.util.ArrayList;
import java.util.List;

public class cuaHang implements ICuaHang {
private List<khachHang> dskh = null;
	private String tenCH;
	private String diaChi;

	public cuaHang(String tenCH, String diaChi) {
		this.tenCH = tenCH;
		this.diaChi = diaChi;
	}

	public cuaHang() {
		dskh =new ArrayList<khachHang>() ;
	}

	@Override
	public String toString() {
		return "cuaHang [tenCH=" + tenCH + ", diaChi=" + diaChi + "]";
	}

	public String getTenCH() {
		return tenCH;
	}

	public void setTenCH(String tenCH) {
		this.tenCH = tenCH;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public void themKH(khachHang kh) {
		this.dskh.add(kh);
	}

}

package quanlidonhang;

import java.util.ArrayList;

public class donHang implements IDonHang {
	private ArrayList<sanPham> dssp;

	public donHang(ArrayList<sanPham> dssp) {
		this.dssp = dssp;
	}

	public donHang() {
		this.dssp = new ArrayList<sanPham>();
	}

	@Override
	public sanPham FindSP(int ma) {
		for (sanPham sp : dssp) {
			if (sp.getMaSP() == ma)
				return sp;
		}
		return null;
	}

	@Override
	public void insertSP(sanPham sp, int soLuong) {
		var kq = this.FindSP(sp.getMaSP());
		if (kq == null) {
			sp.setSoLuong(soLuong);
			this.dssp.add(sp);
		} else {
			kq.setSoLuong(kq.getSoLuong() + soLuong);
		}
	}

	@Override
	public void xoaSP(int ma) {
		if (this.FindSP(ma) != null) {
			this.dssp.remove(this.FindSP(ma));
			System.out.println("Da xoa san pham!");
		} else {
			System.out.println("Khong tim thay san pham co ma:" + ma);
		}
	}

	@Override
	public void xuatSP() {
		for (sanPham sp : dssp) {
			System.out.println(sp);
		}
	}

}

package Container;

import java.util.Date;

public class Container {
    private String soContainer;
    private boolean trangThai;
    private float canNang;
    private boolean isKhongHang;
    private Date ngayVaoCang;
    private Date ngayRaCang;

    public String getSoContainer() {
        return soContainer;
    }

    public void setSoContainer(String soContainer) {
        this.soContainer = soContainer;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public boolean isKhongHang() {
        return isKhongHang;
    }

    public void setKhongHang(boolean khongHang) {
        isKhongHang = khongHang;
    }

    public Date getNgayVaoCang() {
        return ngayVaoCang;
    }

    public void setNgayVaoCang(Date ngayVaoCang) {
        this.ngayVaoCang = ngayVaoCang;
    }

    public Date getNgayRaCang() {
        return ngayRaCang;
    }

    public void setNgayRaCang(Date ngayRaCang) {
        this.ngayRaCang = ngayRaCang;
    }
}

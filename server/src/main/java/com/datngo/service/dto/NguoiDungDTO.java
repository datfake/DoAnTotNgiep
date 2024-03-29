package com.datngo.service.dto;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * A DTO for the {@link com.datngo.domain.NguoiDung} entity.
 */
public class NguoiDungDTO implements Serializable {
    
    private Long id;

    private String hoTen;

    private String sdt;

    private Integer ngaySinh;

    private Integer thangSinh;

    private Integer namSinh;

    private String gioiTinh;

    private String diaChi;

    private Long soDu;

    private Integer trangThai;

    private LocalDate ngayTao;

    private LocalDate ngaySua;

    private String email;

    private String tinhThanh;

    private String quanHuyen;

    private String xaPhuong;


    private Long userId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Integer ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Integer getThangSinh() {
        return thangSinh;
    }

    public void setThangSinh(Integer thangSinh) {
        this.thangSinh = thangSinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Long getSoDu() {
        return soDu;
    }

    public void setSoDu(Long soDu) {
        this.soDu = soDu;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public LocalDate getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(LocalDate ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NguoiDungDTO)) {
            return false;
        }

        return id != null && id.equals(((NguoiDungDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "NguoiDungDTO{" +
            "id=" + getId() +
            ", hoTen='" + getHoTen() + "'" +
            ", sdt='" + getSdt() + "'" +
            ", ngaySinh=" + getNgaySinh() +
            ", thangSinh=" + getThangSinh() +
            ", namSinh=" + getNamSinh() +
            ", gioiTinh='" + getGioiTinh() + "'" +
            ", diaChi='" + getDiaChi() + "'" +
            ", soDu=" + getSoDu() +
            ", trangThai=" + getTrangThai() +
            ", ngayTao='" + getNgayTao() + "'" +
            ", ngaySua='" + getNgaySua() + "'" +
            ", email='" + getEmail() + "'" +
            ", tinhThanh='" + getTinhThanh() + "'" +
            ", quanHuyen='" + getQuanHuyen() + "'" +
            ", xaPhuong='" + getXaPhuong() + "'" +
            ", userId=" + getUserId() +
            "}";
    }
}

package com.example.phuong201200281_broadcast;

import java.io.Serializable;

public class ThuChi  {
  private int id;
    private String tenkhoan;
    private  String ngaythang;
    private  int sotien;
    private  boolean phuchi;

    public ThuChi(String tenkhoan, String ngaythang, int sotien, boolean phuchi) {
        this.tenkhoan = tenkhoan;
        this.ngaythang = ngaythang;
        this.sotien = sotien;
        this.phuchi = phuchi;
    }

    public ThuChi(int id, String tenkhoan, String ngaythang, int sotien, int phuchi) {
        this.id = id;
        this.tenkhoan = tenkhoan;
        this.ngaythang = ngaythang;
        this.sotien = sotien;
        if(phuchi == 1){
            this.phuchi = true;
        }else {
            this.phuchi = false;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenkhoan() {
        return tenkhoan;
    }

    public void setTenkhoan(String tenkhoan) {
        this.tenkhoan = tenkhoan;
    }

    public String getNgaythang() {
        return ngaythang;
    }

    public void setNgaythang(String ngaythang) {
        this.ngaythang = ngaythang;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public boolean isPhuchi() {
        return phuchi;
    }

    public void setPhuchi(boolean phuchi) {
        this.phuchi = phuchi;
    }
}
package id.sch.smktelkom_mlg.finall.xirpl1062239.mokletsiapprakerin.Model;

/**
 * Created by Alfin Febrianto on 09/04/2018.
 */

public class Form {
    private String fid, nama, nis, alamat, telp, email, kelas, tipe, perusahaan1, perusahaan2;

    public Form() {
    }

    public Form(String fid, String nama, String nis, String alamat, String telp, String email, String kelas, String tipe, String perusahaan1, String perusahaan2) {
        this.fid = fid;
        this.nama = nama;
        this.nis = nis;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
        this.kelas = kelas;
        this.tipe = tipe;
        this.perusahaan1 = perusahaan1;
        this.perusahaan2 = perusahaan2;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getPerusahaan1() {
        return perusahaan1;
    }

    public void setPerusahaan1(String perusahaan1) {
        this.perusahaan1 = perusahaan1;
    }

    public String getPerusahaan2() {
        return perusahaan2;
    }

    public void setPerusahaan2(String perusahaan2) {
        this.perusahaan2 = perusahaan2;
    }
}

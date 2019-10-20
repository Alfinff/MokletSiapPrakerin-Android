package id.sch.smktelkom_mlg.finall.xirpl1062239.mokletsiapprakerin.Model;

/**
 * Created by Alfin Febrianto on 09/04/2018.
 */

public class Perusahaan {
    private String nama, alamat;

    public Perusahaan() {
    }

    public Perusahaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "personel")
public class Personel extends Kisi {

    @Column(name = "maas",nullable = false)
    private Double maas;
    @Temporal(TemporalType.DATE)
    @Column(name = "is_giris_tarihi")
    private Date iseGirisTarihi;
    @Column(name = "sicil_no")
    private String sicilNo;
    @Column(name = "departman")
    private String departman;
    @Column(name = "unvan")
    private String unvan;
    @Lob
    @Column(name = "aciklama")
    private String aciklama;

    public Personel(){

    }

    public Personel(String ad, String soyad, Date dogumTarihi, String tcNo, String telNo, Double maas, Date iseGirisTarihi, String sicilNo, String departman, String unvan) {
        super(ad, soyad, dogumTarihi, tcNo, telNo);
        this.maas = maas;
        this.iseGirisTarihi = iseGirisTarihi;
        this.sicilNo = sicilNo;
        this.departman = departman;
        this.unvan = unvan;
    }

    public Double getMaas() {
        return maas;
    }

    public void setMaas(Double maas) {
        this.maas = maas;
    }

    public Date getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(Date iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }


}

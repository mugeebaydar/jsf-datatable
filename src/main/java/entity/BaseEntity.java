package entity;

import java.util.Date;

public abstract class BaseEntity {

    private Long id;
    private Date olusturulmaTarihi;
    private Date guncellemeSaati;
    private String olusturanKisi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Date getGuncellemeSaati() {
        return guncellemeSaati;
    }

    public void setGuncellemeSaati(Date guncellemeSaati) {
        this.guncellemeSaati = guncellemeSaati;
    }

    public String getOlusturanKisi() {
        return olusturanKisi;
    }

    public void setOlusturanKisi(String olusturanKisi) {
        this.olusturanKisi = olusturanKisi;
    }
}

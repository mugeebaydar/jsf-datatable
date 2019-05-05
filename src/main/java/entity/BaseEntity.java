package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Entityler her zaman için baseEntity sınıfını extends edeceğinden dolayı super sınıf olarak işaretlendi
 * Buradaki tablo oluşturulma stratejisi alt sınıflarına yansıtılacak.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP) //bir date kullanılacaksa o zaman kullanılır hibernate'de
    @Column (name = "olusturulma_tarihi")
    private Date olusturulmaTarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "guncelleme_tarihi")
    private Date guncellemeSaati;

    @Column(name = "olusturan_kisi")
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

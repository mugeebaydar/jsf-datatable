package service;

import entity.Personel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonelService implements IPersonelService{

    private List<Personel> personelList=new ArrayList<Personel>();


    public void kaydet(Personel personel) {

        if(personel!=null){

            Personel yeniPersonel=new Personel(); //hashcode için yeni obje oluşturulur. oluşturmazsak aynı nesneyi ekler ve üstüne ekler tek bir kayıt olur
            yeniPersonel.setId(personel.getId());
            yeniPersonel.setDepartman(personel.getDepartman());
            yeniPersonel.setIseGirisTarihi(personel.getIseGirisTarihi());
            yeniPersonel.setMaas(personel.getMaas());
            yeniPersonel.setOlusturanKisi("Developer");
            yeniPersonel.setOlusturulmaTarihi(new Date());
            yeniPersonel.setGuncellemeSaati(null);
            yeniPersonel.setAd(personel.getAd());
            yeniPersonel.setSoyad(personel.getSoyad());
            yeniPersonel.setDogumTarihi(personel.getDogumTarihi());
            yeniPersonel.setTcNo(personel.getTcNo());
            yeniPersonel.setTelNo(personel.getTelNo());
            yeniPersonel.setSicilNo(personel.getSicilNo());
            yeniPersonel.setUnvan(personel.getUnvan());

            personelList.add(yeniPersonel);
        }
    }

    public List<Personel> personelListesiGetir() {
        return personelList;
    }
}

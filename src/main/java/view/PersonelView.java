package view;

import entity.Personel;
import service.PersonelService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class PersonelView {
    private Personel personel;
    private PersonelService personelService;
    private List<Personel> personelList;
    private List<String> departmanList;

    @PostConstruct //contrustur oluşturulduktan sonra oluşturulacak method
    public void init(){
        personel=new Personel();
        personelService=PersonelService.getInstance();
        personelList=new ArrayList<>();
        departmanList=new ArrayList<>();

        departmanList.add("Arge");
        departmanList.add("İnsan Kaynakları");
        departmanList.add("Yönetim Departmanı");
        departmanList.add("Mali İşler");
        departmanList.add("Hizmetli");
    }

    /**
     * Kaydet butonuna tıklandığınında çağrılacak method ActionListener ile asyn olarak çağırılıyor.
     */
    public void onKaydet(){

        if(personel.getAd()!=null){
            personelService.kaydet(personel);
            personelList=personelService.personelListesiGetir();

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kayıt İşlemi Başarılı."));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Kayıt İşlemi Başarısız."
                    ,null));
        }
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(List<Personel> personelList) {
        this.personelList = personelList;
    }

    public List<String> getDepartmanList() {
        return departmanList;
    }

    public void setDepartmanList(List<String> departmanList) {
        this.departmanList = departmanList;
    }
}

package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory; //hibernate oturumlardan sorumlu java sınıfı

    //uyg ilk çalıştığında çalışan kod bloklarıdır
    static {

        try{
            Configuration configuration=new Configuration();
            configuration.configure();//ayarları al
            sessionFactory=configuration.buildSessionFactory(); //cfg'deki configleri sessionfactorye al
        }catch (HibernateException exception){
            exception.printStackTrace();
        }
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }
    public static void closeSession(){
        sessionFactory.getCurrentSession().close(); //o an ki sessionu kapat.
    }


}

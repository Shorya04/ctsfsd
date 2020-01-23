package HIBERNATE.myCompany.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HIBERNATE.myCompany.OneToMany.Model.Album;
import HIBERNATE.myCompany.OneToMany.Model.Image;
import HIBERNATE.myCompany.OneToMany.Model.Album;


public class App 
{
    public static void main( String[] args )
    {

		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Album.class).addAnnotatedClass(Album.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		        session.beginTransaction();
				Album tempAlbum = new Album("Personal");
				Image tempImage = new Image("//sshkdh//");
				Image tempImage1=new Image("jgxdcbks");
				tempAlbum.add(tempImage);
				tempAlbum.add(tempImage1);
                session.save(tempImage);
                session.save(tempImage1);
                session.getTransaction().commit();

    }
}

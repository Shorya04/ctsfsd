package HIBERNATE.myCompany.BidirectionalMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HIBERNATE.myCompany.BidirectionalMapping.Model.Album;
import HIBERNATE.myCompany.BidirectionalMapping.Model.Image;
import HIBERNATE.myCompany.BidirectionalMapping.Service.Service;
import HIBERNATE.myCompany.BidirectionalMapping.Service.ServiceImpl;


public class AppTest 
{
	public static Service service;
	static {
		service=new ServiceImpl();
	}

	public static void main(String[] args) throws IOException {
		int choice=-1;
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Album.class).addAnnotatedClass(Image.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tid;
		do {
			
			System.out.println("1. Create Album/Image");
			System.out.println("2. Delete Album/Image");
			System.out.println("..Enter choice..");
		    choice=Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1:
				
				Album tempAlbum = new Album("Personal");
				Image tempImage = new Image("//sshkdh//");
				tempAlbum.setImage(tempImage);
                session.beginTransaction();
                session.save(tempAlbum);
                session.getTransaction().commit();

				
				//Album album=service.createAlbum(album);
				//session.beginTransaction();
				//session.save(album);
				//session.getTransaction().commit();
				
			case 2:
				
				session.beginTransaction();
				System.out.println("Enter id: ");
				tid=Integer.parseInt(br.readLine());
				Album tempAlbum1=session.get(Album.class,tid);
				if(tempAlbum1!=null) {
					session.delete(tempAlbum1);
				}
				session.getTransaction().commit();
			}
		}
		while(choice!=0);
	}

}


package runall;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.module.Configuration;
import java.time.LocalDate;

import org.w3c.dom.UserDataHandler;



public class Client2 {
	public static void main(String[] args)throws Exception {
		/*
		 * Configuration cfg=new Configuration().configure("hibernate.anno.cfg.xml");
		
		SessionFactor  factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		UserDataHandler user = new User();
		user.setUid(200);
		user.setUname("mahim");
		user.setUpass("secret");
		user.setJoiningDate(LocalDate.now());
		user.setFlag(1);
		
		Laddu laddu=new Laddu();
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(laddu);
		
		user.setMyobj(bos.toByteArray());
		
		session.save(user);
		
		session.beginTransaction().commit();
	}
}
class Laddu implements Serializable{
	private int size=10;
	@Override
	public String toString() {
		return "Laddu [size=" + size + "]";
		 */
	}
	
}


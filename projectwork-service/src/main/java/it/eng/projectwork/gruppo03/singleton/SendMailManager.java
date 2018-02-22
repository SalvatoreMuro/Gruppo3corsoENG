package it.eng.projectwork.gruppo03.singleton;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import it.eng.projectwork.gruppo03.mail.SendMail;

@Singleton
@Startup
public class SendMailManager {

	@EJB
	SendMail sendMail;
	
	@Schedule(minute="0/1", persistent=false)
	public void sendNewsLetter() {
		System.out.println("Incoming News");
	}
	
	
}

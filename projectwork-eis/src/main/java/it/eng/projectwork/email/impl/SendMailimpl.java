package it.eng.projectwork.email.impl;

import javax.ejb.Stateless;

import it.eng.projectwork.gruppo03.mail.Message;
import it.eng.projectwork.gruppo03.mail.SendMail;
import it.eng.projectwork.gruppo03.mail.exception.MailNotSendException;

@Stateless
public class SendMailimpl implements SendMail {

	@Override
	public void sendMailAllUser(Message message) throws MailNotSendException {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void sendMail(Message message, String destination) throws MailNotSendException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

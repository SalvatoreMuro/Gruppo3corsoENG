package it.eng.projectwork.gruppo03.mail;


import javax.ejb.Local;

import it.eng.projectwork.gruppo03.mail.exception.MailNotSendException;

//stiamo dicendo al cointener che questa è un interfaccia ejb quindi ci sarà una classe che implementa questa interfaccia
@Local
public interface SendMail {

	public void sendMailAllUser(Message message) throws MailNotSendException;
	public void sendMail(Message message, String destination) throws MailNotSendException;
}


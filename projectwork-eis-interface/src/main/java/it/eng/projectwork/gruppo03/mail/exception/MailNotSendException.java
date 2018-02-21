package it.eng.projectwork.gruppo03.mail.exception;

import java.util.Arrays;

public class MailNotSendException extends Exception {

	public MailNotSendException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MailNotSendException [getMessage()=" + getMessage();
	}

		
}

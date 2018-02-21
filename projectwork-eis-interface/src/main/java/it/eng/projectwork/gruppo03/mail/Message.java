package it.eng.projectwork.gruppo03.mail;


public class Message {
	
	public static enum TYPE{TEXT,HTML}
	private String subject;
	private String body;
	private TYPE type;
	
	public Message(String subject, String body, TYPE type) {
		super();
		this.subject = subject;
		this.body = body;
		this.type = type;
	}
	
	public String getSubject() {
		return subject;
	}
	public String getBody() {
		return body;
	}
	public TYPE getType() {
		return type;
	}
	
	
	
}

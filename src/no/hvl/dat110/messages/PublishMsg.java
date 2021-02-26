package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

import static no.hvl.dat110.messages.MessageType.PUBLISH;

public class PublishMsg extends Message {
	private String topic;
	private String message;

	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required
	public PublishMsg(String user, String topic, String message){
		super(PUBLISH, user);
		this.topic = topic;
		this.message = message;

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString(){
		return "PublishMsg " + super.toString() + " topic=" + topic + " message=" + message;
	}
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		
		return this.message;
	}
}

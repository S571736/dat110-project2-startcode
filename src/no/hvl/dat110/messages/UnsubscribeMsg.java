package no.hvl.dat110.messages;

import static no.hvl.dat110.messages.MessageType.UNSUBSCRIBE;

public class UnsubscribeMsg extends Message {
    private String topic;

    // message sent from client to unsubscribe on a topic

	// TODO:
	// Implement object variables - a topic is required
    public UnsubscribeMsg(String user, String topic){
        super(UNSUBSCRIBE, user);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String toString(){
        return "UnsubscribeMsg " + super.toString() + " topic=" + topic;
    }
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
}

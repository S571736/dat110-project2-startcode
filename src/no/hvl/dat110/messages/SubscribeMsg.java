package no.hvl.dat110.messages;

import static no.hvl.dat110.messages.MessageType.SUBSCRIBE;

public class SubscribeMsg extends Message {
    private String topic;

    // message sent from client to subscribe on a topic

	// TODO:
	// Implement object variables - a topic is required
    public SubscribeMsg(String user, String topic){
        super(SUBSCRIBE, user);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String toString(){
        return "SubscribeMsg " + super.toString() + " topic=" + topic;
    }
// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}

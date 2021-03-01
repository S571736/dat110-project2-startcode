package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messagetransport.MessagingClient;

import static no.hvl.dat110.iotsystem.Common.*;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START - Sånn?

		Client client = new Client("Display device", BROKERHOST,BROKERPORT);
		client.connect();
		client.createTopic(TEMPTOPIC);
		client.subscribe(TEMPTOPIC);
		Message msg = client.receive();
		System.out.println(msg);
		client.unsubscribe(TEMPTOPIC);
		client.disconnect();

		// create a client object and use it to
		// - connect to the broker
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		System.out.println("Display stopping ... ");

	}
}

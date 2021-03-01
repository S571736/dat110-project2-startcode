package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

import static no.hvl.dat110.iotsystem.Common.*;

public class TemperatureDevice {

    private static final int COUNT = 10;

    public static void main(String[] args) {

        // simulated / virtual temperature sensor
        TemperatureSensor sn = new TemperatureSensor();

        // TODO - start
        Client client = new Client("Temperature device", BROKERHOST, BROKERPORT);
        // create a client object and use it to

        client.connect();

        for (int i = 0; i < COUNT; i++) {
            int temp = sn.read();
            client.publish(TEMPTOPIC, "The temperature is: " + temp);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        client.disconnect();
        // - connect to the broker
        // - publish the temperature(s)
        // - disconnect from the broker

        // TODO - end

        System.out.println("Temperature device stopping ... ");


    }
}

package Payloads;

import java.util.Random;

/**
 * Created by VenD on 11/14/2018.
 */
public class payloadAddMovesForm {

    public static String payload;
    public static int random;


    public static String payloadOfAddMovesForm()
    {
        int max=10000;
        int min=1;
        Random r = new Random();
        random =r.nextInt((max - min) + 1) + min;
        System.out.println(random+"\n");

        payload="{\n" +
                "  \"firstName\":\"iqra\",\n" +
                "  \"email\": \"iqrabibi"+random+"@bystored.com\",\n" +
                "  \"phoneNumber\": \"34598756423\"\n" +
                "}";

        return payload;
    }
}

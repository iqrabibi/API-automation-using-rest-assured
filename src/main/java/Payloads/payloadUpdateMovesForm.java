package Payloads;

import java.util.Random;

/**
 * Created by VenD on 11/14/2018.
 */
public class payloadUpdateMovesForm {

    public static String payload;
    public  static int random;


    public static String payloadOfUpdateMovesForm()
    {
        int max=100;
        int min=1;
        Random r = new Random();
        random =r.nextInt((max - min) + 1) + min;
        System.out.println(random);

        payload="{\n" +
                "  \"moveSize\": \"table\",\n" +
                "  \"sourcePostCode\": \"sw"+random+"af\",\n" +
                "  \"sourceAddress\": \"sw66 af\",\n" +
                "  \"sourceJobParameters\": [\n" +
                "    \"none\"\n" +
                "  ],\n" +
                "  \"destinationPostCode\": \"sw66 af\",\n" +
                "  \"destinationAddress\": \"sw66 af\",\n" +
                "  \"destinationJobParameters\": [\n" +
                "    \"none\"\n" +
                "  ],\n" +
                "  \"itemDetail\": \"length\",\n" +
                "  \"moveDate\": [\n" +
                "    \"2018-11-12T07:35:51.076Z\"\n" +
                "  ],\n" +
                "  \"interestedInStorage\": false,\n" +
                "  \"marketingSource\": \"Facebook\",\n" +
                "  \"category\": \"Student\"\n" +
                "}";


        return payload;

    }
}

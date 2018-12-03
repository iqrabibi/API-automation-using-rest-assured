package Payloads;

import java.util.Random;

/**
 * Created by VenD on 9/3/2018.
 */
public class payloadUpdateUserProfile {

   public static String payload;
    public  static int random;

    public static String payloadOfUpdateUserProfile()
    {
       int max=900000000;
        int min=898574445;
        Random r = new Random();
      random =r.nextInt((max - min) + 1) + min;
        System.out.println(random);

        payload="{\n" +
                "\"category\":\"Family & Young Professional\",\n" +
                "\"firstName\":\"wasim\",\n" +
                "\"id\": \"15033\",\n" +
                "\"isActive\":true,\n" +
                "\"lastName\":\"hasanss\",\n" +
                "\"marketingCampaign\":\"null\",\n" +
                "\"marketingSource\":\"\" ,\n" +
                "\"phone\":"+random+"\n" +
                "\n" +
                "}";

        return payload;
    }

}

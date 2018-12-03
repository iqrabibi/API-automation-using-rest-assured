package Payloads;

/**
 * Created by VenD on 11/4/2018.
 */
public class payloadCrateCollecctionOneOffCharges {

    public static String payload;

    public static int id;



   public static String payloadOfCrateCollecctionOneOffCharges()
   {
        id=3077;
       payload="{\n" +
               "  \n" +
               "  \"order\": {\n" +
               "  \t\"id\":"+id+ ",\n" +
               "\n" +
               "  \"ruleGroups\": [\n" +
               "    {\n" +
               "      \"discountCodeType\": {\n" +
               "        \"id\":5\n" +
               "      },\n" +
               "      \"discountRules\": [\n" +
               "        {\n" +
               "          \"discountType\": \"ONE_OFF_CHARGE\",\n" +
               "          \"discountValue\": \"CRATE_COLLECTION\"\n" +
               "        },\n" +
               "        {\n" +
               "          \"discountType\": \"REDEMPTION_COUNT\",\n" +
               "          \"discountValue\": \"1\",\n" +
               "          \"childRules\" : [\n" +
               "           {\n" +
               "           \"discountType\": \"PERCENT\",\n" +
               "           \"discountValue\": \"100\"\n" +
               "           },\n" +
               "           {\n" +
               "           \"discountType\": \"QUANTITY\",\n" +
               "           \"discountValue\": \"1\"\n" +
               "           }\n" +
               "          ]\n" +
               "        }\n" +
               "        \n" +
               "      ]\n" +
               "    }\n" +
               "    ]\n" +
               "  }\n" +
               "}\n" +
               "  ";


       return payload;
   }
}

package TestCases;

import General.Main;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static General.InitMethods.*;

/**
 * Created by VenD on 11/4/2018.
 */
public class PostCrateCollectionOneOffChargeAssertion extends Main {
    Response ActualResponse;
   public static int ActualStatusCode;
    public static int actualOrderId;


  int expectedOrderId=payloadCrateCollectionObject.id;

    @Test

    public void crateCollection()
    {
        ActualResponse=crateCollectionObject.CrateCollectionOneOffCharge();
        ActualStatusCode=ActualResponse.getStatusCode();

        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

       actualOrderId= jsonPathEvaluator.get("responseBody.order.orderId");

        System.out.println("order id received  " + actualOrderId);

        // Validate the response
        Assert.assertEquals(actualOrderId, expectedOrderId, "Correct order id received in the Response");
//


    }
}

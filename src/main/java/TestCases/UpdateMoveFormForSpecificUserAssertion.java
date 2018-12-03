package TestCases;

import General.Main;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static General.InitMethods.*;

/**
 * Created by VenD on 11/14/2018.
 */
public class UpdateMoveFormForSpecificUserAssertion extends Main{

    Response ActualResponse;
    int ActualStatusCode;
    String actualSourceCode;


    int postcodeNumber=payloadUpdateMovesFormObject.random;
    String expectedPostCode="sw"+postcodeNumber+"af";

    @Test

    public void UpdateMovesFormFlow()
    {
        ActualResponse=UpdateMovesFormForSpecificUserObject.updateForm();
        ActualStatusCode=ActualResponse.getStatusCode();
        System.out.println("\nStatus Code is\n " +ActualStatusCode);
        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

        actualSourceCode= jsonPathEvaluator.get("responseBody.movesFormData.sourcePostCode");
//        actualPhoneNumber =PhoneNumber.substring(3,12);

        // Let us print the city variable to see what we got
        System.out.println("\n Source code received " + actualSourceCode);

        // Validate the response
        Assert.assertEquals(actualSourceCode, ""+expectedPostCode, "Correct post code received in the Response");

    }



}

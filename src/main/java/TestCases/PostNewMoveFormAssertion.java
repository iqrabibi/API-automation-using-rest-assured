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
public class PostNewMoveFormAssertion extends Main{
    Response ActualResponse;
    public static int ActualStatusCode;
    public  static int actualId;
    public  static String actualUniqueUserId;
    public static String actualUserEmail;

    int emailDigit=payloadAddMovesFormObject.random;

    String  expectedemail="iqrabibi"+emailDigit+"@bystored.com";

    @Test

    public void addNewMovesFormFlow()
    {
        ActualResponse= moveFormObject.addNewMovesForm();
        ActualStatusCode=ActualResponse.getStatusCode();

        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

        actualId= jsonPathEvaluator.get("responseBody.movesFormData.id");
        actualUniqueUserId=jsonPathEvaluator.get("responseBody.movesFormData.uuid");
        actualUserEmail=jsonPathEvaluator.get("responseBody.movesFormData.userDetail.email");


        System.out.println("\nMoves form id received\n " + actualId);
        System.out.println("\nMoves form uniques user id received \n" + actualUniqueUserId);
        System.out.println("\nMoves form user email\n " + actualUserEmail);




        // Validate the response
        Assert.assertEquals(actualUserEmail, expectedemail, "Correct email id received in the Response");
        System.out.println("\n"+actualUserEmail+"\n"+expectedemail+"\n");
//


    }

    public String getUniqueUserId()
    {
        return actualUniqueUserId;
    }
}

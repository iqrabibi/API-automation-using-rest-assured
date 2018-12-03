package TestCases;

import AllRequests.UpdateUserProfile;
import General.Main;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static General.InitMethods.PUUP;
import static General.InitMethods.UUP;

/**
 * Created by VenD on 9/3/2018.
 */


public class UpdateUserProfileAssertion extends Main{

    Response ActualResponse;
    int ActualStatusCode;
    String PhoneNumber;
    String actualPhoneNumber;

    int expectedPhoneNumber=PUUP.random;

    @Test

    public void UpdateProfile()
    {
        ActualResponse=UUP.updateProfile();
        ActualStatusCode=ActualResponse.getStatusCode();

        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

         PhoneNumber= jsonPathEvaluator.get("responseBody.userDetails.phone");
      actualPhoneNumber =PhoneNumber.substring(3,12);

        // Let us print the city variable to see what we got
        System.out.println("Phone Number received from Response " + actualPhoneNumber);

        // Validate the response
        Assert.assertEquals(actualPhoneNumber, ""+expectedPhoneNumber, "Correct Phone number received in the Response");

    }





}







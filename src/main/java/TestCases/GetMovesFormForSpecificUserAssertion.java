package TestCases;

import AllRequests.PostNewMoveForm;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static General.InitMethods.*;
import static TestCases.PostNewMoveFormAssertion.actualUniqueUserId;

/**
 * Created by VenD on 11/14/2018.
 */
public class GetMovesFormForSpecificUserAssertion {


    Response ActualResponse;

    int ActualStatusCode;
   // String  ExpectedUniqueUserId= ;
    String  actualUserId;



    @Test
    private void getMovesFormOfUserSpecificFlow() {

       ActualResponse=movesFormForSpecificUserObject.GetMovesFormForUserSpecified();
        ActualStatusCode=ActualResponse.getStatusCode();
        System.out.println("Status code of \"moves form for specific user\"" + ActualStatusCode);
        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

        actualUserId= jsonPathEvaluator.get("responseBody.request.uuid");
        System.out.println("\nMoves form uniques user id\n " + actualUserId);
//        System.out.println("\n"+actualUserId+"\n"+PostNewMoveFormAssertionObject.getUniqueUserId()+"\n");
        Assert.assertEquals(actualUserId, PostNewMoveFormAssertionObject.getUniqueUserId(), "Correct uniques id received in the Response");
        System.out.println("\n"+actualUserId+"\n"+PostNewMoveFormAssertionObject.getUniqueUserId()+"\n");
//




    }
}

package TestCases;

import General.Main;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static General.InitMethods.PostNewMoveFormAssertionObject;
import static General.InitMethods.deleteSpecificMovesFormObject;
import static General.InitMethods.movesFormForSpecificUserObject;

/**
 * Created by VenD on 11/15/2018.
 */
public class DeleteSpecificUserMovesFormAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    boolean actualErrorMessage;
    // String  ExpectedUniqueUserId= ;




    @Test
    private void DeleteMovesFormFlow() {

        ActualResponse=deleteSpecificMovesFormObject.DeleteMovesForm();
        ActualStatusCode=ActualResponse.getStatusCode();
        System.out.println("\nStatus code of \"Delete Moves Form is\"" + ActualStatusCode);
        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

        actualErrorMessage= jsonPathEvaluator.get("responseHeader.isError");

//        System.out.println("\n"+actualUserId+"\n"+PostNewMoveFormAssertionObject.getUniqueUserId()+"\n");
        Assert.assertEquals(actualErrorMessage, false, "Error message is false");
        System.out.println("\n"+actualErrorMessage+"\n"+false+"\n");
//




    }


}

package TestCases;

import General.Main;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static General.InitMethods.GIOU;
import static General.InitMethods.GetAllMovesFormObject;

/**
 * Created by VenD on 11/14/2018.
 */
public class GetAllMovesFormAssertion extends Main{



    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode=200;
    List id;
    int actualIds;



    @Test
    private void GetAllMovesFormFlow() {

        ActualResponse = GetAllMovesFormObject.GetMovesForm();
        ActualStatusCode = ActualResponse.getStatusCode();
        System.out.println("Status code of \"Get all move form\"" + ActualStatusCode);
        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

        id= jsonPathEvaluator.get("responseBody.requests");
        actualIds=id.size();
        Assert.assertNotEquals(actualIds,0);
        System.out.println("\n the total number of ids we get are \n"+actualIds);


    }


    }

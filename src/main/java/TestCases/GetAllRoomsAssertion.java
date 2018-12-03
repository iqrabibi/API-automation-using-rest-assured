package TestCases;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static General.InitMethods.GetAllMovesFormObject;
import static General.InitMethods.GetAllRoomsObject;

/**
 * Created by VenD on 11/19/2018.
 */
public class GetAllRoomsAssertion {


    Response ActualResponse;
    int ActualStatusCode;
    int ExpectedStatusCode=200;
    List id;
    int actualIds;

    @Test
    private void GetAllRoomsFlow() {

        ActualResponse = GetAllRoomsObject.GetRooms();
        ActualStatusCode = ActualResponse.getStatusCode();
        System.out.println("Status code of \"Get all Rooms\"" + ActualStatusCode);
        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

        id= jsonPathEvaluator.get("responseBody.warehouseRooms");
        actualIds=id.size();
        Assert.assertNotEquals(actualIds,0);
        System.out.println("\n the total number of ids we get are \n"+actualIds);


    }

}

package AllRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static General.InitMethods.*;
import static TestCases.PostNewMoveFormAssertion.actualUniqueUserId;

/**
 * Created by VenD on 11/14/2018.
 */
public class UpdateMovesFormForSpecificUser {


    public String payloadOfUpdateMovesForm=payloadUpdateMovesFormObject.payloadOfUpdateMovesForm();
    Response response;
    String res;

    public  Response updateForm()
    {


        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");
        request.body(payloadOfUpdateMovesForm);
        response = request.put(baseURL+"movesForm/"+actualUniqueUserId+"?token="+token);
        res =response.getBody().asString();
        System.out.println("Response of \"Update moves form\""+res);
        return response;


    }
}

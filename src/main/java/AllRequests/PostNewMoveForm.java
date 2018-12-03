package AllRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static General.InitMethods.*;

/**
 * Created by VenD on 11/14/2018.
 */
public class PostNewMoveForm {


    public String payloadOfAddMovesForm= payloadAddMovesFormObject.payloadOfAddMovesForm();
    Response response;
    String res;

    public  Response addNewMovesForm()
    {


        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(payloadOfAddMovesForm);
        response = request.post(baseURL+"movesForm?token="+token);
        res =response.getBody().asString();
        System.out.println("Response of \"Add New Moves Form\"\n"+res);
        return response;


    }
}

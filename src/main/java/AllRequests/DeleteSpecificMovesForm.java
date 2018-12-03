package AllRequests;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static General.InitMethods.baseURL;
import static General.InitMethods.token;
import static TestCases.PostNewMoveFormAssertion.actualId;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 11/15/2018.
 */
public class DeleteSpecificMovesForm {


    Response response;
    String res;


    public Response DeleteMovesForm()
    {

        response=request(Method.DELETE, baseURL + "movesForm/"+actualId + "?token=" + token);
        res=response.getBody().asString();
        System.out.println("\n Response of \"Delete Moves Form\""+res);
        return response;
    }
}

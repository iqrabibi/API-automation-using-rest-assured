package AllRequests;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static General.InitMethods.baseURL;
import static General.InitMethods.token;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 11/14/2018.
 */
public class GetAllMovesForm {

    Response response;
    String res;


    public Response GetMovesForm()
    {
        response=request(Method.GET, baseURL+"movesForm?token="+token+"&pageNumber=1&pageSize=0");
        res=response.getBody().asString();
        System.out.println("Response of \"All Moves Form\""+res);
        return response;

    }
}

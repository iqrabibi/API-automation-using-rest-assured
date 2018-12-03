package AllRequests;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static General.InitMethods.baseURL;
import static General.InitMethods.token;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 11/19/2018.
 */
public class GetAllRooms {


    Response response;
    String res;


    public Response GetRooms()
    {
        response=request(Method.GET, baseURL+"warehouseRoom?isActive=true&token="+token);
        res=response.getBody().asString();
        System.out.println("Response of \"All ware house rooms\""+res);
        return response;

    }

}

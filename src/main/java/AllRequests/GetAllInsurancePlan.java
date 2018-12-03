package AllRequests;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static General.InitMethods.baseURL;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 11/3/2018.
 */
public class GetAllInsurancePlan {
    Response response;
    String res;


    public Response GetInsurancePlan()
    {
        response=request(Method.GET, baseURL + "insurancePlans");
        res=response.getBody().asString();
        System.out.println("Response of \"All Insurance Plan\""+res);
        return response;

    }
}

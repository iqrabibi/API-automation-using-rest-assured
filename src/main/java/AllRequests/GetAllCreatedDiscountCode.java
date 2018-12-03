package AllRequests;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static General.InitMethods.baseURL;
import static General.InitMethods.token;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 9/23/2018.
 */
public class GetAllCreatedDiscountCode {
    Response response;
    String res;


    public Response GetCreatedDiscountCode()
    {

        response=request(Method.GET, baseURL + "discountCode?" + "token=" + token);
       res=response.getBody().asString();
        System.out.println("Response of \"Get All Created discount code\""+res);
        return response;
    }
}

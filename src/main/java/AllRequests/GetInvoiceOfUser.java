package AllRequests;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static General.InitMethods.token;
import static General.InitMethods.baseURL;
import static io.restassured.RestAssured.*;

/**
 * Created by VenD on 8/28/2018.
 */
public class GetInvoiceOfUser {


    String user_id="15033";
   // String baseURI="http://35.178.31.120:8080/BYSDEV/v1/";
    int response_status_code;

    String res;
    Response response;

    public Response GetInvoices() {

        given();
        response = request(Method.GET, baseURL + "billing/invoice?userId=" + user_id + "&token=" + token);
        res=response.getBody().asString();
        System.out.println("Response of \"Get Invoices of user\""+res);
        return response;

//       response_status_code= response.getStatusCode();
//        return response_status_code;

    }




}

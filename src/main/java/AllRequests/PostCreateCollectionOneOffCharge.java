package AllRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static General.InitMethods.*;

/**
 * Created by VenD on 11/4/2018.
 */
public class PostCreateCollectionOneOffCharge {


    public String payloadOfCrateCollection= payloadCrateCollectionObject.payloadOfCrateCollecctionOneOffCharges();
    Response response;
    String res;

    public  Response  CrateCollectionOneOffCharge()
    {


        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(payloadOfCrateCollection);
        response = request.post(baseURL+"orderFlow?token="+token);
        res =response.getBody().asString();
        System.out.println("Response of \"Crate collection oneoff discount code\""+res);
        return response;


    }
}

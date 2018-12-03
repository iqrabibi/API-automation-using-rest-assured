package AllRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static General.InitMethods.PUUP;
import static General.InitMethods.baseURL;
import static General.InitMethods.token;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 9/3/2018.
 */
public class UpdateUserProfile {

    public String payloadOfUpdateProfile= PUUP.payloadOfUpdateUserProfile();
    Response response;
    String res;

    public  Response updateProfile()
    {


        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");
        request.body(payloadOfUpdateProfile);
        response = request.post(baseURL+"user?token="+token);
       res =response.getBody().asString();
        System.out.println("Response of \"Update user profile\""+res);
        return response;


    }


}

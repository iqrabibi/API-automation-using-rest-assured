package AllRequests;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static General.InitMethods.baseURL;
import static General.InitMethods.token;
import static TestCases.PostNewMoveFormAssertion.actualUniqueUserId;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

/**
 * Created by VenD on 11/14/2018.
 */
public class GetMovesFormForSpecificUser {
//    String user_id="15033";
//    // String baseURI="http://35.178.31.120:8080/BYSDEV/v1/";
//    int response_status_code;

    String res;
    Response response;

    public Response GetMovesFormForUserSpecified() {

        given();
        response = request(Method.GET, baseURL + "movesForm/" +actualUniqueUserId);
        res=response.getBody().asString();
        System.out.println("\nResponse of \"Get moves form of specific user\""+res);
        return response;

//       response_status_code= response.getStatusCode();
//        return response_status_code;

    }


}

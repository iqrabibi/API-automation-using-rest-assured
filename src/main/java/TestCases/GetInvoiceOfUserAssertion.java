package TestCases;


import General.Main;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static General.InitMethods.GIOU;

/**
 * Created by VenD on 8/15/2018.
 */
public class GetInvoiceOfUserAssertion extends Main {

    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode=200;


    @Test
    private void getInvoiceOfSpecificUser() {

       ActualResponse= GIOU.GetInvoices();
        ActualStatusCode=ActualResponse.getStatusCode();
        System.out.println("Status code of \"Get Invoices of user Assertion\""+ActualStatusCode);
        Assert.assertEquals(""+ActualStatusCode,""+ExpectedStatusCode);






//
//        given();
//       Response response= request(Method.GET,baseURI+"billing/invoice?userId="+user_id+"&token="+token);
//        String res=response.getBody().asString();
//        System.out.println(res);
//        response.getStatusCode();


//        given().when().get("http://35.178.31.120:8080/BYSDEV/v1/billing/invoice?userId=15033&token=3a3ae8bb54d34ac9a677622cfc6c37ca1536904166181").
//                then().
//                log().all().
//        //body().log();
//         assertThat().statusCode(20000);
//
//        // body().log().all()
//
//        // assertThat().
//
//        // body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));

    }

}



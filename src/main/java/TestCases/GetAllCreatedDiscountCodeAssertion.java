package TestCases;

import General.Main;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static General.InitMethods.ACDC;


/**
 * Created by VenD on 9/23/2018.
 */
public class GetAllCreatedDiscountCodeAssertion extends Main {

    Response ActualResponse;
    String ActualContentEncoding;
    String ExpectedContentEncoding="gzip";
    int ActualStatusCode;


    @Test

    public void AllDiscountCodes()
    {
        ActualResponse= ACDC.GetCreatedDiscountCode();
        System.out.println("Status code of \"Get All Created discount code\""+ActualResponse.getStatusCode());
        System.out.println(ActualResponse.getHeaders());
        ActualContentEncoding=ActualResponse.getHeader("Content-Encoding");
        Assert.assertEquals(ExpectedContentEncoding,ActualContentEncoding);
        System.out.println("Content-type of Api of all craeted disocunt code is "+ActualContentEncoding);

    }


}

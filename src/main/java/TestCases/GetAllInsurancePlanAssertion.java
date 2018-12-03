package TestCases;

import General.Main;
import com.mongodb.util.JSON;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static General.InitMethods.insurancePlanObject;

/**
 * Created by VenD on 11/3/2018.
 */
public class GetAllInsurancePlanAssertion extends Main {

    Response ActualResponse;
    List idLength;
    int ActuallengthOfResponseId;
    int ExpectedlengthOfResponseId=5;


    @Test
    public void allInsuranceplan()
    {

        ActualResponse=insurancePlanObject.GetInsurancePlan();
        System.out.println("Status code of \"Get all insurance plan\""+ActualResponse.getStatusCode());
        JsonPath jsonPathEvaluator = ActualResponse.jsonPath();

      // idLength = jsonPathEvaluator.get("responseBody.insurancePlans[]");
        idLength=jsonPathEvaluator.getList("responseBody.insurancePlans");

        System.out.println(idLength);
        ActuallengthOfResponseId=idLength.size();
        System.out.println("Actual number of ids \n :"+ActuallengthOfResponseId+"Expected number of ids \n"+ExpectedlengthOfResponseId);
        Assert.assertEquals(ActuallengthOfResponseId,ExpectedlengthOfResponseId,"Both ids are same for response");



    }
}

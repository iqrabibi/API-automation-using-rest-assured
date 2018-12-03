package General;

import AllRequests.*;
import Payloads.payloadAddMovesForm;
import Payloads.payloadUpdateMovesForm;
import Payloads.payloadUpdateUserProfile;
import Payloads.payloadCrateCollecctionOneOffCharges;
import TestCases.GetMovesFormForSpecificUserAssertion;
import TestCases.PostNewMoveFormAssertion;

/**
 * Created by VenD on 8/27/2018.
 */
public class InitMethods {

    public static ApplicationConfigReader appConfig = new ApplicationConfigReader();
    public static String token = appConfig.getToken();
    public static String baseURL = appConfig.getBaseURL();


    public static GetInvoiceOfUser GIOU=new GetInvoiceOfUser();
    public static UpdateUserProfile UUP=new UpdateUserProfile();
    public static GetAllCreatedDiscountCode ACDC=new GetAllCreatedDiscountCode();
    public static payloadUpdateUserProfile PUUP= new payloadUpdateUserProfile();
    public static GetAllInsurancePlan insurancePlanObject=new GetAllInsurancePlan();
    public static payloadCrateCollecctionOneOffCharges payloadCrateCollectionObject= new payloadCrateCollecctionOneOffCharges();
    public static PostCreateCollectionOneOffCharge crateCollectionObject=new PostCreateCollectionOneOffCharge();
    public static PostNewMoveForm moveFormObject=new PostNewMoveForm();
    public static payloadAddMovesForm payloadAddMovesFormObject=new payloadAddMovesForm();
    public static GetMovesFormForSpecificUser movesFormForSpecificUserObject=new GetMovesFormForSpecificUser();
    public static PostNewMoveFormAssertion PostNewMoveFormAssertionObject=new PostNewMoveFormAssertion();
    public static GetAllMovesForm GetAllMovesFormObject=new GetAllMovesForm();
    public static UpdateMovesFormForSpecificUser UpdateMovesFormForSpecificUserObject=new UpdateMovesFormForSpecificUser();
    public static payloadUpdateMovesForm payloadUpdateMovesFormObject=new payloadUpdateMovesForm();
    public static DeleteSpecificMovesForm deleteSpecificMovesFormObject=new DeleteSpecificMovesForm();
    public static GetAllRooms GetAllRoomsObject=new GetAllRooms();


}

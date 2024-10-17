package com.thetestingacademy.tests.FullCrud;

import com.thetestingacademy.endpoints.APIConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetRequestTest {

    @Test
    public void test_get() {

        RequestSpecification r = RestAssured.given();
        r.baseUri(APIConstants.baseUrl);
        r.basePath(APIConstants.CreateAndGetAllBookingUrl);

        Response response = r.when().get();
        ValidatableResponse vr = response.then();
        vr.statusCode(200);

    }
}

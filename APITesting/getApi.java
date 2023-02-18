package APITesting;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getApi {
	public static void main( String[] args) {
		RestAssured.baseURI = "https://reqres.in/api/";
		
		RequestSpecification apiRequest = RestAssured.given();
		apiRequest.header("content-type"," application/json");
		apiRequest.param("page", 2);
		Response response = apiRequest.request(Method.GET,"users");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		Assert.assertEquals(200,response.getStatusCode());
	}

}

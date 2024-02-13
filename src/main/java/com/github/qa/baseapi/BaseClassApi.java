package com.github.qa.baseapi;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseClassApi {
	
	public static Response getRequest(String requestUrl)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.get(requestUrl);
		return response;
	}
	//post request without body
	public static  Response postRequest(String requestUrl,String bearer_token)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response = requestSpecification.post(requestUrl);
		
		return response ;
		
	}
	//post request with body
	public static Response postRequest(String requestUrl,String requestPayload,String bearer_token )
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		requestSpecification.body(requestPayload);
		Response response = requestSpecification.post(requestUrl);
		return response;
		
	}
	//put request
	public static Response putRequest(String requestUrl,String requestPayload,String bearer_token)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		requestSpecification.body(requestPayload);
		Response response = requestSpecification.put(requestUrl);
		return response;
	}
	//put request without body
	public static Response putRequest(String requestUrl,String bearer_token)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
//		requestSpecification.body(requestPayload);
		Response response = requestSpecification.put(requestUrl);
		return response;
	}
	//patch request
	public static Response patchRequest(String requestUrl,String requestPayload,String bearer_token)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		requestSpecification.body(requestPayload);
		Response response = requestSpecification.patch(requestUrl);
		return response;
		
	}
	//Delete request
	public static Response deleteRequest(String requestUrl,String bearer_token)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response = requestSpecification.delete(requestUrl);
		return response;

	}

}

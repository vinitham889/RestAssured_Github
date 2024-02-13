package com.github.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.qa.baseapi.BaseClassApi;
import com.github.qa.utility.Authentication;
import com.github.qa.utility.Commonres;
import com.github.qa.utility.CreateURL;
import com.github.qa.utility.Payloadconvertor;

import io.restassured.response.Response;

public class GithubRepo {
	
	public static String endpoint = CreateURL.getbaseuri("/user/repos");
	public static String bearer_token = Authentication.getbearertoken();
	public static Response response;
	
	@Test
	public void createrespository() throws IOException {
		
		String request_payload = Payloadconvertor.generatepayload("CreateRepos.json");
		
		response = BaseClassApi.postRequest(endpoint, request_payload, bearer_token);
		
		String responsebody = response.getBody().asString();
		Assert.assertEquals(Commonres.getResponsevalue(request_payload, "name"), Commonres.getResponsevalue(responsebody,"name"));
		Assert.assertEquals(Commonres.getstatuscode(response), 201);
				
	}

}

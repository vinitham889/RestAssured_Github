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

public class UpdateRepo {
	public static String endpoint = CreateURL.getbaseuri("/repos/vinitham889/vinitha123");
	public static String bearer_token = Authentication.getbearertoken();
	public static Response response;
	
	@Test
	public void updateRepo() throws IOException
	{
		String request_payload = Payloadconvertor.generatepayload("UpdateRepo.json");
		response=BaseClassApi.patchRequest(endpoint, request_payload, bearer_token);
		String responsebody = response.getBody().asString();
		Assert.assertEquals(Commonres.getResponsevalue(request_payload, "name"), Commonres.getResponsevalue(responsebody,"name"));
		Assert.assertEquals(Commonres.getstatuscode(response), 200);
		
		
		
	}

}

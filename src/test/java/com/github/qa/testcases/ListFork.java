package com.github.qa.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.github.qa.baseapi.BaseClassApi;
import com.github.qa.utility.Authentication;
import com.github.qa.utility.Commonres;
import com.github.qa.utility.CreateURL;

import io.restassured.response.Response;

public class ListFork {
	public static String bearer_token = Authentication.getbearertoken();
	@Test
	public void listFork() {
		String endpoint=CreateURL.getbaseuri("/repos/vinitham889/PipelineDemo/forks");
//		String bearer_token = Authentication.getbearertoken();
		Response response = BaseClassApi.getRequest(endpoint);
		String responsebody = response.getBody().asString();
		Reporter.log(responsebody,true);
		Assert.assertEquals(Commonres.getstatuscode(response), 200);
		
		
	}
	@Test
	public void listRepo()
	{
		String endpoint =CreateURL.getbaseuri("/users/vinitham889/repos");
		Response response = BaseClassApi.getRequest(endpoint);
	    String responsebody = response.getBody().asString();
	    Reporter.log(responsebody,true);
	    Assert.assertEquals(Commonres.getstatuscode(response), 200);
	}
	@Test
	public void listPublicRepo()
	{
		String endpoint = CreateURL.getbaseuri("/repositories");
		Response response = BaseClassApi.getRequest(endpoint);
		String responsebody = response.getBody().asPrettyString();
		Reporter.log(responsebody,true);
		
		Assert.assertEquals(Commonres.getstatuscode(response), 200);
	}
	

}


package com.github.qa.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.github.qa.baseapi.BaseClassApi;
import com.github.qa.utility.Authentication;
import com.github.qa.utility.Commonres;
import com.github.qa.utility.CreateURL;

import io.restassured.response.Response;

public class GetRepo {
	
	public static String endpoints= CreateURL.getbaseuri("/repos/vinitham889/vinitha123");
	public static String bearer_token=Authentication.getbearertoken();
	public static Response response;
	@Test
	
	public void getRepo()
	{
		response=BaseClassApi.getRequest(endpoints);
		String result=response.asString();
		Reporter.log(result, true);
		Assert.assertEquals(Commonres.getstatuscode(response), 200);
	}
	

}

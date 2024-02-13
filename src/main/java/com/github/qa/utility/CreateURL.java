package com.github.qa.utility;

public class CreateURL {
	
	public final static String baseUri = "https://api.github.com";
	public static String getbaseuri()
	{
		return baseUri;
	}
	public static String getbaseuri(String resource)
	{
		return baseUri + resource;
	}

}

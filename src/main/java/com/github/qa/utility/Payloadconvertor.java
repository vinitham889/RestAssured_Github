package com.github.qa.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Payloadconvertor {
	
	public static String generatepayload(String filename) throws IOException
	{
		String filepath ="/Users/User/eclipse-workspace/RestAssuredFramework_Github/src/main/java/com/github/qa/resource/"+filename;
		return new String(Files.readAllBytes(Paths.get(filepath)));
	}

}

package com.qa.Slack.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewChannelTest {

	@Test
	public void createchannelTest() throws JsonProcessingException {
		String createchannel = null;
		RestAssured.baseURI = "https://api.slack.com/methods/";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization",
				"Bearer xoxp-811930529509-811921615968-811945317845-da8be5c3955da1121b95fdcb385ee0aa");
		request.header("Content-Type", "application/json");
		String payload = "{\r\n" + "    \"name\": \"automo8121\",\r\n" + "    \"validate\": \"true\"\r\n" + "\r\n"
				+ "}";

		request.body(payload);

		Response resp = request.post("channels.create");
		System.out.println(resp.prettyPrint());
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), HTTPStatus.HTTP_STATUS_CODE_200);
		JsonPath jsonPath = resp.jsonPath();
		String id = jsonPath.get("id");
		System.out.println("the token id is: " + id);
		Assert.assertNotNull(id);

	}
}

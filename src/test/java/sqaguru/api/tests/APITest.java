package sqaguru.api.tests;

import java.net.http.HttpClient;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {
	@Test
	public void APIFirstTest() {
		System.out.println("Hello test");
		// HttpClient client=
	}

	@Test
	public void test() {

		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.statusCode());

		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

		String statusLine = response.statusLine();

		System.out.println("statusLine: " + statusLine);

		String responseBody = response.getBody().asString();

		System.out.println("responseBody: \n" + responseBody);

		Assert.assertTrue(responseBody.contains("janet.weaver@reqres.in1"));

	}

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("name", "chaya");
		request.put("job", "BA");

		System.out.println(request);
		System.out.println(request.toString());

		///given().body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);

	}
}

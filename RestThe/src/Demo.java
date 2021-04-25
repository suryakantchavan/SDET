
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Demo {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").contentType("application/json")
				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"French-IN\"\r\n" + "}\r\n"
						+ "")
				.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).extract().response().asString();

		System.out.println(response);

		JsonPath path = new JsonPath(response);	

		String id = path.get("place_id");

		System.out.println(id);

	}

}

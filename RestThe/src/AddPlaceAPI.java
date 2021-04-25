
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Util.AddPlacePayload;

public class AddPlaceAPI {

	public static void main(String[] args) {
		String ID=getPlaceId();
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given().queryParam("key", "qaclick123").contentType("Application/json").body("{\r\n"
				+ "    \"place_id\":\""+ID+"\"\r\n"
				+ "}")
		.when().delete("/maps/api/place/delete/json").then().assertThat().statusCode(200);
		
	
	String res=	given().queryParam("key", "qaclick123").queryParam("place_id", ID).contentType("Application/json")
		.when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(404).extract().response().asString();
	
	JsonPath js = new JsonPath(res);
	String mesg= js.getString("msg");
	System.out.println(mesg);
		

	}

	public static String getPlaceId() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response = given().queryParam("key", "qaclick123").contentType("Application/json")
				.body(AddPlacePayload.getAddPlacePayload()).when().post("/maps/api/place/add/json").then().assertThat()
				.statusCode(200).body("status", equalTo("OK")).header("server", "Apache/2.4.18 (Ubuntu)").extract()
				.response().asString();

		JsonPath js = new JsonPath(response);
		String placeId = js.getString("place_id");

		return placeId;
	}

}

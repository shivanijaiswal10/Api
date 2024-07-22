package bottle;


	import org.testng.annotations.Test;

	import io.restassured.response.Response;
	import static io.restassured.RestAssured.*;

	import io.restassured.http.ContentType;
	import io.restassured.path.json.JsonPath;
	import static org.hamcrest.Matchers.*;

	import org.json.simple.JSONObject;

	public class Store_Pet {
	@Test(enabled = true)
	public void UserName() {
		given().contentType("application/json").get("https://petstore.swagger.io/#/user/{username}").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void loginUser() {
		given().get("https://petstore.swagger.io/#/user/loginUser").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void logoutUser() {
		given().get("https://petstore.swagger.io/#/user/logoutUser").then().statusCode(404).log().all();
	}
	
	
	
	
	@Test(enabled = false)
	public void UpdatedUser() {
		JSONObject js=new JSONObject();
		js.put("id",0);
		js.put("username","string");
		js.put("firstName","string");
		js.put("lastName","string");
		js.put("email","string");
		js.put("password","string");
		js.put("phone","string");
		js.put("userStatus",0);
			  
			  
			 
			
	
		given().contentType("application/json").body(js.toJSONString()).when().put("https://petstore.swagger.io/#/user/updateUser").then().statusCode(400).log().all();
	}
	
	
	@Test(enabled=false)
	public void delete() {
		given().delete("https://petstore.swagger.io/#/user/deleteUser").then().statusCode(404).log().all();
	}
	
	
	@Test(enabled = true)
	public void createWithlist() {
		JSONObject js=new JSONObject();
		js.put("id","0");
		js.put("username","string");
		js.put("firstName","string");
		js.put("lastName","string");
		js.put("email","string");
		js.put("password","string");
		js.put("phone","string");
		js.put("userStatus","0");

		given().contentType("application/json").body(js.toJSONString())
        .when().post("https://petstore.swagger.io/user/createWithList")
        .then().log().all();
	}
	@Test(enabled = false)
	public void login() {
		JSONObject js=new JSONObject();
		js.put("id",0);
		js.put("username","string");
		js.put("firstName","string");
		js.put("lastName","string");
		js.put("email","string");
		js.put("password","string");
		js.put("phone","string");
		js.put("userStatus",0);

		given().contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://petstore.swagger.io/#/user/createUsersWithArrayInput").then().statusCode(200).log().all();
	}
	}


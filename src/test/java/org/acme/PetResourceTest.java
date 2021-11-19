package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.allOf;

@QuarkusTest
public class PetResourceTest {

	@Test
    public void testPetEndpoint() {
        given()
          .when().get("/v1/pets")
          .then()
          .statusCode(200);
    }

	@Test
    public void testPetAddEndpoint() {
        given()
          .when().post("/v1/pets/add",{
        	    "petName": "Kitty",
        	    "petType": "Cat",
        	    "petAge": 5
        	})
          .then()
          .statusCode(200);
    }
	
	@Test
    public void testPetUpdateEndpoint() {
        given()
          .when().put("/v1/pets/update/1")
          .then()
          .statusCode(200);
    }
	
	@Test
    public void testPetGetEndpoint() {
        given()
          .when().get("/v1/pets/get/1")
          .then()
          .statusCode(200);
    }
	
	@Test
    public void testPetDeleteEndpoint() {
        given()
          .when().delete("/v1/pets/delete/1")
          .then()
          .statusCode(200);
    }
	
	

}
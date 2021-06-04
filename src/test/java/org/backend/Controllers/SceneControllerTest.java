package org.backend.Controllers;

import io.quarkus.test.junit.QuarkusTest;
import org.backend.Elements.Scene;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
@QuarkusTest
class SceneControllerTest {
    @Order(1)
    @Test
    void getScenes() {
        given().when().get("/scene").then().statusCode(200);
    }

    @Order(2)
    @Test
    void addScene() {
        var scene = new Scene();
        scene.setName("testScene");
        given().when().body(scene)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .post("/scene").then().statusCode(201);
    }
    @Order(4)
    @Test
    void deleteScene() {
        given().when().delete("/scene/1").then().statusCode(202);
    }

    @Order(3)
    @Test
    void putScene() {
        var scene = new Scene();
        scene.setName("testUpdate");
        given().when().body(scene)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .put("/scene/1").then().statusCode(201);
    }
}
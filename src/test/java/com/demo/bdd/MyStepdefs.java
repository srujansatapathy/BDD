package com.demo.bdd;

import com.demo.bdd.BDDTests;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class MyStepdefs extends BDDTests {

    ResponseEntity<String> response = null;


    @When("the client calls service")
    public void theClientCallsService() {
        RestTemplate restTemplate = new RestTemplate();
         response = restTemplate
                .exchange("http://localhost:8080/api/bdd", HttpMethod.GET, null, String.class);
    }

    @Then("the client receives status code of {int}")
    public void theClientReceivesStatusCodeOf(int statusCode) {
        assertEquals(response.getStatusCodeValue(), statusCode);


    }

    @And("the client receives response {string}")
    public void theClientReceivesResponse(String result) {
        assertEquals(response.getBody(), result);
    }
}

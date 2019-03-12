package com.ultratendency.dih.qa;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.ultratendency.dih.qa.controller.InfoController;
import com.ultratendency.dih.qa.controller.PersonController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
public class ContractVerifierBase {

	@Autowired
	PersonController personController;
	
	@Autowired
	InfoController infoController;
	
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(this.personController, this.infoController);
	}

}

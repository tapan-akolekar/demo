package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.test.context.support.WithMockUser;

import com.example.demo.model.AuthServerDetails;

@SpringBootTest
public class AuthServerDetailsTest {

	@Autowired
	private AuthServerDetailsController serverDetailsController;

	@Test
	public void getAllAuthServerTest() throws Exception {
		List<AuthServerDetails> expectedAuthServerDetails = List.of(
				new AuthServerDetails("My Test Auth Server", "https://example.com/my-test-auth-server",
						"https://example.com/my-test-issuer-uri", "ACTIVE"),
				new AuthServerDetails("HR Auth Server", "https://example2.com/hr-auth-server",
						"https://example2.com/hr-issuer-uri", "INACTIVE"),
				new AuthServerDetails("Salesforce Auth Server", "https://example3.com/salesforce-auth-server",
						"https://example3.com/salesforce-issuer-uri", "ACTIVE"),
				new AuthServerDetails("Marketing Auth Server", "https://example4.com/marketing-auth-server",
						"https://example4.com/marketing-issuer-uri", "PENDING"),
				new AuthServerDetails("IT Auth Server", "https://example5.com/it-auth-server",
						"https://example5.com/it-issuer-uri", "ACTIVE"),
				new AuthServerDetails("Finance Auth Server", "https://example6.com/finance-auth-server",
						"https://example6.com/finance-issuer-uri", "INACTIVE"),
				new AuthServerDetails("Customer Auth Server", "https://example7.com/customer-auth-server",
						"https://example7.com/customer-issuer-uri", "PENDING"),
				new AuthServerDetails("HR System Auth Server", "https://example8.com/hr-system-auth-server",
						"https://example8.com/hr-system-issuer-uri", "ACTIVE"),
				new AuthServerDetails("Sales Portal Auth Server", "https://example9.com/sales-portal-auth-server",
						"https://example9.com/sales-portal-issuer-uri", "INACTIVE"),
				new AuthServerDetails("Marketing System Auth Server",
						"https://example10.com/marketing-system-auth-server",
						"https://example10.com/marketing-system-issuer-uri", "PENDING"));
		ResponseEntity<List<AuthServerDetails>> response = serverDetailsController.getAllAuthServer();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedAuthServerDetails, response.getBody());
	}

}

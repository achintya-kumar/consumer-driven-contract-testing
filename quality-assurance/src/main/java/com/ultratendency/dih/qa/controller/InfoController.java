package com.ultratendency.dih.qa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
public class InfoController {
//	@GetMapping("/status")
//	@ResponseStatus(HttpStatus.OK)
//	public @ResponseBody Response getStatus() {
//		return new Response("OK");
//	}
	
	@GetMapping("/status")
	@ResponseStatus(HttpStatus.OK)
	public String getStatus() {
		return "{\"status\": \"OK\"}";
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Response {
	public String status;
}
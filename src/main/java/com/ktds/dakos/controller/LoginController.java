/**
 * 
 */
package com.ktds.dakos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ktds
 *
 */
@RestController
public class LoginController {

	@GetMapping("/hello")
	public String hello() {
		
		return "hi";
	}
	
	
}

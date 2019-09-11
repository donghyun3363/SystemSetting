/**
 * 
 */
package com.ktds.dakos.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.dakos.SystemSettingApplication;
import com.ktds.dakos.dto.MembersSaveRequestDto;
import com.ktds.dakos.repository.MembersRepository;
import com.ktds.dakos.service.MembersService;

import lombok.AllArgsConstructor;

/**
 * @author ktds
 *
 */
@RestController
@AllArgsConstructor
public class MembersController {

	private static final Logger logger = LogManager.getLogger(MembersController.class);

	private MembersService membersService; 
	private MembersRepository membersRepository;
	
	@PostMapping("/signin")
	public void savePosts(@RequestBody MembersSaveRequestDto dto) {
		membersRepository.save(dto.toEntity());
	}
	
	@GetMapping("/login")
	public String hello(Model model) {
		
		logger.info("[model]: " + model.toString());
		
		return "hi";
	}
	
}

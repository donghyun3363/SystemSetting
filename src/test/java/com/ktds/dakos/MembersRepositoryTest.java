package com.ktds.dakos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ktds.dakos.entity.Member;
import com.ktds.dakos.repository.MembersRepository;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class MembersRepositoryTest {

	@Autowired
	MembersRepository membersRepository;
	
	@Test
	public void insertTest() {
		for(int i = 0 ; i < 10 ; i++) {
			membersRepository.save(Member.builder()
	                .lgn_ft_cnt(0)
	                .mem_id("user" + i)
	                .mem_nm("user" + i)
	                .mem_pw("pw" + i)
	                .mem_type(0)
	                .opt_num(1)
	                .phone_num(123)
	                .stat_cd(0)
	                .build());
		}
	}
}

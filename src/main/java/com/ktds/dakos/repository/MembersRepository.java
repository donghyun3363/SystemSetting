package com.ktds.dakos.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ktds.dakos.entity.Members;

/**
 * 
 * @author ktds
 *
 * POST domain Repository
 */
public interface MembersRepository extends JpaRepository<Members, Long> {
	
	@Query("SELECT p FROM Members p ORDER BY p.id DESC")
	Stream<Members> findAllDesc();
}

package com.ktds.dakos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ktds.dakos.dto.MembersMainResponseDto;
import com.ktds.dakos.dto.MembersSaveRequestDto;
import com.ktds.dakos.repository.MembersRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MembersService {

	private MembersRepository postsRepository;
	
	/**
	 * member insert 클래스
	 * @param dto
	 * @return
	 */
	@Transactional
	public Long save(MembersSaveRequestDto dto) {
		return postsRepository.save(dto.toEntity()).getId();
	}
	
	/**
	 * member all select 클래스
	 * @return
	 */
	@Transactional(readOnly = true)
    public List<MembersMainResponseDto> findAllDesc() {
		List<MembersMainResponseDto> list = postsRepository.findAllDesc()
                .map(MembersMainResponseDto::new)
                .collect(Collectors.toList());
        return list;
    }
}

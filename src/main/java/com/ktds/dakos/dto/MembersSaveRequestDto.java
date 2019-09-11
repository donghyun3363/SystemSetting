package com.ktds.dakos.dto;


import com.ktds.dakos.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MembersSaveRequestDto {

	private Long id;
	private String mem_id;
	private String mem_nm;
	private String mem_pw;
	private int stat_cd;   
	private int lgn_ft_cnt;	 
	private int mem_type;
	private int opt_num;
	private int phone_num;
    private String modifiedDate;
    
	 public Member toEntity() {
		 return Member.builder()
				 .mem_id(mem_id)
				 .mem_nm(mem_nm)
				 .mem_pw(mem_pw)
				 .stat_cd(stat_cd)
				 .lgn_ft_cnt(lgn_ft_cnt)
				 .mem_type(mem_type)
				 .opt_num(opt_num)
				 .phone_num(phone_num)
				 .build();
	 }
	 
	@Builder
	public MembersSaveRequestDto(Long id, String mem_id, String mem_nm, 
			String mem_pw, int stat_cd, int lgn_ft_cnt, 
			int mem_type,  int opt_num, int phone_num) {
		 	this.id = id;
	        this.mem_id = mem_id;
	        this.mem_nm = mem_nm;
	        this.mem_pw = mem_pw;
	        this.stat_cd = stat_cd;
	        this.lgn_ft_cnt = lgn_ft_cnt;
	        this.mem_type = mem_type;
	        this.opt_num = opt_num;
	        this.phone_num = phone_num;
	}

	@Override
	public String toString() {
		return "MembersSaveRequestDto [id=" + id + ", mem_id=" + mem_id + ", mem_nm=" + mem_nm + ", mem_pw=" + mem_pw
				+ ", stat_cd=" + stat_cd + ", lgn_ft_cnt=" + lgn_ft_cnt + ", mem_type=" + mem_type + ", opt_num="
				+ opt_num + ", phone_num=" + phone_num + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
}

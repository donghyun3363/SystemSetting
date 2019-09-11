package com.ktds.dakos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 
 * @author ktds
 *
 * Posts domain
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Member extends BaseTimeEntity{
	@Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length=50)
    private String mem_id;
    
    @Column(nullable = false)
    private String mem_nm;
    
    @Column(nullable = false, length=200)
    private String mem_pw;
    
    @Column(nullable = false)
    private int stat_cd;    
    
    @Column(nullable = true)
    private int lgn_ft_cnt;
    
    @Column(nullable = false)
    private int mem_type;
    
    @Column(nullable = true)
    private int opt_num;
    
    @Column(nullable = false, unique = true, length=50)
    private int phone_num;
        
    @Builder
    public Member(Long id, String mem_id, String mem_nm, 
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
		return "Members [id=" + id + ", mem_id=" + mem_id + ", mem_nm=" + mem_nm + ", mem_pw=" + mem_pw + ", stat_cd="
				+ stat_cd + ", lgn_ft_cnt=" + lgn_ft_cnt + ", mem_type=" + mem_type + ", opt_num=" + opt_num
				+ ", phone_num=" + phone_num + "]";
	}
    
}

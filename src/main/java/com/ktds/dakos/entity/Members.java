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
public class Members extends BaseTimeEntity{
	@Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String mem_id;
    
    @Column(nullable = false)
    private String mem_nm;
    
    @Column(nullable = false)
    private String mem_pw;
    
    @Column(nullable = false)
    private int stat_cd;    
    
    @Column(nullable = true)
    private int lgn_ft_cnt;
    
    @Column(nullable = false)
    private int mem_type;
    
    @Column(nullable = true)
    private int opt_num;
    
    @Column(nullable = false)
    private int phone_num;
        
    @Builder
    public Members(Long id, String mem_id, String mem_nm, 
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
}

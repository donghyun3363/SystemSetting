package com.ktds.dakos.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.persistence.Column;

import lombok.Getter;

@Getter
public class MembersMainResponseDto {
    
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

    public MembersMainResponseDto(com.ktds.dakos.entity.Member entity) {
        this.id = entity.getId();
        this.mem_id = entity.getMem_id();
        this.mem_nm = entity.getMem_nm();
        this.mem_pw = entity.getMem_nm();
        this.stat_cd = entity.getStat_cd();
        this.lgn_ft_cnt = entity.getLgn_ft_cnt();
        this.mem_type = entity.getMem_type();
        this.opt_num = entity.getOpt_num();
        this.phone_num = entity.getPhone_num();
        this.modifiedDate = toStringDateTime((entity.getModifiedDate()));
    }

    /**
     * Java 8 버전
     */
    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");	
    }

    /**
     * Java 7 버전
     */
    private String toStringDateTimeByJava7(LocalDateTime localDateTime){
        if(localDateTime == null){
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return formatter.format(localDateTime);
    }

	@Override
	public String toString() {
		return "MembersMainResponseDto [id=" + id + ", mem_id=" + mem_id + ", mem_nm=" + mem_nm + ", mem_pw=" + mem_pw
				+ ", stat_cd=" + stat_cd + ", lgn_ft_cnt=" + lgn_ft_cnt + ", mem_type=" + mem_type + ", opt_num="
				+ opt_num + ", phone_num=" + phone_num + ", modifiedDate=" + modifiedDate + "]";
	}
    
    
}
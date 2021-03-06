package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

import lombok.Data;


@Data
@Entity
@Table(name="AIRTEL_CALLERTUNE")
public class AirtelCallerTune implements Serializable {
	@Id
	@Column(name="CUSTID",nullable=false,length=10)
	@Type(type="int")
	private int custId;
	@Column(name="CUSTNAME",nullable=false,length=10)
	@Type(type="string")
	private String custName;
	@Column(name="MOBILENO",nullable=false,length=10)
	@Type(type="long")
	private long mobileNo;
	@Column(name="CALLERTUNE",nullable=false,length=10)
	@Type(type="string")
	private String callerTune;
	
	@Column(name="UPDATIONSCOUNT",nullable=false,length=10)
	@Type(type="int")
	@Version
	private int updationsCount;
	
		

}

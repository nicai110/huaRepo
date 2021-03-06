package com.beasp.bean;

// Generated 2014-12-17 23:07:39 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 
@Entity
@Table(name = "bea_test", catalog = "bea_sys_db")
public class BeaTest implements java.io.Serializable {

	private long id;
	private String name;
	private String text;
	private Date insertDate;
	private String insertUser;

	public BeaTest() {
	}

	public BeaTest(long id) {
		this.id = id;
	}

	public BeaTest(long id, String name, String text, Date insertDate,
			String insertUser) {
		this.id = id;
		this.name = name;
		this.text = text;
		this.insertDate = insertDate;
		this.insertUser = insertUser;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "text", length = 500)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date", length = 19)
	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	@Column(name = "insert_user", length = 10)
	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

}

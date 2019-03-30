package com.Wfd.CartManagement.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Manager")
@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	@Column
	public String mName;
	//@OneToMany(cascade=CascadeType.ALL)
	//public List<Customer> customer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	
}

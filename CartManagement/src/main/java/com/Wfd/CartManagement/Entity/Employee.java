/**
 * 
 */
package com.Wfd.CartManagement.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Table(name="Employee")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer EmployeeId;
	@OneToMany(cascade=CascadeType.ALL)
	public List<Orders> orders;
	@Column
	public String Firstname;
    @Column
	public String lastname;
    @Column
	public String Title;
    @Column
	public String TitleOfCourtesy;
    @Column
  	public Date BirthDay;
    @Column
  	public Date HireDate;
    @Column
  	public String Address;
    @Column
  	public String City;
    @Column
  	public String Region;
    @Column
  	public Integer PostalCode;
    @Column
  	public String Country;
    @Column
  	public Integer MobileNo;
    @Column
  	public String ReportsTo;
    @Column
  	public String Notes;
	
	
    public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getTitleOfCourtesy() {
		return TitleOfCourtesy;
	}
	public void setTitleOfCourtesy(String titleOfCourtesy) {
		TitleOfCourtesy = titleOfCourtesy;
	}
	public Date getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;
	}
	public Date getHireDate() {
		return HireDate;
	}
	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public Integer getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(Integer postalCode) {
		PostalCode = postalCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Integer getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		MobileNo = mobileNo;
	}
	public String getReportsTo() {
		return ReportsTo;
	}
	public void setReportsTo(String reportsTo) {
		ReportsTo = reportsTo;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	
}

package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SinhVien {
	
	@Id
	private int id;
	private String email;
	private String username;
	private String password;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public SinhVien(int id, String email, String username, String password, String country) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.country = country;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", country=" + country + "]";
	}
	
	
	
}

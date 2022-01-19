package net.myblog.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 用户信息的实体类
 * @author Nicky
 */
@Entity
@Table(name="sys_user")
public class User {

	/** 用户Id**/
	private int id;
	
	/** 用户名**/
	private String username;
	
	/** 用户密码**/
	private String password;
	
	/** 手机号**/
	private int phone;
	
	/** 性别**/
	private String sex;
	
	/** 邮件**/
	private String email;
	
	/** 备注**/
	private String mark;
	
	/** 用户级别**/
	private String rank;
	
	/** 最后一次时间**/
	private String lastLogin;
	
	/** 登录ip**/
	private String loginIp;
	
	/** 图片路径**/
	private String imageUrl;
	
	/** 注册时间**/
	private Date regTime;
	
	/** 账号是否被锁定**/
	private Boolean locked = Boolean.FALSE;
	
	/** 权限**/
	private String rights;
	
	private Set<Role> roles;		
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(unique=true,length=100,nullable=false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(length=100,nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Column(length=6)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(length=100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=30)
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Column(length=10)
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Column(length=100)
	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Column(length=100)
	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	@Column(length=100)
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	 public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	@ManyToMany(targetEntity = Role.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "sys_user_role", joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id") , inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "roleId") )
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
	
}

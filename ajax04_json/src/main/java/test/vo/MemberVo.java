package test.vo;

import java.util.Date;       //sql.date 사용X?

public class MemberVo {
	private String id,pwd,email;
	private int age;
	private Date regdate;
	
	public MemberVo() {	}

	
	public MemberVo(String id, String pwd, String email, int age, Date regdate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
		this.regdate = regdate;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}

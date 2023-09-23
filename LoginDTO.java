package kr.or.smhrd.dto;

import java.util.Date;

public class LoginDTO {
	
	public class User {
	    private String u_id;
	    private String u_pw;
	    private String u_name;
	    private String u_email;
	    private String u_phone;
	    private Date u_birthdate;
	    private String u_gender;
	    private byte[] u_photo;

	    // Getter 구분
//	    public String getU_id() {
//	        return u_id;
//	    }
//
//	    public String getU_pw() {
//	        return u_pw;
//	    }
//
//	    public String getU_name() {
//	        return u_name;
//	    }
//
//	    public String getU_email() {
//	        return u_email;
//	    }
//
//	    public String getU_phone() {
//	        return u_phone;
//	    }
//
//	    public Date getU_birthdate() {
//	        return u_birthdate;
//	    }
//
//	    public String getU_gender() {
//	        return u_gender;
//	    }
//
//	    public byte[] getU_photo() {
//	        return u_photo;
//	    }

	    // Setter 구분
	    public void setU_id(String u_id) {
	        this.u_id = u_id;
	    }

	    public void setU_pw(String u_pw) {
	        this.u_pw = u_pw;
	    }

	    public void setU_name(String u_name) {
	        this.u_name = u_name;
	    }

	    public void setU_email(String u_email) {
	        this.u_email = u_email;
	    }

	    public void setU_phone(String u_phone) {
	        this.u_phone = u_phone;
	    }

	    public void setU_birthdate(Date u_birthdate) {
	        this.u_birthdate = u_birthdate;
	    }

	    public void setU_gender(String u_gender) {
	        this.u_gender = u_gender;
	    }

	    public void setU_photo(byte[] u_photo) {
	        this.u_photo = u_photo;
	    }
	}

	public Object getU_id() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_pw() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_name() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_email() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_phone() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_birthdate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_gender() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getU_photo() {
		// TODO Auto-generated method stub
		return null;
	}


}
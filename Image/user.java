package Image;

class user {    
	static String gender;          //static 을 사용하여 다같은 클래스에서 공유를 함
	static String form;
	static String situation;
	static int id;
	
	public String getGender() {      
		return gender;
	}
	public void setGender(String gender) {             
		this.gender = gender;     
	}
	public String getForm() {       
		return form;
	}
	public void setForm(String form) {     
		this.form = form;     
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public user() {
		// TODO Auto-generated constructor stub
	}
	public user(String gender, String form, String situation, int id) {
		super();     //상속
		this.gender = gender;
		this.form = form;
		this.situation = situation;
		this.id = id;
	}
	public static int getId() {      
		return id;
	}
	public static void setId(int id) {
		user.id = id;
	}

	
}





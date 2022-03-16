package spring.love.api;

public class RegistrationDTO {

	private String name;
	private String usernmae;
	private char[] password;
	private String countryName;
	private String[] hobbies;
	private String gender;
	private ContactUsDTO usDTO;
	
	

	public ContactUsDTO getUsDTO() {
		return usDTO;
	}

	public void setUsDTO(ContactUsDTO usDTO) {
		this.usDTO = usDTO;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsernmae() {
		return usernmae;
	}

	public void setUsernmae(String usernmae) {
		this.usernmae = usernmae;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

}

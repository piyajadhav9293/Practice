package spring.love.api;

public class Phone {

	private String countryCode;
	private String usernumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	@Override
	public String toString() {
		return getCountryCode() + " " + getUsernumber();
	}

}

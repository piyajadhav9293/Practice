package spring.love.api;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class UserInfoDTO {

	@NotBlank(message = "* username can not be blank")
	@Min(value = 3, message = "username can not be leass than three letters")
	@Max(value = 10)
	private String ownname;
	private String crushname;

	public String getOwnname() {
		return ownname;
	}

	public void setOwnname(String ownname) {
		this.ownname = ownname;
	}

	public String getCrushname() {
		return crushname;
	}

	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}

	@Override
	public String toString() {
		return "UerInfoDTO [ownname=" + ownname + ", crushname=" + crushname + "]";
	}

}

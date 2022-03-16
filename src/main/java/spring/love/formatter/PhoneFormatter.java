package spring.love.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import spring.love.api.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		Phone phone = new Phone();
		String[] splitarray = text.split("-");
		phone.setCountryCode(splitarray[0]);
		phone.setUsernumber(splitarray[1]);
		return phone;
	}

}

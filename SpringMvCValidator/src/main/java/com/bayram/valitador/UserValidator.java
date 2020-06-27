package com.bayram.valitador;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bayram.model.User;
@Component
public class UserValidator implements Validator {
	

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@SuppressWarnings("unused")
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "firstname","errors.firstname", "Ad kismi bos gecilemez");
		ValidationUtils.rejectIfEmpty(errors, "lastname", "errors.lastname","Soyad kismi bos gecilemez");
		ValidationUtils.rejectIfEmpty(errors, "age", "errors.age","Lütfen gecerli bir yas girinzi");
		
		User user=(User) target;

		
	}

}

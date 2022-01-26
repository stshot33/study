package chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class RegisterRequestValidator implements Validator {

	private static final String emailRegExp = "";

	private Pattern pattern;

	@Override
	public void validate(Object target, Errors errors) {

		RegisterRequest regReq = (RegisterRequest) target;

		if (regReq.getEmail() == null || regReq.getEmail().trim().isEmpty()) {
			errors.rejectValue("email", "required");
		} else {
			Matcher matcher = pattern.matcher(regReq.getEmail());
			if (!matcher.matches()) {
				errors.rejectValue("email", "bad");
			}
		}

		ValidationUtils.rejectIfEmpty(errors, "name", "required");
		ValidationUtils.rejectIfEmpty(errors, "password", "required");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "required");

		if (!regReq.getPassword().isEmpty()) {
			if (!regReq.getPassword().isEmpty()) {
				errors.rejectValue("confirmPasword", "notmatch");
			}
		}
	}
}

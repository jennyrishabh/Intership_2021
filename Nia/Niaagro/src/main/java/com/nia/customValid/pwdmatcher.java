package com.nia.customValid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = pwdmatch.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface pwdmatcher {
	
			public String value() default "CSE";
	
	
			public String message() default "plz enter the same password";
			
			
			public Class<?>[] groups() default {};
			
			
			public Class<? extends Payload>[] payload() default {};


}

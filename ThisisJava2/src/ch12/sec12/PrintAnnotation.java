package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD}) //적용 대상
@Retention(RetentionPolicy.RUNTIME) //유지 정책
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}

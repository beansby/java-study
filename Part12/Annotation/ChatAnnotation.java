package Part12.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 정의된 어노테이션
 * @Target : 어노테이션 적용 대상 지정
 * @Retention : 어노테이션 유지정책
 */
@Target({ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ChatAnnotation {
    String name();
    int age() default 20;
}

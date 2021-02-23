package micronaut.general;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Marks bean as validated by {@code io.micronaut.validation.validator.constraints.ConstraintValidator<BeanValidation, T>}.
 */
@Constraint(validatedBy = { })
@Target( { TYPE })
@Retention(RUNTIME)
@Documented
@Inherited
public @interface BeanValidation {

	String MESSAGE_TEMPLATE = "{luna.validator.failed}";

	String message() default MESSAGE_TEMPLATE;

}

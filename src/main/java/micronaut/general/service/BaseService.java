package micronaut.general.service;

import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext;
import micronaut.general.BeanValidation;
import micronaut.general.IBeanValidator;

import javax.annotation.Nonnull;

/**
 * @author Lukasz Frankowski
 */
public abstract class BaseService<T> implements IBeanValidator<T> {

	public boolean isValid(@Nonnull T entity,
						   @Nonnull AnnotationValue<BeanValidation> annotationMetadata,
						   @Nonnull ConstraintValidatorContext context) {
		return true;
	}


}

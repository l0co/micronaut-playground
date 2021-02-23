package micronaut.general;

import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext;

import javax.annotation.Nonnull;

/**
 * @author lukasz.frankowski@gmail.com
 */
public interface IBeanValidator<T> {

	public boolean isValid(@Nonnull T entity,
						   @Nonnull AnnotationValue<BeanValidation> annotationMetadata,
						   @Nonnull ConstraintValidatorContext context);

}

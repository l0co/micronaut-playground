package micronaut.general.service;

import io.micronaut.validation.Validated;
import micronaut.general.domain.BaseSoftDeletableEntity;

/**
 * @author Lukasz Frankowski
 */
@Validated // any @Around advice here causes the problem
public class BaseSoftDeletableEntityService<T extends BaseSoftDeletableEntity> extends BaseEntityService<T> {
}

package micronaut.general.service;

import micronaut.general.domain.BaseEntity;

/**
 * @author Lukasz Frankowski
 */
public abstract class BaseEntityService<T extends BaseEntity> extends BaseBroadcastableService<T> {
}

package micronaut.general.service;

import micronaut.general.domain.MyEntity;

import javax.inject.Singleton;

/**
 * @author Lukasz Frankowski
 */
@Singleton
public class MyEntityService extends BaseSoftDeletableEntityService<MyEntity> {
}

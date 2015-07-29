package org.ds1.persistence;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;
import org.ds1.model.Person;

@Repository
public interface DsPersonDao extends EntityRepository<Person, Long>{

}

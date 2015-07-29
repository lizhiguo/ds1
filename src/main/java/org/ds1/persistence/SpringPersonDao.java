package org.ds1.persistence;

import org.ds1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringPersonDao extends JpaRepository<Person, Long>{

}

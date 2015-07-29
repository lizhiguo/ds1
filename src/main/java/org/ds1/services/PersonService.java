package org.ds1.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.ds1.mapper.PersonMapper;
import org.ds1.model.Person;
import org.ds1.persistence.DsPersonDao;
import org.ds1.persistence.SpringPersonDao;
import org.mybatis.cdi.Mapper;

import com.github.pagehelper.PageHelper;

@Transactional
public class PersonService {
	@Inject
	DsPersonDao dsPersonDao;

	@Inject
	SpringPersonDao springPersonDao;
	
	@Inject
	@Mapper
	PersonMapper personMapper;
	
	public List<Person> getPersonAll_mapper(){
		PageHelper.startPage(1, 1);
		return personMapper.getPersonAll();
	}
	
	public List<Person> findAll() {
        assert springPersonDao != null;
        List<Person> Persons = new ArrayList<Person>();
        Iterator<Person> PersonIterator = springPersonDao.findAll().iterator();
        while (PersonIterator.hasNext()) {
            Persons.add(PersonIterator.next());
        }
        return Persons;
    }


    public Long save(Person Person) {
        assert springPersonDao != null;
        springPersonDao.save(Person);
        return Person.getId();
    }


    public List<Person> findAll2() {
        assert dsPersonDao != null;
        List<Person> Persons = new ArrayList<Person>();
        Iterator<Person> PersonIterator = dsPersonDao.findAll().iterator();
        while (PersonIterator.hasNext()) {
            Persons.add(PersonIterator.next());
        }
        return Persons;
    }


    public Long save2(Person Person) {
        assert dsPersonDao != null;
        dsPersonDao.save(Person);
        return Person.getId();
    }
}

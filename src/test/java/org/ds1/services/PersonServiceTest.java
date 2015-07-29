package org.ds1.services;

import java.util.List;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.ds1.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class PersonServiceTest {
	@Inject
	PersonService service;

	@Test
	public void testFindAll() throws Exception {
		service.findAll();
		Person p = new Person();
		p.setName("king2");
		service.save(p);
	}
	@Test
	public void testds() throws Exception {
		Person p = new Person();
		p.setName("king6");
		service.save2(p);
	}
	@Test
	public void testds_mapper() throws Exception {
		List<Person> ps = service.getPersonAll_mapper();
		for (Person person : ps) {
			System.out.println(person.getName());
		}
	}
}

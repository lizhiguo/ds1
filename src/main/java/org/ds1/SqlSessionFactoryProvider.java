package org.ds1;

import java.io.IOException;
import java.io.InputStream;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryProvider {
	@Produces
	@ApplicationScoped
	public SqlSessionFactory produceFactory() throws IOException {
		String resource = "org/ds1/mapper/mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	    return sqlSessionFactory;
	}
}

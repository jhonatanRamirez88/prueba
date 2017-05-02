package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.repository.CourseJpaRepository;

@Component("exampleComponent")
public class ExampleComponent {

	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	
	private static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	public void sayHello(){
		
		LOG.info("Hello FROM EXAMPLE COMPONENT");
	}
}

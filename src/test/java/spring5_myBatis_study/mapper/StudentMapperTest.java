package spring5_myBatis_study.mapper;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring5_myBatis_study.config.ContextRoot;
import spring5_myBatis_study.dto.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
public class StudentMapperTest {
	protected static final Log log = LogFactory.getLog(StudentMapperTest.class);
	
	@Autowired
	private StudentMapper mapper;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testSelectStudentById() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = mapper.selectStudentById(student);
		
		log.debug(selectStudent.toString());
		
		Assert.assertNotNull(student);
	}
	
	@Test
	public void testSelectStudentByIdWithResultMap() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = mapper.selectStudentByIdWithResultMap(student);
		
		log.debug(selectStudent.toString());
		
		Assert.assertNotNull(student);
	}
	
	@Test
	public void testSelectStudentByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		List<Student> list = mapper.selectStudentByAll();
		Assert.assertNotNull(list);
		
		list.stream().forEach(System.out::println);
	}

}

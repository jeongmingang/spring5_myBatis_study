package spring5_myBatis_study.mapper;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring5_myBatis_study.config.ContextRoot;
import spring5_myBatis_study.dto.Course;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseMapperTest {
	protected static final Log log = LogFactory.getLog(CourseMapperTest.class);
	
	@Autowired
	private CourseMapper mapper;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	// 동적SQL - if 조건
	@Test
	public void test01SelectCoursesByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		GregorianCalendar cal = new GregorianCalendar(2013, 2, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		
		List<Course> list = mapper.selectCoursesByCondition(map);
		Assert.assertNotNull(list);
		list.stream().forEach(s->log.debug(s.toString()));
	}
	
	@Test
	public void test02SelectCoursesByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		GregorianCalendar cal = new GregorianCalendar(2013, 2, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("courseName", "%Java%");
		
		List<Course> list = mapper.selectCoursesByCondition(map);
		Assert.assertNotNull(list);
		list.stream().forEach(s->log.debug(s.toString()));
	}
	
	@Test
	public void test03SelectCoursesByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		GregorianCalendar cal = new GregorianCalendar(2013, 2, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startDate", cal.getTime());
		
		List<Course> list = mapper.selectCoursesByCondition(map);
		Assert.assertNotNull(list);
		list.stream().forEach(s->log.debug(s.toString()));
	}
	
	// 동적SQL - choose 조건
	@Test
	public void test04SelectCaseCourses() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		
		List<Course> list = mapper.selectCaseCourses(map);
		Assert.assertNotNull(list);
		list.stream().forEach(s->log.debug(s.toString()));
		System.out.println();
		
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%Java%");
		
		list = mapper.selectCaseCourses(map);
		Assert.assertNotNull(list);
		list.stream().forEach(s->log.debug(s.toString()));
	}
	
	// 동적SQL - where 조건
	@Test
	public void test05SelectWhereCourses() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Map<String, Object> map = new HashMap<String, Object>();
		List<Course> list = mapper.selectCaseCourses(map);
		Assert.assertNotNull(list);
		list.stream().forEach(s->log.debug(s.toString()));
		
		map.put("tutorId", 1);
		list = mapper.selectWhereCourses(map);
		list.stream().forEach(s->log.debug(s.toString()));
		System.out.println();
		
		map.put("courseName", "%Java%");
		list = mapper.selectWhereCourses(map);
		list.stream().forEach(s->log.debug(s.toString()));
		System.out.println();
		
		map.clear();
		map.put("endDate", new Date());
		list = mapper.selectWhereCourses(map);
		list.stream().forEach(s->log.debug(s.toString()));
	}
}

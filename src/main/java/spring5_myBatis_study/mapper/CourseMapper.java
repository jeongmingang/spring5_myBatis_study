package spring5_myBatis_study.mapper;

import java.util.List;
import java.util.Map;

import spring5_myBatis_study.dto.Course;

public interface CourseMapper {
	// 동적SQL - if 조건
	List<Course> selectCoursesByCondition(Map<String, Object> map);
	// 동적SQL - choose 조건
	List<Course> selectCaseCourses(Map<String, Object> map);
	// 동적SQL - where 조건
	List<Course> selectWhereCourses(Map<String, Object> map);
}

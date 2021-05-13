package spring5_myBatis_study.service;

import java.util.Map;

import spring5_myBatis_study.dto.Student;

public interface StudentService {
	Map<Integer, Student> selectStudentForMap();
	
	Map<Integer, String> selectStudentForMap(int studId);
	Map<Integer, Student> selectStudentForMap2(int studId);
}

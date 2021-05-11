package spring5_myBatis_study.mapper;

import java.util.List;

import spring5_myBatis_study.dto.Student;

public interface StudentMapper {
	Student selectStudentById(Student student);
	Student selectStudentByIdWithResultMap(Student student);
	List<Student> selectStudentByAll();
	
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
}

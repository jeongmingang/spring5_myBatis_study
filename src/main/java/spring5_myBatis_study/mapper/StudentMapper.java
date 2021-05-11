package spring5_myBatis_study.mapper;

import spring5_myBatis_study.dto.Student;

public interface StudentMapper {
	Student selectStudentById(Student student);
}

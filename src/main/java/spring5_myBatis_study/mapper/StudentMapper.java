package spring5_myBatis_study.mapper;

import java.util.List;
import java.util.Map;

import spring5_myBatis_study.dto.Student;

public interface StudentMapper {
	Student selectStudentById(Student student);
	Student selectStudentByIdWithResultMap(Student student);
	List<Student> selectStudentByAll();
	
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
	
	//Result - HashMap
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	/* 내포된 결과매핑(ResultMap)을 사용한 일대일 매핑 */
	Student selectStudentByIdAssociation(Student student);
	
	/* enum 타입 다루기 */
	int insertEnumStudent(Student student);
}

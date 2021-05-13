package spring5_myBatis_study.mapper;

import spring5_myBatis_study.dto.Tutor;

public interface TutorMapper {
	Tutor selectTutorByTutorId(Tutor tutor);
	
	// Transaction
	int insertTutor(Tutor tutor);
	int deleteTutor(int tutorId);
}

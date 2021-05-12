package spring5_myBatis_study.mapper;

import spring5_myBatis_study.dto.Tutor;

public interface TutorMapper {
	Tutor selectTutorByTutorId(Tutor tutor);
}

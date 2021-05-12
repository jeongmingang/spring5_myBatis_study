package spring5_myBatis_study.mapper;

import spring5_myBatis_study.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic getUserPic(int id);
	int deleteUserPic(int id);
}

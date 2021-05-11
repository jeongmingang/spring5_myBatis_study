select user (), database ();

select * from addresses;
select * from students;
select * from tutors;
select * from courses;
select * from course_enrollment;

select stud_id, name, email, dob, phone
	from students
 where stud_id = 1;

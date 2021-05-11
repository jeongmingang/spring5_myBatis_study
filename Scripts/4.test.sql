select user (), database ();

select * from addresses;
select * from students;
select * from tutors;
select * from courses;
select * from course_enrollment;

select stud_id, name, email, dob, phone
	from students
 where stud_id = 1;

select stud_id, name, email, dob,
		substring(phone, 1, 3) as f,
		substring(phone, 5, 3) as m,
		substring(phone, 9, 4) as l
	from students where stud_id = 1;

select stud_id, name, email, phone, dob from students;

insert into students (stud_id, name, email, phone, dob)
 values(3, '홍길동3', 'lee@test.co.kr', '010-1234-1234', '1990-03-28');

update students
	set name = '홍길동전', email = 'hong@test.co.kr', phone = '987-654-3211', dob = '1989-08-13'
 where stud_id = 3;

delete from students where stud_id = 3;
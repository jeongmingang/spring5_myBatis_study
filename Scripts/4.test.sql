select user (), database ();

select * from addresses;
select * from students;
select * from tutors;
select * from courses;
select * from course_enrollment;
select * from user_pics;

desc user_pics;

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

-- 조인
select stud_id, name, email, phone, dob, a.addr_id, street, city, state, zip, country
	from students s 
	join addresses a 
		on s.addr_id = a.addr_id
where stud_id = 1;

-- 일대 다(1:N) 매핑
select t.tutor_id
	 , t.name as tutor_name
	 , email
	 , c.course_id
	 , c.name
	 , description
	 , start_date
	 , end_date
	from tutors t join courses c on t.tutor_id = c.tutor_id
 where t.tutor_id = 1;

delete from students where stud_id > 2;
select * from students;

select stud_id, name, email, phone, dob from students WHERE name = 'Timothy' and email = 'timothy@gmail.com';

-- 동적 sql if 조건
select course_id, name, description, start_date, end_date, tutor_id 
	from courses;

select course_id, name, description, start_date, end_date, tutor_id 
	from courses 
 where tutor_id = 4;

select course_id, name, description, start_date, end_date, tutor_id 
	from courses
 where name like '%java%';

select course_id, name, description, start_date, end_date, tutor_id 
	from courses
 where tutor_id = 1 and name like '%java%';

select course_id, name, description, start_date, end_date, tutor_id 
	from courses
 where start_date >= '2013-02-01';

select course_id, name, description, start_date, end_date, tutor_id 
	from courses
 where end_date <= '2013-07-01';

select course_id, name, description, start_date, end_date, tutor_id 
	from courses
 where start_date >= '2013-02-01' and end_date <= '2013-07-01';

select course_id, name, description, start_date, end_date, tutor_id 
	from courses
 where start_date >= '2013-02-01' or end_date <= '2013-07-01';

select * from courses;
delete from courses where course_id > 3;

select * from tutors;
delete from tutors where tutor_id = 5;

select tutor_id, name, email, phone, dob, bio, pic, addr_id
	from tutors 
 where tutor_id = 1;

		delete
			from courses
		 where course_id=7;

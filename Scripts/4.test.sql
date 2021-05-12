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
 

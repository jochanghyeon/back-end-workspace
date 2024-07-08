INSERT INTO employee VALUES(300, '전지우', '700101-1234567');

SELECT emp_name, emp_no, dept_code, salary

FROM employee

WHERE  salary >= 3000000

AND email LIKE '___ㅂ_' escape 'ㅂ' and

dept_code = 'D6' or dept_code = 'D9';



SELECT emp_name, emp_no, dept_code, salary

FROM employee

WHERE (dept_code = 'D9' or dept_code = 'D6')

AND salary >= 3000000

AND email LIKE '___ㅂ_%' escape'ㅂ';

SELECT * FROM employee WHERE bonus is null;


INSERT INTO employee(emp_id, emp_name, emp_no) VALUES(300, '전지우', '700101-1234567');

SELECT dept_code, sum(salary) 합계, avg(salary) 평균, count(*) 인원수

FROM employee

WHERE salary >= 2800000

GROUP BY dept_code

ORDER BY dept_code;


SELECT job_code, avg(salary)

FROM employee

where bonus is not null

GROUP BY job_code

HAVING avg(salary) >= 3000000;
/*mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm */ 
SELECT dept_code, sum(salary) 합계, avg(salary) 평균, count(*) 인원수

FROM employee

GROUP BY dept_code

having avg(salary) > 2800000

ORDER BY dept_code;
/*mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm */
SELECT dept_code, sum(salary) 합계, avg(salary) 평균, count(*) 인원수

FROM employee

WHERE salary > 2800000

GROUP BY dept_code

ORDER BY dept_code;

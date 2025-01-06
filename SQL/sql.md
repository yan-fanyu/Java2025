```mysql

create table course (
    id varchar(10) primary key ,
    name varchar(20)
);

insert into course values ('040001', '数据结构');
insert into course values ('040002', '操作系统');
insert into course values ('040003', '计算机组成原理');
insert into course values ('040004', '计算机网络');
insert into course values ('040005', '数据库');
insert into course values ('010001', '通信原理');
insert into course values ('010002', '单片机');
insert into course values ('010003', '信号与系统');
insert into course values ('020001', '数字电路');
insert into course values ('020002', '模拟电路');
insert into course values ('020003', '电路分析');

create table student_course (
    studentid char(10),
    courseid  char(5),
    primary key (studentid, courseid)
);

insert into student_course values ('1024010101', '04001');
insert into student_course values ('1024010102', '04001');
insert into student_course values ('1024010103', '04001');
insert into student_course values ('1024010104', '04001');
insert into student_course values ('1024010105', '04001');
insert into student_course values ('1024010106', '04001');
insert into student_course values ('1024010107', '04001');
insert into student_course values ('1024010108', '04001');
insert into student_course values ('1024010109', '04001');
insert into student_course values ('1024010110', '04001');

update student_course set courseid = '01001' where studentid between '1024010101' and '1024010110';

insert into student_course values ('1024010105', '04001');
insert into student_course values ('1024010106', '04003');
insert into student_course values ('1024010107', '04002');
insert into student_course values ('1024010108', '04005');

select * from student_course;


insert into student_course values ('1024040901', '04001');
insert into student_course values ('1024040902', '04001');
insert into student_course values ('1024040903', '04001');
insert into student_course values ('1024040904', '04001');
insert into student_course values ('1024040905', '04001');
insert into student_course values ('1024040906', '04001');
insert into student_course values ('1024040907', '04001');
insert into student_course values ('1024040908', '04001');
insert into student_course values ('1024040909', '04001');

insert into student_course values ('1024040901', '04002');
insert into student_course values ('1024040904', '04002');
insert into student_course values ('1024040906', '04002');
insert into student_course values ('1024040907', '04002');
insert into student_course values ('1024040908', '04002');

insert into student_course values ('1024040902', '04003');
insert into student_course values ('1024040904', '04003');
insert into student_course values ('1024040906', '04003');
insert into student_course values ('1024040909', '04003');
insert into student_course values ('1024040908', '04003');
insert into student_course values ('1024040903', '04003');

insert into student_course values ('1024040901', '04004');
insert into student_course values ('1024040904', '04004');
insert into student_course values ('1024040908', '04004');
insert into student_course values ('1024040902', '04004');

insert into student_course values ('1024040908', '01001');
insert into student_course values ('1024040902', '01001');

insert into student_course values ('1024040904', '通信原理');
insert into student_course values ('1024040906', '通信原理');

insert into student_course values ('1024040901', '01002');
insert into student_course values ('1024040904', '01002');

insert into student_course values ('1024040904', '02001');
insert into student_course values ('1024040905', '02002');



drop table student_course;

select * from student order by id;

insert into student values ('XiaoMing', 24, '1024010102', '深圳', '男', '2024-09-10', 'tel');
insert into student values ('LiuCong', 24, '1024010104', '南京', '男', '2024-09-10', 'tel');
insert into student values ('LuWeiling', 24, '1024010107', '上海', '男', '2024-09-10', 'tel');
insert into student values ('Cailun', 24, '1024010109', '北京', '男', '2024-09-10', 'tel');
insert into student values ('GaoGong', 24, '1024010108', '北京', '男', '2024-09-10', 'tel');
insert into student values ('YangXiucai', 24, '1024010110', '杭州', '男', '2024-09-10', 'tel');

insert into student values ('RenZhiyuan', 24, '1024020101', '上海', '男', '2024-09-10', 'electronics');
insert into student values ('LuPen', 24, '1024020103', '杭州', '男', '2024-09-10', 'electronics');
insert into student values ('BaiLin', 24, '1024020104', '深圳', '男', '2024-09-10', 'electronics');
insert into student values ('XueDinge', 24, '1024020106', '南京', '男', '2024-09-10', 'electronics');
insert into student values ('DingYi', 24, '1024020107', '杭州', '男', '2024-09-10', 'electronics');
insert into student values ('MaoA', 24, '1024020108', '南京', '男', '2024-09-10', 'electronics');
insert into student values ('SanMao', 24, '1024020109', '苏州', '男', '2024-09-10', 'electronics');
insert into student values ('MengNai', 24, '1024020110', '杭州', '男', '2024-09-10', 'electronics');

```
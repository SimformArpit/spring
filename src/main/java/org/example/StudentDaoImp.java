package org.example;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImp implements StudentDao {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override

    public int insert(Student student) {
        String query = "insert into student(id,name,city) values(?,?,?)";
        int update = template.update(query, student.getId(), student.getName(), student.getCity());
        return update;
    }

    @Override
    public int change(Student student) {
        String query = "update student set name=? , city=? where id=?";
        int result = template.update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        int result = template.update(query, studentId);
        return result;
    }

    @Override
    public List<Student> getALlStudents() {
        String query = "select * from student";
        List<Student> query1 = template.query(query, new RowMapperImp());
        return query1;
    }

    public Student getStudentDetail(int studentId){
        String query = "select * from student where id=?";
        RowMapper<Student> rowMaper = new RowMapperImp();
        Student student = template.queryForObject(query, rowMaper, studentId);
        return student;

    }


}

package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentDaoImp studentDao = context.getBean("studentDaoImp", StudentDaoImp.class);
        Student student = new Student();
//        student.setId(8);
//        student.setName("hardeek");
//        student.setCity("ahmedabad");
//        int result = studentDao.insert(student);
//        System.out.println("inserted " + result + " rows into the database");
//        student.setId(4);
//        student.setName("mohit");
//        student.setCity("vadodara");
//        int change = studentDao.change(student);
//        System.out.println("rows updated " + change);
//        int delete = studentDao.delete(6);
//        delete += studentDao.delete(4);
//        System.out.println(delete);
//        Student studentDetail = studentDao.getStudentDetail(1);
//        System.out.println(studentDetail);
            studentDao.getALlStudents().forEach(System.out::println);
    }
}
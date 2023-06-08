package org.example;

public interface StudentDao {
    public int insert(Student student);

    public int change(Student student);

    public int delete(int student);
}

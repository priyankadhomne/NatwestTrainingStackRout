package org.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeCrud {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    // create table with column
    void createTable(){
        jdbcTemplate.execute("create table emp20(id int,name varchar(30),dept varchar(30))");
        System.out.println("Table created");
    }

    // add data
    void insertData() {
        jdbcTemplate.execute("insert into emp20 values(1,'Meena','HR')");
        System.out.println("Data inserted successfully");
    }

    // add multiple data
    void insertMultipleData() {
        jdbcTemplate.execute("insert into emp20 values(2,'Dhiraj','HR')");
        jdbcTemplate.execute("insert into emp20 values(3,'Kumar','Tech')");
        jdbcTemplate.execute("insert into emp20 values(4,'Shital','Tester')");
        jdbcTemplate.execute("insert into emp20 values(5,'Kalyani','Dev')");
    }

    // Update the data
//    int updateData(Employee e) {
//        String query = e.getId()+e.getName()+e.getDept();
//        return jdbcTemplate.update(query);
//    }
    int updateData(Employee e) {
        String query = "UPDATE emp20 SET name=?, dept=? WHERE id=?";
        return jdbcTemplate.update(query, e.getName(), e.getDept(), e.getId());
    }

    int deleteData(int id) {
        String query = "delete from emp20 where id = ?";
        return jdbcTemplate.update(query,id);
    }

}

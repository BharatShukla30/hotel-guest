package com.hotel.management.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GuestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createTable(){
        var query = "CREATE TABLE guest(id SERIAL PRIMARY KEY, name varchar(255) NOT NULL, aadhar int NOT NULL);";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
        return update;
    }
}

package com.example.db2jdl.service;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {
    static Connection connection;
    static DSLContext dslContext;
    public static Connection getConnection(){
        if (connection==null) {
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nitex", "postgres", "123456");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static DSLContext create() {
        if (dslContext == null) {
            dslContext = DSL.using(getConnection(), SQLDialect.POSTGRES);
        }
        return dslContext;
    }
}

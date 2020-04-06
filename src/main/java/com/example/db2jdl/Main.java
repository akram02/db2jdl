package com.example.db2jdl;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("localhost", "user", "pass");
        DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);
        Result<Record> result = create.select().from("USERS").fetch();
    }
}

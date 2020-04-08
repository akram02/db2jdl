package com.example.db2jdl;

import static com.example.db2jdl.service.InformationSchemaService.getAllTableName;

public class Main {
    public static void main(String[] args)  {
        getAllTableName().forEach(System.out::println);
    }
}
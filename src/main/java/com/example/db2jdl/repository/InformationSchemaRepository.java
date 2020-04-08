package com.example.db2jdl.repository;

import com.example.postgresqinformationschema.InformationSchema;
import static com.example.db2jdl.service.ConnectionService.*;
import java.util.List;

public class InformationSchemaRepository {

    public static List<String> getAllTableName() {
        return create().select(
                InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_NAME)
                .from(InformationSchema.INFORMATION_SCHEMA.TABLES)
                .fetch()
                .getValues(InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_NAME);
    }

}

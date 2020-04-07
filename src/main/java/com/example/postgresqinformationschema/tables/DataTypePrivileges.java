/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.DataTypePrivilegesRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataTypePrivileges extends TableImpl<DataTypePrivilegesRecord> {

    private static final long serialVersionUID = -213835377;

    /**
     * The reference instance of <code>information_schema.data_type_privileges</code>
     */
    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = new DataTypePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataTypePrivilegesRecord> getRecordType() {
        return DataTypePrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.data_type_privileges.object_schema</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.data_type_privileges.object_name</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.data_type_privileges.object_type</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.data_type_privileges</code> table reference
     */
    public DataTypePrivileges() {
        this(DSL.name("data_type_privileges"), null);
    }

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code> table reference
     */
    public DataTypePrivileges(String alias) {
        this(DSL.name(alias), DATA_TYPE_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code> table reference
     */
    public DataTypePrivileges(Name alias) {
        this(alias, DATA_TYPE_PRIVILEGES);
    }

    private DataTypePrivileges(Name alias, Table<DataTypePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DataTypePrivileges(Name alias, Table<DataTypePrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DataTypePrivileges(Table<O> child, ForeignKey<O, DataTypePrivilegesRecord> key) {
        super(child, key, DATA_TYPE_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public DataTypePrivileges as(String alias) {
        return new DataTypePrivileges(DSL.name(alias), this);
    }

    @Override
    public DataTypePrivileges as(Name alias) {
        return new DataTypePrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(String name) {
        return new DataTypePrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(Name name) {
        return new DataTypePrivileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
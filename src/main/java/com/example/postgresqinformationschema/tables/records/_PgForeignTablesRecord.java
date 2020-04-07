/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables.records;


import com.example.postgresqinformationschema.tables._PgForeignTables;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class _PgForeignTablesRecord extends TableRecordImpl<_PgForeignTablesRecord> implements Record7<String, String, String, String[], String, String, String> {

    private static final long serialVersionUID = -1423674075;

    /**
     * Setter for <code>information_schema._pg_foreign_tables.foreign_table_catalog</code>.
     */
    public void setForeignTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.foreign_table_catalog</code>.
     */
    public String getForeignTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_tables.foreign_table_schema</code>.
     */
    public void setForeignTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.foreign_table_schema</code>.
     */
    public String getForeignTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_tables.foreign_table_name</code>.
     */
    public void setForeignTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.foreign_table_name</code>.
     */
    public String getForeignTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_tables.ftoptions</code>.
     */
    public void setFtoptions(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.ftoptions</code>.
     */
    public String[] getFtoptions() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_tables.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_tables.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_tables.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_tables.authorization_identifier</code>.
     */
    public String getAuthorizationIdentifier() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String[], String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String[], String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return _PgForeignTables._PG_FOREIGN_TABLES.FOREIGN_TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return _PgForeignTables._PG_FOREIGN_TABLES.FOREIGN_TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return _PgForeignTables._PG_FOREIGN_TABLES.FOREIGN_TABLE_NAME;
    }

    @Override
    public Field<String[]> field4() {
        return _PgForeignTables._PG_FOREIGN_TABLES.FTOPTIONS;
    }

    @Override
    public Field<String> field5() {
        return _PgForeignTables._PG_FOREIGN_TABLES.FOREIGN_SERVER_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return _PgForeignTables._PG_FOREIGN_TABLES.FOREIGN_SERVER_NAME;
    }

    @Override
    public Field<String> field7() {
        return _PgForeignTables._PG_FOREIGN_TABLES.AUTHORIZATION_IDENTIFIER;
    }

    @Override
    public String component1() {
        return getForeignTableCatalog();
    }

    @Override
    public String component2() {
        return getForeignTableSchema();
    }

    @Override
    public String component3() {
        return getForeignTableName();
    }

    @Override
    public String[] component4() {
        return getFtoptions();
    }

    @Override
    public String component5() {
        return getForeignServerCatalog();
    }

    @Override
    public String component6() {
        return getForeignServerName();
    }

    @Override
    public String component7() {
        return getAuthorizationIdentifier();
    }

    @Override
    public String value1() {
        return getForeignTableCatalog();
    }

    @Override
    public String value2() {
        return getForeignTableSchema();
    }

    @Override
    public String value3() {
        return getForeignTableName();
    }

    @Override
    public String[] value4() {
        return getFtoptions();
    }

    @Override
    public String value5() {
        return getForeignServerCatalog();
    }

    @Override
    public String value6() {
        return getForeignServerName();
    }

    @Override
    public String value7() {
        return getAuthorizationIdentifier();
    }

    @Override
    public _PgForeignTablesRecord value1(String value) {
        setForeignTableCatalog(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord value2(String value) {
        setForeignTableSchema(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord value3(String value) {
        setForeignTableName(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord value4(String... value) {
        setFtoptions(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord value5(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord value6(String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord value7(String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    public _PgForeignTablesRecord values(String value1, String value2, String value3, String[] value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _PgForeignTablesRecord
     */
    public _PgForeignTablesRecord() {
        super(_PgForeignTables._PG_FOREIGN_TABLES);
    }

    /**
     * Create a detached, initialised _PgForeignTablesRecord
     */
    public _PgForeignTablesRecord(String foreignTableCatalog, String foreignTableSchema, String foreignTableName, String[] ftoptions, String foreignServerCatalog, String foreignServerName, String authorizationIdentifier) {
        super(_PgForeignTables._PG_FOREIGN_TABLES);

        set(0, foreignTableCatalog);
        set(1, foreignTableSchema);
        set(2, foreignTableName);
        set(3, ftoptions);
        set(4, foreignServerCatalog);
        set(5, foreignServerName);
        set(6, authorizationIdentifier);
    }
}

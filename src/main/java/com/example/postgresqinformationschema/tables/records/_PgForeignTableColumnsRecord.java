/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables.records;


import com.example.postgresqinformationschema.tables._PgForeignTableColumns;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class _PgForeignTableColumnsRecord extends TableRecordImpl<_PgForeignTableColumnsRecord> implements Record4<String, String, String, String[]> {

    private static final long serialVersionUID = 394645744;

    /**
     * Setter for <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    public void setNspname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    public String getNspname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    public void setRelname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    public String getRelname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    public void setAttname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    public String getAttname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    public void setAttfdwoptions(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    public String[] getAttfdwoptions() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.NSPNAME;
    }

    @Override
    public Field<String> field2() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.RELNAME;
    }

    @Override
    public Field<String> field3() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.ATTNAME;
    }

    @Override
    public Field<String[]> field4() {
        return _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS.ATTFDWOPTIONS;
    }

    @Override
    public String component1() {
        return getNspname();
    }

    @Override
    public String component2() {
        return getRelname();
    }

    @Override
    public String component3() {
        return getAttname();
    }

    @Override
    public String[] component4() {
        return getAttfdwoptions();
    }

    @Override
    public String value1() {
        return getNspname();
    }

    @Override
    public String value2() {
        return getRelname();
    }

    @Override
    public String value3() {
        return getAttname();
    }

    @Override
    public String[] value4() {
        return getAttfdwoptions();
    }

    @Override
    public _PgForeignTableColumnsRecord value1(String value) {
        setNspname(value);
        return this;
    }

    @Override
    public _PgForeignTableColumnsRecord value2(String value) {
        setRelname(value);
        return this;
    }

    @Override
    public _PgForeignTableColumnsRecord value3(String value) {
        setAttname(value);
        return this;
    }

    @Override
    public _PgForeignTableColumnsRecord value4(String... value) {
        setAttfdwoptions(value);
        return this;
    }

    @Override
    public _PgForeignTableColumnsRecord values(String value1, String value2, String value3, String[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _PgForeignTableColumnsRecord
     */
    public _PgForeignTableColumnsRecord() {
        super(_PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create a detached, initialised _PgForeignTableColumnsRecord
     */
    public _PgForeignTableColumnsRecord(String nspname, String relname, String attname, String[] attfdwoptions) {
        super(_PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS);

        set(0, nspname);
        set(1, relname);
        set(2, attname);
        set(3, attfdwoptions);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records._PgForeignServersRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class _PgForeignServers extends TableImpl<_PgForeignServersRecord> {

    private static final long serialVersionUID = -429711655;

    /**
     * The reference instance of <code>information_schema._pg_foreign_servers</code>
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = new _PgForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignServersRecord> getRecordType() {
        return _PgForeignServersRecord.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public final TableField<_PgForeignServersRecord, Long> OID = createField(DSL.name("oid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public final TableField<_PgForeignServersRecord, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField(DSL.name("foreign_server_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField(DSL.name("foreign_server_version"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public final TableField<_PgForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema._pg_foreign_servers</code> table reference
     */
    public _PgForeignServers() {
        this(DSL.name("_pg_foreign_servers"), null);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code> table reference
     */
    public _PgForeignServers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code> table reference
     */
    public _PgForeignServers(Name alias) {
        this(alias, _PG_FOREIGN_SERVERS);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> _PgForeignServers(Table<O> child, ForeignKey<O, _PgForeignServersRecord> key) {
        super(child, key, _PG_FOREIGN_SERVERS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignServers as(String alias) {
        return new _PgForeignServers(DSL.name(alias), this);
    }

    @Override
    public _PgForeignServers as(Name alias) {
        return new _PgForeignServers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(String name) {
        return new _PgForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(Name name) {
        return new _PgForeignServers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String[], String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.ForeignServerOptionsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class ForeignServerOptions extends TableImpl<ForeignServerOptionsRecord> {

    private static final long serialVersionUID = -1889106331;

    /**
     * The reference instance of <code>information_schema.foreign_server_options</code>
     */
    public static final ForeignServerOptions FOREIGN_SERVER_OPTIONS = new ForeignServerOptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignServerOptionsRecord> getRecordType() {
        return ForeignServerOptionsRecord.class;
    }

    /**
     * The column <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    public final TableField<ForeignServerOptionsRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    public final TableField<ForeignServerOptionsRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_server_options.option_name</code>.
     */
    public final TableField<ForeignServerOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_server_options.option_value</code>.
     */
    public final TableField<ForeignServerOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.foreign_server_options</code> table reference
     */
    public ForeignServerOptions() {
        this(DSL.name("foreign_server_options"), null);
    }

    /**
     * Create an aliased <code>information_schema.foreign_server_options</code> table reference
     */
    public ForeignServerOptions(String alias) {
        this(DSL.name(alias), FOREIGN_SERVER_OPTIONS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_server_options</code> table reference
     */
    public ForeignServerOptions(Name alias) {
        this(alias, FOREIGN_SERVER_OPTIONS);
    }

    private ForeignServerOptions(Name alias, Table<ForeignServerOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignServerOptions(Name alias, Table<ForeignServerOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignServerOptions(Table<O> child, ForeignKey<O, ForeignServerOptionsRecord> key) {
        super(child, key, FOREIGN_SERVER_OPTIONS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ForeignServerOptions as(String alias) {
        return new ForeignServerOptions(DSL.name(alias), this);
    }

    @Override
    public ForeignServerOptions as(Name alias) {
        return new ForeignServerOptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServerOptions rename(String name) {
        return new ForeignServerOptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServerOptions rename(Name name) {
        return new ForeignServerOptions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

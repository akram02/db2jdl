/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.ViewColumnUsageRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class ViewColumnUsage extends TableImpl<ViewColumnUsageRecord> {

    private static final long serialVersionUID = 1160081651;

    /**
     * The reference instance of <code>information_schema.view_column_usage</code>
     */
    public static final ViewColumnUsage VIEW_COLUMN_USAGE = new ViewColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewColumnUsageRecord> getRecordType() {
        return ViewColumnUsageRecord.class;
    }

    /**
     * The column <code>information_schema.view_column_usage.view_catalog</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> VIEW_CATALOG = createField(DSL.name("view_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_column_usage.view_schema</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> VIEW_SCHEMA = createField(DSL.name("view_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_column_usage.view_name</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> VIEW_NAME = createField(DSL.name("view_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_column_usage.table_catalog</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_column_usage.table_schema</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_column_usage.table_name</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_column_usage.column_name</code>.
     */
    public final TableField<ViewColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.view_column_usage</code> table reference
     */
    public ViewColumnUsage() {
        this(DSL.name("view_column_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.view_column_usage</code> table reference
     */
    public ViewColumnUsage(String alias) {
        this(DSL.name(alias), VIEW_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.view_column_usage</code> table reference
     */
    public ViewColumnUsage(Name alias) {
        this(alias, VIEW_COLUMN_USAGE);
    }

    private ViewColumnUsage(Name alias, Table<ViewColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewColumnUsage(Name alias, Table<ViewColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewColumnUsage(Table<O> child, ForeignKey<O, ViewColumnUsageRecord> key) {
        super(child, key, VIEW_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ViewColumnUsage as(String alias) {
        return new ViewColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ViewColumnUsage as(Name alias) {
        return new ViewColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewColumnUsage rename(String name) {
        return new ViewColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewColumnUsage rename(Name name) {
        return new ViewColumnUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

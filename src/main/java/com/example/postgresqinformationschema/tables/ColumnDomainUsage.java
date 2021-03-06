/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.ColumnDomainUsageRecord;

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
public class ColumnDomainUsage extends TableImpl<ColumnDomainUsageRecord> {

    private static final long serialVersionUID = -2030104307;

    /**
     * The reference instance of <code>information_schema.column_domain_usage</code>
     */
    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = new ColumnDomainUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnDomainUsageRecord> getRecordType() {
        return ColumnDomainUsageRecord.class;
    }

    /**
     * The column <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.table_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.column_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.column_domain_usage</code> table reference
     */
    public ColumnDomainUsage() {
        this(DSL.name("column_domain_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code> table reference
     */
    public ColumnDomainUsage(String alias) {
        this(DSL.name(alias), COLUMN_DOMAIN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code> table reference
     */
    public ColumnDomainUsage(Name alias) {
        this(alias, COLUMN_DOMAIN_USAGE);
    }

    private ColumnDomainUsage(Name alias, Table<ColumnDomainUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnDomainUsage(Name alias, Table<ColumnDomainUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ColumnDomainUsage(Table<O> child, ForeignKey<O, ColumnDomainUsageRecord> key) {
        super(child, key, COLUMN_DOMAIN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnDomainUsage as(String alias) {
        return new ColumnDomainUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnDomainUsage as(Name alias) {
        return new ColumnDomainUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnDomainUsage rename(String name) {
        return new ColumnDomainUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnDomainUsage rename(Name name) {
        return new ColumnDomainUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

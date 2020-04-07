/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.DomainUdtUsageRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class DomainUdtUsage extends TableImpl<DomainUdtUsageRecord> {

    private static final long serialVersionUID = -829599325;

    /**
     * The reference instance of <code>information_schema.domain_udt_usage</code>
     */
    public static final DomainUdtUsage DOMAIN_UDT_USAGE = new DomainUdtUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainUdtUsageRecord> getRecordType() {
        return DomainUdtUsageRecord.class;
    }

    /**
     * The column <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> UDT_NAME = createField(DSL.name("udt_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.domain_udt_usage</code> table reference
     */
    public DomainUdtUsage() {
        this(DSL.name("domain_udt_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.domain_udt_usage</code> table reference
     */
    public DomainUdtUsage(String alias) {
        this(DSL.name(alias), DOMAIN_UDT_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.domain_udt_usage</code> table reference
     */
    public DomainUdtUsage(Name alias) {
        this(alias, DOMAIN_UDT_USAGE);
    }

    private DomainUdtUsage(Name alias, Table<DomainUdtUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainUdtUsage(Name alias, Table<DomainUdtUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DomainUdtUsage(Table<O> child, ForeignKey<O, DomainUdtUsageRecord> key) {
        super(child, key, DOMAIN_UDT_USAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public DomainUdtUsage as(String alias) {
        return new DomainUdtUsage(DSL.name(alias), this);
    }

    @Override
    public DomainUdtUsage as(Name alias) {
        return new DomainUdtUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainUdtUsage rename(String name) {
        return new DomainUdtUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainUdtUsage rename(Name name) {
        return new DomainUdtUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}

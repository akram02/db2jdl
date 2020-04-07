/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.RoleUsageGrantsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class RoleUsageGrants extends TableImpl<RoleUsageGrantsRecord> {

    private static final long serialVersionUID = -375066119;

    /**
     * The reference instance of <code>information_schema.role_usage_grants</code>
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = new RoleUsageGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleUsageGrantsRecord> getRecordType() {
        return RoleUsageGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_usage_grants.grantor</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.grantee</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_catalog</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_schema</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_name</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.privilege_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.is_grantable</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.role_usage_grants</code> table reference
     */
    public RoleUsageGrants() {
        this(DSL.name("role_usage_grants"), null);
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table reference
     */
    public RoleUsageGrants(String alias) {
        this(DSL.name(alias), ROLE_USAGE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table reference
     */
    public RoleUsageGrants(Name alias) {
        this(alias, ROLE_USAGE_GRANTS);
    }

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RoleUsageGrants(Table<O> child, ForeignKey<O, RoleUsageGrantsRecord> key) {
        super(child, key, ROLE_USAGE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleUsageGrants as(String alias) {
        return new RoleUsageGrants(DSL.name(alias), this);
    }

    @Override
    public RoleUsageGrants as(Name alias) {
        return new RoleUsageGrants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(String name) {
        return new RoleUsageGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(Name name) {
        return new RoleUsageGrants(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}

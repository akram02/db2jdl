/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.ApplicableRolesRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class ApplicableRoles extends TableImpl<ApplicableRolesRecord> {

    private static final long serialVersionUID = -136565633;

    /**
     * The reference instance of <code>information_schema.applicable_roles</code>
     */
    public static final ApplicableRoles APPLICABLE_ROLES = new ApplicableRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicableRolesRecord> getRecordType() {
        return ApplicableRolesRecord.class;
    }

    /**
     * The column <code>information_schema.applicable_roles.grantee</code>.
     */
    public final TableField<ApplicableRolesRecord, String> GRANTEE = createField(DSL.name("grantee"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.applicable_roles.role_name</code>.
     */
    public final TableField<ApplicableRolesRecord, String> ROLE_NAME = createField(DSL.name("role_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.applicable_roles.is_grantable</code>.
     */
    public final TableField<ApplicableRolesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.applicable_roles</code> table reference
     */
    public ApplicableRoles() {
        this(DSL.name("applicable_roles"), null);
    }

    /**
     * Create an aliased <code>information_schema.applicable_roles</code> table reference
     */
    public ApplicableRoles(String alias) {
        this(DSL.name(alias), APPLICABLE_ROLES);
    }

    /**
     * Create an aliased <code>information_schema.applicable_roles</code> table reference
     */
    public ApplicableRoles(Name alias) {
        this(alias, APPLICABLE_ROLES);
    }

    private ApplicableRoles(Name alias, Table<ApplicableRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicableRoles(Name alias, Table<ApplicableRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ApplicableRoles(Table<O> child, ForeignKey<O, ApplicableRolesRecord> key) {
        super(child, key, APPLICABLE_ROLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ApplicableRoles as(String alias) {
        return new ApplicableRoles(DSL.name(alias), this);
    }

    @Override
    public ApplicableRoles as(Name alias) {
        return new ApplicableRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicableRoles rename(String name) {
        return new ApplicableRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicableRoles rename(Name name) {
        return new ApplicableRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

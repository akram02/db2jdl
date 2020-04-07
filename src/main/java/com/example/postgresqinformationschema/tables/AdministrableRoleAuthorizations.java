/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.AdministrableRoleAuthorizationsRecord;

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
public class AdministrableRoleAuthorizations extends TableImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 640551922;

    /**
     * The reference instance of <code>information_schema.administrable_role_authorizations</code>
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = new AdministrableRoleAuthorizations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdministrableRoleAuthorizationsRecord> getRecordType() {
        return AdministrableRoleAuthorizationsRecord.class;
    }

    /**
     * The column <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE = createField(DSL.name("grantee"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_NAME = createField(DSL.name("role_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.administrable_role_authorizations</code> table reference
     */
    public AdministrableRoleAuthorizations() {
        this(DSL.name("administrable_role_authorizations"), null);
    }

    /**
     * Create an aliased <code>information_schema.administrable_role_authorizations</code> table reference
     */
    public AdministrableRoleAuthorizations(String alias) {
        this(DSL.name(alias), ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create an aliased <code>information_schema.administrable_role_authorizations</code> table reference
     */
    public AdministrableRoleAuthorizations(Name alias) {
        this(alias, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AdministrableRoleAuthorizations(Table<O> child, ForeignKey<O, AdministrableRoleAuthorizationsRecord> key) {
        super(child, key, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public AdministrableRoleAuthorizations as(String alias) {
        return new AdministrableRoleAuthorizations(DSL.name(alias), this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Name alias) {
        return new AdministrableRoleAuthorizations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(String name) {
        return new AdministrableRoleAuthorizations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Name name) {
        return new AdministrableRoleAuthorizations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
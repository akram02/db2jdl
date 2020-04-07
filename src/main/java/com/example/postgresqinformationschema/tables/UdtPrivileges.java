/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.UdtPrivilegesRecord;

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
public class UdtPrivileges extends TableImpl<UdtPrivilegesRecord> {

    private static final long serialVersionUID = -1533975238;

    /**
     * The reference instance of <code>information_schema.udt_privileges</code>
     */
    public static final UdtPrivileges UDT_PRIVILEGES = new UdtPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UdtPrivilegesRecord> getRecordType() {
        return UdtPrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.udt_privileges.grantor</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTOR = createField(DSL.name("grantor"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.grantee</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTEE = createField(DSL.name("grantee"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_name</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges() {
        this(DSL.name("udt_privileges"), null);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges(String alias) {
        this(DSL.name(alias), UDT_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges(Name alias) {
        this(alias, UDT_PRIVILEGES);
    }

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UdtPrivileges(Table<O> child, ForeignKey<O, UdtPrivilegesRecord> key) {
        super(child, key, UDT_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UdtPrivileges as(String alias) {
        return new UdtPrivileges(DSL.name(alias), this);
    }

    @Override
    public UdtPrivileges as(Name alias) {
        return new UdtPrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(String name) {
        return new UdtPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Name name) {
        return new UdtPrivileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
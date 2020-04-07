/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables.records;


import com.example.postgresqinformationschema.tables.AdministrableRoleAuthorizations;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class AdministrableRoleAuthorizationsRecord extends TableRecordImpl<AdministrableRoleAuthorizationsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -1438210034;

    /**
     * Setter for <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public void setRoleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE;
    }

    @Override
    public Field<String> field2() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME;
    }

    @Override
    public Field<String> field3() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantee();
    }

    @Override
    public String component2() {
        return getRoleName();
    }

    @Override
    public String component3() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantee();
    }

    @Override
    public String value2() {
        return getRoleName();
    }

    @Override
    public String value3() {
        return getIsGrantable();
    }

    @Override
    public AdministrableRoleAuthorizationsRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public AdministrableRoleAuthorizationsRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    @Override
    public AdministrableRoleAuthorizationsRecord value3(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public AdministrableRoleAuthorizationsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdministrableRoleAuthorizationsRecord
     */
    public AdministrableRoleAuthorizationsRecord() {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create a detached, initialised AdministrableRoleAuthorizationsRecord
     */
    public AdministrableRoleAuthorizationsRecord(String grantee, String roleName, String isGrantable) {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);

        set(0, grantee);
        set(1, roleName);
        set(2, isGrantable);
    }
}

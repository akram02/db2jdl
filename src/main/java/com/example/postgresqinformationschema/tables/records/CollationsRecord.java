/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables.records;


import com.example.postgresqinformationschema.tables.Collations;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CollationsRecord extends TableRecordImpl<CollationsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1452288910;

    /**
     * Setter for <code>information_schema.collations.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.collations.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.collations.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.collations.pad_attribute</code>.
     */
    public void setPadAttribute(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.collations.pad_attribute</code>.
     */
    public String getPadAttribute() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Collations.COLLATIONS.COLLATION_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Collations.COLLATIONS.COLLATION_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Collations.COLLATIONS.COLLATION_NAME;
    }

    @Override
    public Field<String> field4() {
        return Collations.COLLATIONS.PAD_ATTRIBUTE;
    }

    @Override
    public String component1() {
        return getCollationCatalog();
    }

    @Override
    public String component2() {
        return getCollationSchema();
    }

    @Override
    public String component3() {
        return getCollationName();
    }

    @Override
    public String component4() {
        return getPadAttribute();
    }

    @Override
    public String value1() {
        return getCollationCatalog();
    }

    @Override
    public String value2() {
        return getCollationSchema();
    }

    @Override
    public String value3() {
        return getCollationName();
    }

    @Override
    public String value4() {
        return getPadAttribute();
    }

    @Override
    public CollationsRecord value1(String value) {
        setCollationCatalog(value);
        return this;
    }

    @Override
    public CollationsRecord value2(String value) {
        setCollationSchema(value);
        return this;
    }

    @Override
    public CollationsRecord value3(String value) {
        setCollationName(value);
        return this;
    }

    @Override
    public CollationsRecord value4(String value) {
        setPadAttribute(value);
        return this;
    }

    @Override
    public CollationsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollationsRecord
     */
    public CollationsRecord() {
        super(Collations.COLLATIONS);
    }

    /**
     * Create a detached, initialised CollationsRecord
     */
    public CollationsRecord(String collationCatalog, String collationSchema, String collationName, String padAttribute) {
        super(Collations.COLLATIONS);

        set(0, collationCatalog);
        set(1, collationSchema);
        set(2, collationName);
        set(3, padAttribute);
    }
}

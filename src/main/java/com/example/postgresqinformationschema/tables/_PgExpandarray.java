/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records._PgExpandarrayRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class _PgExpandarray extends TableImpl<_PgExpandarrayRecord> {

    private static final long serialVersionUID = 22103611;

    /**
     * The reference instance of <code>information_schema._pg_expandarray</code>
     */
    public static final _PgExpandarray _PG_EXPANDARRAY = new _PgExpandarray();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgExpandarrayRecord> getRecordType() {
        return _PgExpandarrayRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<_PgExpandarrayRecord, Object> X = createField(DSL.name("x"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), this, "");

    /**
     * The column <code>information_schema._pg_expandarray.n</code>.
     */
    public final TableField<_PgExpandarrayRecord, Integer> N = createField(DSL.name("n"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>information_schema._pg_expandarray</code> table reference
     */
    public _PgExpandarray() {
        this(DSL.name("_pg_expandarray"), null);
    }

    /**
     * Create an aliased <code>information_schema._pg_expandarray</code> table reference
     */
    public _PgExpandarray(String alias) {
        this(DSL.name(alias), _PG_EXPANDARRAY);
    }

    /**
     * Create an aliased <code>information_schema._pg_expandarray</code> table reference
     */
    public _PgExpandarray(Name alias) {
        this(alias, _PG_EXPANDARRAY);
    }

    private _PgExpandarray(Name alias, Table<_PgExpandarrayRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private _PgExpandarray(Name alias, Table<_PgExpandarrayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> _PgExpandarray(Table<O> child, ForeignKey<O, _PgExpandarrayRecord> key) {
        super(child, key, _PG_EXPANDARRAY);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgExpandarray as(String alias) {
        return new _PgExpandarray(DSL.name(alias), this, parameters);
    }

    @Override
    public _PgExpandarray as(Name alias) {
        return new _PgExpandarray(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgExpandarray rename(String name) {
        return new _PgExpandarray(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgExpandarray rename(Name name) {
        return new _PgExpandarray(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Object, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public _PgExpandarray call(Object __1) {
        return new _PgExpandarray(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""))
        });
    }

    /**
     * Call this table-valued function
     */
    public _PgExpandarray call(Field<Object> __1) {
        return new _PgExpandarray(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema.tables;


import com.example.postgresqinformationschema.InformationSchema;
import com.example.postgresqinformationschema.tables.records.ForeignTableOptionsRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class ForeignTableOptions extends TableImpl<ForeignTableOptionsRecord> {

    private static final long serialVersionUID = 556929839;

    /**
     * The reference instance of <code>information_schema.foreign_table_options</code>
     */
    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = new ForeignTableOptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignTableOptionsRecord> getRecordType() {
        return ForeignTableOptionsRecord.class;
    }

    /**
     * The column <code>information_schema.foreign_table_options.foreign_table_catalog</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_CATALOG = createField(DSL.name("foreign_table_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_table_options.foreign_table_schema</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_table_options.foreign_table_name</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_table_options.option_name</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_table_options.option_value</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.foreign_table_options</code> table reference
     */
    public ForeignTableOptions() {
        this(DSL.name("foreign_table_options"), null);
    }

    /**
     * Create an aliased <code>information_schema.foreign_table_options</code> table reference
     */
    public ForeignTableOptions(String alias) {
        this(DSL.name(alias), FOREIGN_TABLE_OPTIONS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_table_options</code> table reference
     */
    public ForeignTableOptions(Name alias) {
        this(alias, FOREIGN_TABLE_OPTIONS);
    }

    private ForeignTableOptions(Name alias, Table<ForeignTableOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignTableOptions(Name alias, Table<ForeignTableOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignTableOptions(Table<O> child, ForeignKey<O, ForeignTableOptionsRecord> key) {
        super(child, key, FOREIGN_TABLE_OPTIONS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ForeignTableOptions as(String alias) {
        return new ForeignTableOptions(DSL.name(alias), this);
    }

    @Override
    public ForeignTableOptions as(Name alias) {
        return new ForeignTableOptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTableOptions rename(String name) {
        return new ForeignTableOptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTableOptions rename(Name name) {
        return new ForeignTableOptions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

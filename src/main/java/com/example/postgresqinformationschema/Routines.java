/*
 * This file is generated by jOOQ.
 */
package com.example.postgresqinformationschema;


import com.example.postgresqinformationschema.routines._PgCharMaxLength;
import com.example.postgresqinformationschema.routines._PgCharOctetLength;
import com.example.postgresqinformationschema.routines._PgDatetimePrecision;
import com.example.postgresqinformationschema.routines._PgIndexPosition;
import com.example.postgresqinformationschema.routines._PgIntervalType;
import com.example.postgresqinformationschema.routines._PgKeysequal;
import com.example.postgresqinformationschema.routines._PgNumericPrecision;
import com.example.postgresqinformationschema.routines._PgNumericPrecisionRadix;
import com.example.postgresqinformationschema.routines._PgNumericScale;
import com.example.postgresqinformationschema.routines._PgTruetypid;
import com.example.postgresqinformationschema.routines._PgTruetypmod;
import com.example.postgresqinformationschema.tables._PgExpandarray;
import com.example.postgresqinformationschema.tables.records._PgExpandarrayRecord;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all stored procedures and functions in information_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>information_schema._pg_char_max_length</code>
     */
    public static Integer _PgCharMaxLength(Configuration configuration, Long typid, Integer typmod) {
        _PgCharMaxLength f = new _PgCharMaxLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_char_max_length</code> as a field.
     */
    public static Field<Integer> _PgCharMaxLength(Long typid, Integer typmod) {
        _PgCharMaxLength f = new _PgCharMaxLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_char_max_length</code> as a field.
     */
    public static Field<Integer> _PgCharMaxLength(Field<Long> typid, Field<Integer> typmod) {
        _PgCharMaxLength f = new _PgCharMaxLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_char_octet_length</code>
     */
    public static Integer _PgCharOctetLength(Configuration configuration, Long typid, Integer typmod) {
        _PgCharOctetLength f = new _PgCharOctetLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_char_octet_length</code> as a field.
     */
    public static Field<Integer> _PgCharOctetLength(Long typid, Integer typmod) {
        _PgCharOctetLength f = new _PgCharOctetLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_char_octet_length</code> as a field.
     */
    public static Field<Integer> _PgCharOctetLength(Field<Long> typid, Field<Integer> typmod) {
        _PgCharOctetLength f = new _PgCharOctetLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_datetime_precision</code>
     */
    public static Integer _PgDatetimePrecision(Configuration configuration, Long typid, Integer typmod) {
        _PgDatetimePrecision f = new _PgDatetimePrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_datetime_precision</code> as a field.
     */
    public static Field<Integer> _PgDatetimePrecision(Long typid, Integer typmod) {
        _PgDatetimePrecision f = new _PgDatetimePrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_datetime_precision</code> as a field.
     */
    public static Field<Integer> _PgDatetimePrecision(Field<Long> typid, Field<Integer> typmod) {
        _PgDatetimePrecision f = new _PgDatetimePrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_index_position</code>
     */
    public static Integer _PgIndexPosition(Configuration configuration, Long __1, Short __2) {
        _PgIndexPosition f = new _PgIndexPosition();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_index_position</code> as a field.
     */
    public static Field<Integer> _PgIndexPosition(Long __1, Short __2) {
        _PgIndexPosition f = new _PgIndexPosition();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_index_position</code> as a field.
     */
    public static Field<Integer> _PgIndexPosition(Field<Long> __1, Field<Short> __2) {
        _PgIndexPosition f = new _PgIndexPosition();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_interval_type</code>
     */
    public static String _PgIntervalType(Configuration configuration, Long typid, Integer mod) {
        _PgIntervalType f = new _PgIntervalType();
        f.setTypid(typid);
        f.setMod(mod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_interval_type</code> as a field.
     */
    public static Field<String> _PgIntervalType(Long typid, Integer mod) {
        _PgIntervalType f = new _PgIntervalType();
        f.setTypid(typid);
        f.setMod(mod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_interval_type</code> as a field.
     */
    public static Field<String> _PgIntervalType(Field<Long> typid, Field<Integer> mod) {
        _PgIntervalType f = new _PgIntervalType();
        f.setTypid(typid);
        f.setMod(mod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_keysequal</code>
     */
    public static Boolean _PgKeysequal(Configuration configuration, Short[] __1, Short[] __2) {
        _PgKeysequal f = new _PgKeysequal();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_keysequal</code> as a field.
     */
    public static Field<Boolean> _PgKeysequal(Short[] __1, Short[] __2) {
        _PgKeysequal f = new _PgKeysequal();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_keysequal</code> as a field.
     */
    public static Field<Boolean> _PgKeysequal(Field<Short[]> __1, Field<Short[]> __2) {
        _PgKeysequal f = new _PgKeysequal();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_numeric_precision</code>
     */
    public static Integer _PgNumericPrecision(Configuration configuration, Long typid, Integer typmod) {
        _PgNumericPrecision f = new _PgNumericPrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision</code> as a field.
     */
    public static Field<Integer> _PgNumericPrecision(Long typid, Integer typmod) {
        _PgNumericPrecision f = new _PgNumericPrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision</code> as a field.
     */
    public static Field<Integer> _PgNumericPrecision(Field<Long> typid, Field<Integer> typmod) {
        _PgNumericPrecision f = new _PgNumericPrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_numeric_precision_radix</code>
     */
    public static Integer _PgNumericPrecisionRadix(Configuration configuration, Long typid, Integer typmod) {
        _PgNumericPrecisionRadix f = new _PgNumericPrecisionRadix();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision_radix</code> as a field.
     */
    public static Field<Integer> _PgNumericPrecisionRadix(Long typid, Integer typmod) {
        _PgNumericPrecisionRadix f = new _PgNumericPrecisionRadix();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision_radix</code> as a field.
     */
    public static Field<Integer> _PgNumericPrecisionRadix(Field<Long> typid, Field<Integer> typmod) {
        _PgNumericPrecisionRadix f = new _PgNumericPrecisionRadix();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_numeric_scale</code>
     */
    public static Integer _PgNumericScale(Configuration configuration, Long typid, Integer typmod) {
        _PgNumericScale f = new _PgNumericScale();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_numeric_scale</code> as a field.
     */
    public static Field<Integer> _PgNumericScale(Long typid, Integer typmod) {
        _PgNumericScale f = new _PgNumericScale();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_numeric_scale</code> as a field.
     */
    public static Field<Integer> _PgNumericScale(Field<Long> typid, Field<Integer> typmod) {
        _PgNumericScale f = new _PgNumericScale();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Long _PgTruetypid(Configuration configuration, Object __1, Object __2) {
        _PgTruetypid f = new _PgTruetypid();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Field<Long> _PgTruetypid(Object __1, Object __2) {
        _PgTruetypid f = new _PgTruetypid();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Field<Long> _PgTruetypid(Field<Object> __1, Field<Object> __2) {
        _PgTruetypid f = new _PgTruetypid();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Integer _PgTruetypmod(Configuration configuration, Object __1, Object __2) {
        _PgTruetypmod f = new _PgTruetypmod();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Field<Integer> _PgTruetypmod(Object __1, Object __2) {
        _PgTruetypmod f = new _PgTruetypmod();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Field<Integer> _PgTruetypmod(Field<Object> __1, Field<Object> __2) {
        _PgTruetypmod f = new _PgTruetypmod();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<_PgExpandarrayRecord> _PgExpandarray(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(com.example.postgresqinformationschema.tables._PgExpandarray._PG_EXPANDARRAY.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static _PgExpandarray _PgExpandarray(Object __1) {
        return com.example.postgresqinformationschema.tables._PgExpandarray._PG_EXPANDARRAY.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static _PgExpandarray _PgExpandarray(Field<Object> __1) {
        return com.example.postgresqinformationschema.tables._PgExpandarray._PG_EXPANDARRAY.call(__1);
    }
}

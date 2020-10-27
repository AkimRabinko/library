/*
 * This file is generated by jOOQ.
 */
package com.akimrabinko.library.jooqData.tables;


import com.akimrabinko.library.jooqData.Public;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<Record> {

    private static final long serialVersionUID = -192692635;

    public static final User USER = new User();

    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    public final TableField<Record, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    public final TableField<Record, LocalDate> BIRTHDAY = createField(DSL.name("birthday"), org.jooq.impl.SQLDataType.LOCALDATE, this, "");

    public final TableField<Record, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    public final TableField<Record, String> SURNAME = createField(DSL.name("surname"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    public final TableField<Record, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    public final TableField<Record, String> ROLE = createField(DSL.name("role"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    public final TableField<Record, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    public User() {
        this(DSL.name("user"), null);
    }

    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<Record, Long> getIdentity() {
        return Internal.createIdentity(User.USER, User.USER.ID);
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Internal.createUniqueKey(User.USER, "user_pkey", new TableField[] { User.USER.ID }, true);
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(
              Internal.createUniqueKey(User.USER, "user_pkey", new TableField[] { User.USER.ID }, true)
        );
    }

    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}

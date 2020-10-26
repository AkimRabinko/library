/*
 * This file is generated by jOOQ.
 */
package com.akimrabinko.library.jooqData.tables;


import com.akimrabinko.library.jooqData.Public;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
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
public class Subscribe extends TableImpl<Record> {

    private static final long serialVersionUID = -414884813;

    public static final Subscribe SUBSCRIBE = new Subscribe();

    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    public final TableField<Record, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<Record, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<Record, Long[]> BOOK_IDS = createField(DSL.name("book_ids"), org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    public final TableField<Record, LocalDate> PERIOD_START = createField(DSL.name("period_start"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    public final TableField<Record, LocalDate> PERIOD_END = createField(DSL.name("period_end"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    public Subscribe() {
        this(DSL.name("subscribe"), null);
    }

    public Subscribe(String alias) {
        this(DSL.name(alias), SUBSCRIBE);
    }

    public Subscribe(Name alias) {
        this(alias, SUBSCRIBE);
    }

    private Subscribe(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Subscribe(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Internal.createUniqueKey(Subscribe.SUBSCRIBE, "subscribe_pkey", new TableField[] { Subscribe.SUBSCRIBE.ID }, true);
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(
              Internal.createUniqueKey(Subscribe.SUBSCRIBE, "subscribe_pkey", new TableField[] { Subscribe.SUBSCRIBE.ID }, true)
        );
    }

    @Override
    public Subscribe as(String alias) {
        return new Subscribe(DSL.name(alias), this);
    }

    @Override
    public Subscribe as(Name alias) {
        return new Subscribe(alias, this);
    }

    @Override
    public Subscribe rename(String name) {
        return new Subscribe(DSL.name(name), null);
    }

    @Override
    public Subscribe rename(Name name) {
        return new Subscribe(name, null);
    }
}

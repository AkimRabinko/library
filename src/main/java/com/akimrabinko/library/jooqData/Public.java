/*
 * This file is generated by jOOQ.
 */
package com.akimrabinko.library.jooqData;


import com.akimrabinko.library.jooqData.tables.Book;
import com.akimrabinko.library.jooqData.tables.Subscribe;
import com.akimrabinko.library.jooqData.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1541977440;

    public static final Public PUBLIC = new Public();

    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Book.BOOK,
            Subscribe.SUBSCRIBE,
            User.USER);
    }
}
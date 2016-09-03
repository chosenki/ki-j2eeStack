/**
 * This class is generated by jOOQ
 */
package com.ki.common.codegen;


import com.ki.common.codegen.tables.Author;
import com.ki.common.codegen.tables.Book;
import com.ki.common.codegen.tables.BookStore;
import com.ki.common.codegen.tables.BookToBookStore;
import com.ki.common.codegen.tables.records.AuthorRecord;
import com.ki.common.codegen.tables.records.BookRecord;
import com.ki.common.codegen.tables.records.BookStoreRecord;
import com.ki.common.codegen.tables.records.BookToBookStoreRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>ki</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_STORE_PRIMARY;
    public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_TO_BOOK_STORE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, "KEY_AUTHOR_PRIMARY", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, "KEY_BOOK_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_PRIMARY = createUniqueKey(BookStore.BOOK_STORE, "KEY_BOOK_STORE_PRIMARY", BookStore.BOOK_STORE.ID);
        public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "KEY_BOOK_TO_BOOK_STORE_PRIMARY", BookToBookStore.BOOK_TO_BOOK_STORE.ID);
    }
}
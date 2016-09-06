/**
 * This class is generated by jOOQ
 */
package com.ki.feature.entity;


import com.ki.feature.entity.tables.Author;
import com.ki.feature.entity.tables.Book;
import com.ki.feature.entity.tables.BookStore;
import com.ki.feature.entity.tables.BookToBookStore;
import com.ki.feature.entity.tables.SchemaVersion;
import com.ki.feature.entity.tables.Student;
import com.ki.feature.entity.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in ki
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>ki.AUTHOR</code>.
     */
    public static final Author AUTHOR = com.ki.feature.entity.tables.Author.AUTHOR;

    /**
     * The table <code>ki.BOOK</code>.
     */
    public static final Book BOOK = com.ki.feature.entity.tables.Book.BOOK;

    /**
     * The table <code>ki.BOOK_STORE</code>.
     */
    public static final BookStore BOOK_STORE = com.ki.feature.entity.tables.BookStore.BOOK_STORE;

    /**
     * The table <code>ki.BOOK_TO_BOOK_STORE</code>.
     */
    public static final BookToBookStore BOOK_TO_BOOK_STORE = com.ki.feature.entity.tables.BookToBookStore.BOOK_TO_BOOK_STORE;

    /**
     * The table <code>ki.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.ki.feature.entity.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>ki.STUDENT</code>.
     */
    public static final Student STUDENT = com.ki.feature.entity.tables.Student.STUDENT;

    /**
     * The table <code>ki.USER</code>.
     */
    public static final User USER = com.ki.feature.entity.tables.User.USER;
}

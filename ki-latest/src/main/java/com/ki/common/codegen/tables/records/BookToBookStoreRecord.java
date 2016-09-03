/**
 * This class is generated by jOOQ
 */
package com.ki.common.codegen.tables.records;


import com.ki.common.codegen.tables.BookToBookStore;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStoreRecord extends UpdatableRecordImpl<BookToBookStoreRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -410716938;

    /**
     * Setter for <code>ki.BOOK_TO_BOOK_STORE.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ki.BOOK_TO_BOOK_STORE.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ki.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
     */
    public void setBookId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ki.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
     */
    public Integer getBookId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ki.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
     */
    public void setBookStoreName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ki.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
     */
    public String getBookStoreName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BookToBookStore.BOOK_TO_BOOK_STORE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBookStoreName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord value2(Integer value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord value3(String value) {
        setBookStoreName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookToBookStoreRecord
     */
    public BookToBookStoreRecord() {
        super(BookToBookStore.BOOK_TO_BOOK_STORE);
    }

    /**
     * Create a detached, initialised BookToBookStoreRecord
     */
    public BookToBookStoreRecord(Integer id, Integer bookId, String bookStoreName) {
        super(BookToBookStore.BOOK_TO_BOOK_STORE);

        set(0, id);
        set(1, bookId);
        set(2, bookStoreName);
    }
}
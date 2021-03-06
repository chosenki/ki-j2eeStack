/**
 * This class is generated by jOOQ
 */
package com.ki.common.codegen.tables;


import com.ki.common.codegen.Keys;
import com.ki.common.codegen.Ki;
import com.ki.common.codegen.tables.records.AuthorRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = -780068672;

    /**
     * The reference instance of <code>ki.AUTHOR</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>ki.AUTHOR.ID</code>.
     */
    public final TableField<AuthorRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ki.AUTHOR.FIRST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>ki.AUTHOR.LAST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * Create a <code>ki.AUTHOR</code> table reference
     */
    public Author() {
        this("AUTHOR", null);
    }

    /**
     * Create an aliased <code>ki.AUTHOR</code> table reference
     */
    public Author(String alias) {
        this(alias, AUTHOR);
    }

    private Author(String alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Author(String alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ki.KI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.KEY_AUTHOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.KEY_AUTHOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author as(String alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    public Author rename(String name) {
        return new Author(name, null);
    }
}

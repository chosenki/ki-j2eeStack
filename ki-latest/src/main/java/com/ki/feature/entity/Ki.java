/**
 * This class is generated by jOOQ
 */
package com.ki.feature.entity;


import com.ki.feature.entity.tables.SchemaVersion;
import com.ki.feature.entity.tables.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Ki extends SchemaImpl {

    private static final long serialVersionUID = -1522710746;

    /**
     * The reference instance of <code>ki</code>
     */
    public static final Ki KI = new Ki();

    /**
     * The table <code>ki.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = com.ki.feature.entity.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>ki.TEACHER</code>.
     */
    public final Teacher TEACHER = com.ki.feature.entity.tables.Teacher.TEACHER;

    /**
     * No further instances allowed
     */
    private Ki() {
        super("ki", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            SchemaVersion.SCHEMA_VERSION,
            Teacher.TEACHER);
    }
}

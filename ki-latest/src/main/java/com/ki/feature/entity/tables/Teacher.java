/**
 * This class is generated by jOOQ
 */
package com.ki.feature.entity.tables;


import com.ki.feature.entity.Keys;
import com.ki.feature.entity.Ki;
import com.ki.feature.entity.tables.records.TeacherRecord;

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
public class Teacher extends TableImpl<TeacherRecord> {

    private static final long serialVersionUID = 241125367;

    /**
     * The reference instance of <code>ki.TEACHER</code>
     */
    public static final Teacher TEACHER = new Teacher();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeacherRecord> getRecordType() {
        return TeacherRecord.class;
    }

    /**
     * The column <code>ki.TEACHER.ID</code>.
     */
    public final TableField<TeacherRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ki.TEACHER.NAME</code>.
     */
    public final TableField<TeacherRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>ki.TEACHER.GRADE_ID</code>.
     */
    public final TableField<TeacherRecord, Integer> GRADE_ID = createField("GRADE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ki.TEACHER.TELEPHONE</code>.
     */
    public final TableField<TeacherRecord, String> TELEPHONE = createField("TELEPHONE", org.jooq.impl.SQLDataType.VARCHAR.length(15), this, "");

    /**
     * The column <code>ki.TEACHER.SEX</code>.
     */
    public final TableField<TeacherRecord, String> SEX = createField("SEX", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

    /**
     * Create a <code>ki.TEACHER</code> table reference
     */
    public Teacher() {
        this("TEACHER", null);
    }

    /**
     * Create an aliased <code>ki.TEACHER</code> table reference
     */
    public Teacher(String alias) {
        this(alias, TEACHER);
    }

    private Teacher(String alias, Table<TeacherRecord> aliased) {
        this(alias, aliased, null);
    }

    private Teacher(String alias, Table<TeacherRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TeacherRecord> getPrimaryKey() {
        return Keys.KEY_TEACHER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TeacherRecord>> getKeys() {
        return Arrays.<UniqueKey<TeacherRecord>>asList(Keys.KEY_TEACHER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Teacher as(String alias) {
        return new Teacher(alias, this);
    }

    /**
     * Rename this table
     */
    public Teacher rename(String name) {
        return new Teacher(name, null);
    }
}

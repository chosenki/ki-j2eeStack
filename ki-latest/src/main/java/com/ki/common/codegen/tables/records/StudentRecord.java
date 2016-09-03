/**
 * This class is generated by jOOQ
 */
package com.ki.common.codegen.tables.records;


import com.ki.common.codegen.tables.Student;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class StudentRecord extends TableRecordImpl<StudentRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = -862758184;

    /**
     * Setter for <code>ki.STUDENT.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ki.STUDENT.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ki.STUDENT.GRADE_ID</code>.
     */
    public void setGradeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ki.STUDENT.GRADE_ID</code>.
     */
    public Integer getGradeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ki.STUDENT.STUDENT_NAME</code>.
     */
    public void setStudentName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ki.STUDENT.STUDENT_NAME</code>.
     */
    public String getStudentName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ki.STUDENT.TEACHER_NAME</code>.
     */
    public void setTeacherName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ki.STUDENT.TEACHER_NAME</code>.
     */
    public String getTeacherName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Student.STUDENT.GRADE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Student.STUDENT.STUDENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Student.STUDENT.TEACHER_NAME;
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
        return getGradeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStudentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTeacherName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value2(Integer value) {
        setGradeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value3(String value) {
        setStudentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value4(String value) {
        setTeacherName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(Integer value1, Integer value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer id, Integer gradeId, String studentName, String teacherName) {
        super(Student.STUDENT);

        set(0, id);
        set(1, gradeId);
        set(2, studentName);
        set(3, teacherName);
    }
}
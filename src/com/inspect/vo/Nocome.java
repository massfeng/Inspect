package com.inspect.vo;

/**
 * 
 * @ClassName: Nocome
 * @Description: δ�㵽��vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Nocome {
    /**
     * δ�㵽id
     */
    private Integer id;
    /**
     * ���id
     */
    private Integer inspectId;
    /**
     * ѧ��id
     */
    private Integer studentId;

    /**
     * �㵽Աid
     */
    private Integer examiner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getExaminer() {
        return examiner;
    }

    public void setExaminer(Integer examiner) {
        this.examiner = examiner;
    }

    @Override
    public String toString() {
        return "Nocome [id=" + id + ", inspectId=" + inspectId + ", studentId=" + studentId + ", examiner=" + examiner
                + "]";
    }

}

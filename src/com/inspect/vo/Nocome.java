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

    /**
     * ȱ������
     */
    private String createDate;

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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Nocome [id=" + id + ", inspectId=" + inspectId + ", studentId=" + studentId + ", examiner=" + examiner
                + ", createDate=" + createDate + "]";
    }

}

package com.inspect.vo;

/**
 * 
 * @ClassName: Leave
 * @Description: ������ٵ�vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Leave {
    /**
     * ���id
     */
    private Integer Id;
    /**
     * �����id
     */
    private Integer studentId;
    /**
     * ���״̬<br/>
     * <li>1��ʾͨ��
     * <li>2��ʾ�������
     * <li>3��ʾδͨ��
     */
    private Integer state;
    /**
     * �����id<br/>
     * <li>������ֶ���ֵ����ʾ�ǹ���Աͨ��������idΪ����Աid
     * <li>������ֶ���ֵ����ʾ�ǰ�����ͨ��������
     */
    private Integer audiorId;
    /**
     * ���id
     */
    private Integer inspectId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAudiorId() {
        return audiorId;
    }

    public void setAudiorId(Integer audiorId) {
        this.audiorId = audiorId;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    @Override
    public String toString() {
        return "Leave [Id=" + Id + ", studentId=" + studentId + ", state=" + state + ", audiorId=" + audiorId
                + ", inspectId=" + inspectId + "]";
    }

}

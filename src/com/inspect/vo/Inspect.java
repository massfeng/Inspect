package com.inspect.vo;

/**
 * 
 * @ClassName: Inspect
 * @Description: ���Ǽ���vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Inspect {
    /**
     * ���id
     */
    private Integer Id;
    /**
     * �����
     */
    private String inspectName;
    /**
     * ��鿪ʼ����
     */
    private String startDate;
    /**
     * ����������
     */
    private String endDate;

    /**
     * ��һ�ε㵽��ʼʱ��
     */
    private String firstStartTime;

    /**
     * ��һ�ε㵽����ʱ��
     */
    private String fistEndTime;

    /**
     * �ڶ��ε㵽��ʼʱ��
     */
    private String lastStartTime;

    /**
     * �ڶ��ε㵽����ʱ��
     */
    private String lastEndTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getInspectName() {
        return inspectName;
    }

    public void setInspectName(String inspectName) {
        this.inspectName = inspectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFirstStartTime() {
        return firstStartTime;
    }

    public void setFirstStartTime(String firstStartTime) {
        this.firstStartTime = firstStartTime;
    }

    public String getFistEndTime() {
        return fistEndTime;
    }

    public void setFistEndTime(String fistEndTime) {
        this.fistEndTime = fistEndTime;
    }

    public String getLastStartTime() {
        return lastStartTime;
    }

    public void setLastStartTime(String lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    public String getLastEndTime() {
        return lastEndTime;
    }

    public void setLastEndTime(String lastEndTime) {
        this.lastEndTime = lastEndTime;
    }

    @Override
    public String toString() {
        return "Inspect [Id=" + Id + ", inspectName=" + inspectName + ", startDate=" + startDate + ", endDate="
                + endDate + ", firstStartTime=" + firstStartTime + ", fistEndTime=" + fistEndTime + ", lastStartTime="
                + lastStartTime + ", lastEndTime=" + lastEndTime + "]";
    }

}

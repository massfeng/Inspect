package com.inspect.vo;

/**
 * 
 * @ClassName: Message
 * @Description: ��Ϣ��vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Message {
    /**
     * ��Ϣid
     */
    private Integer Id;
    /**
     * �����ߵ�id
     */
    private Integer senderId;
    /**
     * �����ߵ�id
     */
    private Integer receiveId;
    /**
     * ����
     */
    private String content;
    /**
     * ����ʱ��
     */
    private String createDate;
    /**
     * �������<br/>
     * <li>1��ʾ��ʦ����ʦ
     * <li>2��ʾѧ����ѧ��
     * <li>3��ʾ��ʦ��ѧ��
     * <li>4��ʾѧ������ʦ
     */
    private Integer level;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Message [Id=" + Id + ", senderId=" + senderId + ", receiveId=" + receiveId + ", content=" + content
                + ", createDate=" + createDate + ", level=" + level + "]";
    }

}

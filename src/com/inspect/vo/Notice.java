package com.inspect.vo;

/**
 * 
 * @ClassName: Notice
 * @Description: ����id
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Notice {
    /**
     * ����id
     */
    private Integer id;
    /**
     * ����Աid
     */
    private Integer adminId;
    /**
     * ����
     */
    private String title;
    /**
     * ����
     */
    private String content;
    /**
     * ����ʱ��
     */
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Notice [id=" + id + ", adminId=" + adminId + ", title=" + title + ", content=" + content
                + ", createDate=" + createDate + "]";
    }

}

package com.inspect.vo;

/**
 * 
 * @ClassName: Student
 * @Description: ѧ����vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Student {
    /**
     * ѧ��id
     */
    private Integer id;
    /**
     * ѧ��
     */
    private String number;
    /**
     * ����
     */
    private String email;
    /**
     * ����
     */
    private String password;
    /**
     * �༶id
     */
    private Integer ClassesId;
    /**
     * <li>1��ʾ�㵽Ա
     * <li>2��ʾ��ʱ�㵽Ա
     * <li>3��ʾ��ͨѧ��
     */
    private Integer level;

    /**
     * ѧ��״̬
     * <li>1��ʾ��ʼ
     * <li>2��ʾȱ��
     * <li>3��ʾ���
     * <li>4��ʾ����
     */
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getClassesId() {
        return ClassesId;
    }

    public void setClassesId(Integer classesId) {
        ClassesId = classesId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", number=" + number + ", email=" + email + ", password=" + password
                + ", ClassesId=" + ClassesId + ", level=" + level + ", state=" + state + "]";
    }

}

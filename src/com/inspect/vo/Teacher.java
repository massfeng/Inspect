package com.inspect.vo;

/**
 * 
 * @ClassName: Teacher
 * @Description: ��ʦ��vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Teacher {
    /**
     * ��ʦid
     */
    private Integer Id;
    /**
     * ��ʦ����
     */
    private String name;
    /**
     * ��ʦ����
     */
    private String email;
    /**
     * �̹���
     */
    private String Number;
    /**
     * ����
     */
    private String password;
    /**
     * ���ܰ༶id
     */
    private Integer classesId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    @Override
    public String toString() {
        return "Teacher [Id=" + Id + ", name=" + name + ", email=" + email + ", Number=" + Number + ", password="
                + password + ", classesId=" + classesId + "]";
    }

}

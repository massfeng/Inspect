package com.inspect.vo;

/**
 * 
 * @ClassName: Admin
 * @Description: ���ǹ���Ա��vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Admin {
    /**
     * ����Աid
     */
    private Integer id;
    /**
     * ����Ա��
     */
    private String Name;
    /**
     * ����Ա����
     */
    private String password;
    /**
     * ����Ա�ȼ�<br/>
     * 1��ʾ��������Ա<br/>
     * 2��ʾ��ͨ����Ա
     */
    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Admin [id=" + id + ", Name=" + Name + ", password=" + password + ", level=" + level + "]";
    }

}

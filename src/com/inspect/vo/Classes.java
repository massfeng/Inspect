package com.inspect.vo;

/**
 * 
 * @ClassName: Classes
 * @Description: ���ǰ༶��vo��
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public class Classes {
    /**
     * �༶id
     */
    private Integer id;
    /**
     * �༶��
     */
    private String classNumber;
    /**
     * ������id
     */
    private Integer teachId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    @Override
    public String toString() {
        return "Classes [id=" + id + ", classNumber=" + classNumber + ", teachId=" + teachId + "]";
    }

}

package com.subject;

public class SubjectVO {
    private int no;       //번호(테이블의 컬럼명과 동일하게 명시.)
    private String s_num; //학과번호
    private String s_name;//학과명
    private String deletable;

    public SubjectVO() { }

    public SubjectVO(String s_num, String s_name) {
        this(0, s_num, s_name);
    }

    public SubjectVO(int no, String s_num, String s_name) {
        this.no = no;
        this.s_num = s_num;
        this.s_name = s_name;
    }
    public SubjectVO(int no, String s_num, String s_name,String deletable) {
        super();
    	this.no = no;
        this.s_num = s_num;
        this.s_name = s_name;
        this.deletable = deletable;
    }

    public int getNo() {
        return no;
    }

    public String getDeletable() {
		return deletable;
	}

	public void setDeletable(String deletable) {
		this.deletable = deletable;
	}

	public void setNo(int no) {
        this.no = no;
    }

    public String getS_num() {
        return s_num;
    }

    public void setS_num(String s_num) {
        this.s_num = s_num;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    @Override
    public String toString() {
        return "Subject [no=" + no + ", s_num=" + s_num + ", s_name=" + s_name + "+ \", deletable=\" + deletable ]";
    }
}
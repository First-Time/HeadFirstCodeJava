package chapter03.example3_86;

public class Dept {
    private int deptno;         //部门编号
    private String dname;       //部门名称
    private String loc;         //部门位置
    private Emp emps[];         //多个雇员

    public Dept() {
    }

    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public String getInfo() {
        return "部门编号：" + this.deptno + "，名称：" + this.dname + "，位置：" + this.loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Emp[] getEmps() {
        return emps;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }
}

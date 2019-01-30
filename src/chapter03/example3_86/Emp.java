package chapter03.example3_86;

public class Emp {
    private int empno;          //雇员编号
    private String ename;       //雇员姓名
    private String job;         //雇员职位
    private double sal;         //雇员工资
    private double comm;        //佣金
    private Dept dept;
    private Emp mgr;            //表示雇员对应的领导

    public Emp() {
    }

    public Emp(int empno, String ename, String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    public String getInfo() {
        return "雇员编号：" + this.empno + "，姓名：" + this.ename + "，职位：" + this.job + "，工资：" + this.sal + "，佣金：" + this.comm;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp getMgr() {
        return mgr;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }
}

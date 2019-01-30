package chapter03.example3_15;

public class Emp {
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    public Emp() {
    }

    public Emp(int empno, String ename, String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
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

    /**
     * 取得简单Java类的基本信息，信息在被调用处输出
     * @return 包含对象完整信息的字符串数据
     */
    public String getInfo() {
        return "雇员编号：" + empno + "\n" +
                "雇员姓名：" + ename + "\n" +
                "雇员职位：" + job + "\n" +
                "基本工资：" + sal + "\n" +
                "佣   金：" + comm;
    }
}

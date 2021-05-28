package seunghee.sungjuk._35_BusinessV2;

public class EmployeeVO {
	private int empno;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String hdata;
	private String jobid;
	private int sal;
	private double comm;
	private int mgrid;
	private String deptid;
	
	public EmployeeVO() { }
	public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdata, String jobid, int sal, double comm, int mgrid, String deptid) {
		this.empno = empno;
	    this.fname = fname;
	    this.lname = lname;
	    this.email = email;
	    this.phone = phone;
	    this.hdata = hdata;
	    this.jobid = jobid;
	    this.sal = sal;
	    this.comm = comm;
	    this.mgrid = mgrid;
	    this.deptid = deptid;
	}

	public int getEmpno() {
		return empno;
	}	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getFname() {
		return fname;	
	}
	public void setFname(String fname) {
	    this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHdata() {
		return hdata;
	}
	public void setHdata(String hdata) {
		this.hdata = hdata;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
}
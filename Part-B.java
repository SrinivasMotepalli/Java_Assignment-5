Main.java
package Assignment_05;
public class Main {
public static void main(String[] args) {
// System.out.println();
/*
NormalEmployee n = new NormalEmployee();
n.getEmployeeDetails();
n.salaryCalculation();
n.displayEmployeeDetails();
*/

Specialemployee s = new Specialemployee();
s.getEmployeeDetails();
s.salaryCalculation();
s.displayEmployeeDetails();
}
}
Specialemployee.java
package Assignment_05;
public class Specialemployee extends Employee
{
@Override
public void salaryCalculation()
{ double bw = ((getGrosswage() / getTotalWorkingDays()) *
getPaidDays()) * 0.45;
setBasicWage(bw);
double hra = (bw * 0.40);
setHra(hra);
double ca = (1600 / getTotalWorkingDays()) * getPaidDays();
setConveyanceAllowances(ca);
double ma = (1250 / getTotalWorkingDays()) * getPaidDays();
setMedicalAllowances(ma);
double otherAllo = ((getGrosswage() / getTotalWorkingDays()) *
getPaidDays()) - (bw + hra + ca + ma);
setOtherAllowances(otherAllo);
setTotalEarning(bw + hra + ca + ma + otherAllo);
double esi = getTotalEarning() * 0.0075;
setTotalEarning(getTotalEarning() + esi);
double epf = bw * 0.12;
setEpf(epf);
double totalDeductions = epf + getEsi();
setTotalDeductions(totalDeductions);
System.out.println("Total Earnings: " + getTotalEarning());
}
}


Normalemployee.java
package Assignment_05;
public class NormalEmployee extends Employee {
@Override
public void salaryCalculation() {
double bw=((getGrosswage()/getTotalWorkingDays())*getPaidDays())*0.45;
setBasicWage(bw);
double hra=(bw*0.40);
setHra(hra);
double ca=(1600/getTotalWorkingDays())*getPaidDays();
setConveyanceAllowances(ca);
double ma=(1250/getTotalWorkingDays())*getPaidDays();
setMedicalAllowances(ma);

double otherAllo=((getGrosswage()/getTotalWorkingDays())*getPaidDays())-
(bw+hra+ca+ma);
setTotalEarning(bw+hra+ca+ma+otherAllo);
System.out.println("Total Earnings "+getTotalEarning() );
// return 0;
}
}


Employee.java
package Assignment_05;
import java.util.Scanner;
public abstract class Employee {
Scanner sc=new Scanner(System.in);
private String
empName,empAddress,empDesignation,empDept,doj,bankName;
private long UAN,PF_NO,ESINo,empId,bankAcctNo;
private int totalWorkingDays,paidDays,leavesTaken,lopDays;
private double
grosswage,totalEarning,totalDeductions,basicWage,hra,conveyanceAllowances,
medicalAllowances,otherAllowances,epf,esi,pt,loanRecovery;
public String getEmpName() {
return empName;
}
public void setEmpName(String empName) {
this.empName = empName;
}
public String getEmpAddress() {
return empAddress;
}
public void setEmpAddress(String empAddress) {
this.empAddress = empAddress;
}
public String getEmpDesignation() {
return empDesignation;
}
public void setEmpDesignation(String empDesignation) {
this.empDesignation = empDesignation;
}
public String getEmpDept() {
return empDept;
}
public void setEmpDept(String empDept) {
this.empDept = empDept;
}
public String getDoj() {
return doj;

}
public void setDoj(String doj) {
this.doj = doj;
}
public String getBankName() {
return bankName;
}
public void setBankName(String bankName) {
this.bankName = bankName;
}
public long getUAN() {
return UAN;
}
public void setUAN(long UAN) {
this.UAN = UAN;
}
public long getPF_NO() {
return PF_NO;
}
public void setPF_NO(long PF_NO) {
this.PF_NO = PF_NO;
}
public long getESINo() {
return ESINo;
}
public void setESINo(long ESINo) {
this.ESINo = ESINo;
}
public long getEmpId() {
return empId;
}
public void setEmpId(long empId) {
this.empId = empId;
}
public long getBankAcctNo() {
return bankAcctNo;
}
public void setBankAcctNo(long bankAcctNo) {
this.bankAcctNo = bankAcctNo;
}
public int getTotalWorkingDays() {
return totalWorkingDays;
}
public void setTotalWorkingDays(int totalWorkingDays) {
this.totalWorkingDays = totalWorkingDays;
}

public int getPaidDays() {
return paidDays;
}
public void setPaidDays(int paidDays) {
this.paidDays = paidDays;
}
public int getLeavesTaken() {
return leavesTaken;
}
public void setLeavesTaken(int leavesTaken) {
this.leavesTaken = leavesTaken;
}
public int getLopDays() {
return lopDays;
}
public void setLopDays(int lopDays) {
this.lopDays = lopDays;
}
public double getGrosswage() {
return grosswage;
}
public void setGrosswage(double grosswage) {
this.grosswage = grosswage;
}
public double getTotalEarning() {
return totalEarning;
}
public void setTotalEarning(double totalEarning) {
this.totalEarning = totalEarning;
}
public double getTotalDeductions() {
return totalDeductions;
}
public void setTotalDeductions(double totalDeductions) {
this.totalDeductions = totalDeductions;
}
public double getBasicWage() {
return basicWage;
}
public void setBasicWage(double basicWage) {
this.basicWage = basicWage;
}
public double getHra() {
return hra;
}

public void setHra(double hra) {
this.hra = hra;
}
public double getConveyanceAllowances() {
return conveyanceAllowances;
}
public void setConveyanceAllowances(double conveyanceAllowances) {
this.conveyanceAllowances = conveyanceAllowances;
}
public double getMedicalAllowances() {
return medicalAllowances;
}
public void setMedicalAllowances(double medicalAllowances) {
this.medicalAllowances = medicalAllowances;
}
public double getOtherAllowances() {
return otherAllowances;
}
public void setOtherAllowances(double otherAllowances) {
this.otherAllowances = otherAllowances;
}
public double getEpf() {
return epf;
}
public void setEpf(double epf) {
this.epf = epf;
}
public double getEsi() {
return esi;
}
public void setEsi(double esi) {
this.esi = esi;
}
public double getPt() {
return pt;
}
public void setPt(double pt) {
this.pt = pt;
}
public double getLoanRecovery() {
return loanRecovery;
}
public void setLoanRecovery(double loanRecovery) {
this.loanRecovery = loanRecovery;
}
public abstract void salaryCalculation();

public void getEmployeeDetails()
{
System.out.println("Employee Id");
long eid=sc.nextLong();
setEmpId(eid);
System.out.println("Employee Name");
String ename=sc.next();
setEmpName(ename);
System.out.println("Employee Designation");
String d = sc.next();
setEmpDesignation(d);
System.out.println("Employee Department");
String dept=sc.next();
setEmpDept(dept);
System.out.println("Employee DOj");
String doj=sc.next();
setDoj(doj);
System.out.println("Employee UAN");
long u=sc.nextLong();
setUAN(u);
System.out.println("Employee PF Number");
long pf=sc.nextLong();
setPF_NO(pf);
System.out.println("Employee ESI Number");
long esi=sc.nextLong();
setEsi(esi);
System.out.println("Employee Bank Name");
String bn=sc.next();
setBankName(bn);
System.out.println("Employee Bank Account No");
long acct=sc.nextLong();
setBankAcctNo(acct);
System.out.println("Employee Gross Wage");
double gw=sc.nextDouble();
setGrosswage(gw);
setTotalWorkingDays(30);
setLopDays(1);
setPaidDays(getTotalWorkingDays()-getLopDays());
System.out.println("Employee leaves taken");
int lt=sc.nextInt();
setLeavesTaken(lt);
}
public void displayEmployeeDetails() {
System.out.println(String.format("%-20s %s", "Employee ID:",
empId));
System.out.println(String.format("%-20s %s", "Employee Name:",
empName));
System.out.println(String.format("%-20s %s", "Designation:",
empDesignation));
System.out.println(String.format("%-20s %s", "Department:",
empDept));
System.out.println(String.format("%-20s %s", "Date of
Joining:", doj));
System.out.println(String.format("%-20s %s", "UAN:", UAN));
System.out.println(String.format("%-20s %s", "PF Number:",
PF_NO));
System.out.println(String.format("%-20s %s", "ESI Number:",
ESINo));
System.out.println(String.format("%-20s %s", "Bank Name:",
bankName));

System.out.println(String.format("%-20s %s", "Bank Account
Number:", bankAcctNo));
System.out.println(String.format("%-20s %s", "Total Working
Days:", totalWorkingDays));
System.out.println(String.format("%-20s %s", "Paid Days:",
paidDays));
System.out.println(String.format("%-20s %s", "Leaves Taken:",
leavesTaken));
System.out.println(String.format("%-20s %s", "Loss of Pay
Days:", lopDays));
System.out.println(String.format("%-20s %s", "Gross Wage:",
grosswage));
System.out.println(String.format("%-20s %s", "Total Earnings:",
totalEarning));
System.out.println(String.format("%-20s %s", "Total
Deductions:", totalDeductions));
System.out.println(String.format("%-20s %s", "Basic Wage:",
basicWage));
System.out.println(String.format("%-20s %s", "HRA:", hra));
System.out.println(String.format("%-20s %s", "Conveyance
Allowances:", conveyanceAllowances));
System.out.println(String.format("%-20s %s", "Medical
Allowances:", medicalAllowances));
System.out.println(String.format("%-20s %s", "Other
Allowances:", otherAllowances));
System.out.println(String.format("%-20s %s", "EPF:", epf));
System.out.println(String.format("%-20s %s", "ESI:", esi));
System.out.println(String.format("%-20s %s", "PT:", pt));
System.out.println(String.format("%-20s %s", "Loan Recovery:",
loanRecovery));
}

}

package motorph;
import java.util.Scanner;
public class Employeerecord {

	public static void main(String[] args) {
		String Employee[][]= {{"EmployeeNumber:10001","LastName:Crisostomo","FirstName:Jose","Birthday:February 14, 1988",
			"Address:17/85 Stracke Via Suite 042,Poblacion, Las Pinas 4783 Dinagat Islands","Phonenumber:918-621-603","Status:Active"}};
	
	
	for(String Emp[]: Employee) {
	for(String info:Emp) {
	System.out.println(info);
	}
	System.out.println();
//Calculate hours worked class

	System.out.println("***hoursWorkedperweek***");

	Scanner i= new Scanner (System.in); 
	
	final int STANDARD_WORK=48;
	
    int Day_1;
	int Day_2;
	int Day_3;
	int Day_4;
	int Day_5;
	int Day_6;
	int Totalhoursworkedperweek;
    double hourlyRate;
    double basicPay=0;
    double overTime=0;
    double overTimeRate=0;
    double overTimePay=0;
    double salaryperweek=0;
    double result;
    double Basicsalarypermonth;
    double pagibig=100,philhealth=1800,sss=1125,withholdingtax=6578,totaldeductions,netpay;
    //double Taxableincome=0;
    //double WithholdingTax;
   // double Netpay;  
   // double Calculation;
       
    
    
    System.out.print("Monday:");
	     Day_1= i.nextInt();
	     
	     System.out.print("Tuesday:");
	     Day_2= i.nextInt();
	     
	     System.out.print("Wednesday:");
	     Day_3= i.nextInt();
	     
	     System.out.print("Thursday:");
	     Day_4= i.nextInt();
	     
	     System.out.print("Friday:");
	     Day_5= i.nextInt();
	     
	     System.out.print("Saturday:");
	     Day_6= i.nextInt();
	     
	     Totalhoursworkedperweek = Day_1 + Day_2 + Day_3 + Day_4 + Day_5 + Day_6;
	     System.out.println ("Total number of Hours workedperweek is:" + Totalhoursworkedperweek);

	    System.out.print("Hourly Rate:" ) ;
	     hourlyRate = i.nextDouble();

  
        if(Totalhoursworkedperweek <= STANDARD_WORK) {
        basicPay= Totalhoursworkedperweek*hourlyRate;
	      salaryperweek= basicPay;		
         }
        else {
        basicPay=STANDARD_WORK* hourlyRate;
        overTime= Totalhoursworkedperweek - STANDARD_WORK;
        overTimeRate= hourlyRate* 1.25;
        overTimePay=overTimeRate*overTime;
        salaryperweek= basicPay + overTimePay;
	
        }
        result= basicPay + overTimePay;
        
       
        System.out.print("Salary perweek:" + basicPay + "+" + overTimePay +"="+  result );
       
        System.out.println();
        System.out.println();  }
	
	// Government deductions
	   System.out.println("*******GOVERNMENT DEDUCTIONS******");
	 
	 
	
	 GovernmentDeduction(62670,1125,1800,100,6578);
	
	 System.out.println("TOTAL DEDUCTIONS: ");
	 System.out.println(add( 1125,1800,100,6578));

     System.out.println("netpay: ");
     System.out.println(subtract(62670,9603));
     
      
    }
					

    static double add(double sss, double Philhealth, double Pagibig,double Withholdingtax) {
        return sss + Philhealth + Pagibig + Withholdingtax;


    }

    static double subtract(double Basicsalarypermonth, double Totaldeductions) {

       return Basicsalarypermonth-Totaldeductions;
    
    }

   static void GovernmentDeduction(int Basicsalarypermonth,int sss,int Philhealth,int Pagibig,int Withholdingtax ) {
	   System.out.println("BASICSALARYPERMONTH:" + Basicsalarypermonth );
	   System.out.println("sss:" + sss );
	   System.out.println("Philhealth:" + Philhealth );
	   System.out.println("Pagibig:" + Pagibig );
	   System.out.println("Withholdingtax:" + Withholdingtax );
	  

	}

}

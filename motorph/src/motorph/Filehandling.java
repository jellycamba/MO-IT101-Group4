package motorph;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Filehandling {

	public static void main(String[] args)throws IOException {
		 // declare and initialize the variables
        double test1,test2,test3,test4,test5;
        double result;
        String name;
        double Basicpay= 62670;
        double Sss=1125;
        double Philhealth=1800;
       double  Pagibig = 100;
        double Withholdingtax=6578;
        double Totaldeductions=0;
        double Netpay=0; 
        FileReader fr = new FileReader("C:\\Users\\X230\\OneDrive\\Desktop\\New folder\\emp1.txt");
        Scanner inFile = new Scanner(fr);

        PrintWriter outFile = new PrintWriter("C:\\Users\\X230\\OneDrive\\Desktop\\New folder\\output.txt");
        // Read till end of file
        while (inFile.hasNext())
        {
            name = inFile.next();
            outFile.println("Employee Name: " + name);
            outFile.println("Basicpay: " + Basicpay );
            outFile.println("sss: "  + Sss);
            outFile.println("Philhealth: " +  Philhealth );
            outFile.println("Pagibig: " +  Pagibig);
            outFile.println("Withholdingtax:" + Withholdingtax);
            
            
            test1 = inFile.nextDouble();
            test2 = inFile.nextDouble();
            test3 = inFile.nextDouble();
            test4 = inFile.nextDouble();
            test5 = inFile.nextDouble();
            
            outFile.printf("Totaldeductions: " + (test2+test3+test4+test5));
             result= 62670-(test2+test3+test4+test5);
             outFile.println();
           outFile.printf("Netpay:" + result);
           
           outFile.println();
	       
        }
        
        inFile.close();
        outFile.close();
       
	}

}

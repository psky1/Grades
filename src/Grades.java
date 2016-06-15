import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAXARRAY = 100;
		String studentName[] = new String[MAXARRAY];
		String grade[] = new String[MAXARRAY];
		String gender[] = new String[MAXARRAY];
		String major[] = new String[MAXARRAY];
		String state[] = new String[MAXARRAY];
		int score[] = new int[MAXARRAY];
		boolean keepGoing = true;
		double overallAverage = 0.0;
		double mAverage = 0.0;
		double fAverage = 0.0;
		int mCnt = 0;
		int fCnt = 0;
		
		double econAverage = 0.0;
		double computerAverage = 0.0;
		double eeAverage = 0.0;
		int econCnt = 0;
		int computerCnt = 0;
		int eeCnt = 0;
		
		double mdAverage = 0.0;
		double dcAverage = 0.0;
		double vaAverage = 0.0;
		int mdCnt = 0;
		int dcCnt = 0;
		int vaCnt = 0;
		
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		
		while (keepGoing) {

			System.out.print( "Enter Student Name:" );			
			studentName[counter] = keyboard.next();
			System.out.print( "Enter Grade:" );
			grade[counter] = keyboard.next();
			System.out.print( "Enter Gender (M/F):" );
			gender[counter] = keyboard.next();
			System.out.print( "Enter Major (Econ/CompSci/EE):" );
			major[counter] = keyboard.next();
			System.out.print( "Enter State (MD/DC/VA):" );
			state[counter] = keyboard.next();
			System.out.print( "Enter Score:" );
			score[counter] = keyboard.nextInt();
			counter +=1;
			System.out.println( "Type END when finished" );			
            if (keyboard.next().equals("END"))
            	keepGoing = false;
		}
		
		for (int i=0; i < counter; i++) {
			overallAverage = overallAverage + score[i];
			
			// To calculate average by gender
			if (gender[i].equals("M") || gender[i].equals("m")) {
				mCnt = mCnt+1;
				mAverage = mAverage + score[i];
			} else {
				fCnt = fCnt + 1;
				fAverage = fAverage + score[i];
			}
			String majorStr = major[i].toUpperCase();
			// To calcualte average by major
			if (majorStr.equals("ECON")) {
				econAverage = econAverage + score[i];
				econCnt = econCnt + 1;
			} else if (majorStr.equals("COMPSCI")) {
				computerAverage = computerAverage + score[i];
				computerCnt = computerCnt + 1;
		    } else {
		    	eeAverage = eeAverage + score[i];
		    	eeCnt = eeCnt + 1;
		    }
			
			
			String stateStr = state[i].toUpperCase();
			// To calcualte average by state
			if (stateStr.equals("MD")) {
				mdAverage = mdAverage + score[i];
				mdCnt = mdCnt + 1;
			} else if (stateStr.equals("DC")) {
				dcAverage = dcAverage + score[i];
				dcCnt = dcCnt + 1;
		    } else {
		    	vaAverage = vaAverage + score[i];
		    	vaCnt = vaCnt + 1;
		    }
			

		}
		overallAverage = overallAverage / counter;
		mAverage = mAverage / mCnt;
		fAverage = fAverage / fCnt;
		econAverage = econAverage / econCnt;
		computerAverage = computerAverage / computerCnt;
		eeAverage = eeAverage / eeCnt;
		
		mdAverage = mdAverage / mdCnt;
		dcAverage = dcAverage / dcCnt;
		vaAverage = vaAverage / vaCnt;
		
		System.out.println("REPORT");
		System.out.println("******");
		System.out.println("Number of Students: " + counter);
		System.out.printf("Average of Male Students: %2.2f" + mAverage);
		System.out.printf("Average of Female Students: %2.2f" + fAverage);
		System.out.printf("Average of Economics Students: %2.2f" + econAverage);
		System.out.printf("Average of Computer Science Students: %2.2f" + computerAverage);
		System.out.printf("Average of EE Students: %2.2f" +  eeAverage);
		
		System.out.printf("Average of Maryland Students: %2.2f" + mdAverage);
		System.out.printf("Average of DC Students: %2.2f" + dcAverage);
		System.out.printf("Average of Virginia Students: %2.2f" + vaAverage);
		
	}
 
}


/*
Dalton Community School wants a new tool that its teachers will 
use to gather statistics for their classes.

The data that the teachers will gather is as follows:
Name 	Grade 	Gender 	Major 	State of Origin 	Score
Bob Jones 	A 	M 	Econ 	Maryland 	88

Note: Dalton Community School only operates in three states: 
MD. DC, and VA. They only offer three majors: Econ, CompSci and EE.

Write an application that will accept the user input as long as it continues.

At any point the user should be able to request a report of the following:

Number of Students
Overall Average
Average by Gender
Average by Major
Average by State

 

When the user has finished entering data then the program will print 
out the following:

Report Date (Just use today's date until we learn to use the 
Java Date Class).

Number of Students
Overall Average
Average for Gender
Average for Major
Average by State
*/
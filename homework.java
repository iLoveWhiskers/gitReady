import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		//defined variables
		int points=0;
		int commuteTime=-1;
		int yearlyIncome=-1;
		float gpa=-1;
		String temp="";
		String userName ="";
		String year="";
		String age="";
		String studentStatus="";
		String onProbation="";
		String onSuspension="";
		String onProbhation="";
		String outOfState="";
		String committedCrimes="";
		String workOnCampus="";
		String haveDisabilities="";
		String haveMentalIssues="";
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Housing Points Program");
		//Enter name
		System.out.println("Please Enter Your Name: ");
		userName = scnr.nextLine();
		
		//Question 1 - asking if freshman, sophomore, junior, or senior
		while (!year.contains("freshman")&&!year.contains("sophomore")&&!year.contains("junior")&&!year.contains("senior")){
			System.out.println("Question 1 - Are you a freshman, sophomore, junior, or senior?");
			System.out.println("Enter freshman, sophomore, junior, or senior");
			year = scnr.nextLine();
			year = year.toLowerCase();
		}
		if (year.contains("freshman")) {
			points +=1;
		}
		else if(year.contains("sophomore")) {
			points +=2;
		}
		else if(year.contains("junior")) {
			points +=3;
		}
		else {
			points +=4;
		}
		//Question 2 - 23 years or older
		while(!age.contains("yes") && !age.contains("no")) {
			System.out.println("Question 2 - Are you above the age of 23?");
			System.out.println("Enter yes or no");
			age = scnr.nextLine();
			age = age.toLowerCase();			
		}
		if (age.contains("yes")) {
			points +=1;
		}
		//Question 3 - currently full time or receiving off-campus program credit
		while(!studentStatus.contains("yes") && !studentStatus.contains("no")) {
			System.out.println("Question 3 - Are you currently a full-time students or receiving off-campus program credit?");
			System.out.println("Enter yes or no");
			studentStatus = scnr.nextLine();
			studentStatus = studentStatus.toLowerCase();
		}
		if (studentStatus.contains("yes")) {
			points +=1;
		}
		

		//Question 4 - on academic probation
		while(!onProbation.contains("yes") && !onProbation.contains("no")) {
			System.out.println("Question 4 - Are you on academic probation?");
			System.out.println("Enter yes or no");
			onProbation = scnr.nextLine();
			onProbation = onProbation.toLowerCase();
		}
		if (onProbation.contains("yes")) {
			points -=1;
		}
		
		//Question 5 - on a possible academic suspension
		while(!onSuspension.contains("yes") && !onSuspension.contains("no")) {
			System.out.println("Question 5 - Are you on possible academic suspension?");
			System.out.println("Enter yes or no");
			onSuspension = scnr.nextLine();
			onSuspension = onSuspension.toLowerCase();
		}
		if (onSuspension.contains("yes")) {
			points -=2;
		}
		
		//Question 6 - on a disciplinary probation
		while(!onProbhation.contains("yes") && !onProbhation.contains("no")) {
			System.out.println("Question 6 - Are you on a disciplinary probation?");
			System.out.println("Enter yes or no");
			onProbhation = scnr.nextLine();
			onProbhation = onProbhation.toLowerCase();
		}
		if (onProbhation.contains("yes")) {
			points -=3;
		}
		
		//Question 7 - average commute time
		while(commuteTime<0) {
			System.out.println("Question 7 - What is your average commute time?");
			System.out.println("Enter in minutes, enter 0 if not from state");
			commuteTime = scnr.nextInt();
			scnr.nextLine();
		}
		if (commuteTime>30) {
			points +=1;
		}
		
		//Question 8 - from out of state or country
		while(!outOfState.contains("yes") && !outOfState.contains("no")) {
			System.out.println("Question 8 - Are you from out of state or country?");
			System.out.println("Enter yes or no");
			outOfState = scnr.nextLine();
			outOfState = outOfState.toLowerCase();
		}
		if (outOfState.contains("yes")) {
			points +=2;
		}
		
		//Question 9 - gpa
		while(gpa<0) {
			System.out.println("Question 9 - What is your GPA?");
			System.out.println("Enter your GPA");
			gpa = scnr.nextFloat();
			scnr.nextLine();
		}
		if (gpa>=3.0) {
			points +=2;
		}
		else if (gpa>=2.0) {
			points +=1;
		}
		
		//Question 10 - yearly income
		while(yearlyIncome<0) {
			System.out.println("Question 10 - What is your yearly income?");
			System.out.println("Enter in the nearest dollar");
			yearlyIncome = scnr.nextInt();
			temp=scnr.nextLine();
		}
		if (yearlyIncome<100000) {
			points +=1;
		}
		
		//Question 11 - have committed crimes before
		while(!committedCrimes.contains("yes") && !committedCrimes.contains("no")) {
			System.out.println("Question 11 - Have you committed crimes before?");
			System.out.println("Enter yes or no");
			committedCrimes = scnr.nextLine();
			committedCrimes = committedCrimes.toLowerCase();
		}
		if (committedCrimes.contains("yes")) {
			points -=3;
		}
		
		//Question 12 - work an on campus job
		while(!workOnCampus.contains("yes") && !workOnCampus.contains("no")) {
			System.out.println("Question 12 - Do you work a campus job?");
			System.out.println("Enter yes or no");
			workOnCampus = scnr.nextLine();
			workOnCampus = workOnCampus.toLowerCase();
		}
		if (workOnCampus.contains("yes")) {
			points +=2;
		}
		
		//Question 13 - have disabilities
		while(!haveDisabilities.contains("yes") && !haveDisabilities.contains("no")) {
			System.out.println("Question 13 - Do you have any disabilities?");
			System.out.println("Enter yes or no");
			haveDisabilities = scnr.nextLine();
			haveDisabilities = haveDisabilities.toLowerCase();
		}
		if (haveDisabilities.contains("yes")) {
			points +=2;
		}
		
		//Question 14 - suffer from mental health issues
		while(!haveMentalIssues.contains("yes") && !haveMentalIssues.contains("no")) {
			System.out.println("Question 14: Do you suffer from mental health issues?");
			System.out.println("Enter yes or no");
			haveMentalIssues = scnr.nextLine();
			haveMentalIssues = haveMentalIssues.toLowerCase();
		}
		if (haveMentalIssues.contains("yes")) {
			points +=2;
		}
		
		//Output amount of points
		System.out.println(userName+": "+points+ " points");

		scnr.close();
	}	
}
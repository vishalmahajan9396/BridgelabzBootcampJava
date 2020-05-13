public class EmployeeWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static int computeEmpWage() {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      //Computation
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_>
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch(empCheck) {
            case IS_PART_TIME:
               empHrs = 8;
               break;
            case IS_FULL_TIME:
               empHrs = 12;
               break;
            default:
               empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day#: " + totalWorkingDays + "Employee Hours: " + empHrs);
      }
      int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
      System.out.println("Total Employee Wage:" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage();
	}
}

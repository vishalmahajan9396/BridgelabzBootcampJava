public class EmpWageBuilderMultiCompany {
	//Constans
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      //Computation
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <=  maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
      int totalEmpWage = totalEmpHrs * empRatePerHours;
      System.out.println("Total Employee Wage for Company:" +company+" is: "+ totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("DMart", 20, 20, 100);
		computeEmpWage("Reliance", 10, 4, 50);
	}
}

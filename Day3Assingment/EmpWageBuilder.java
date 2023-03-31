package day3basic;

public class EmpWageBuilder {

	public static void main(String[] args) {
		EmpWageBuilderUC1();
		EmpWageBuilderUC2();
		EmpWageBuilderUC3();
		EmpWageBuilderUC4();
		EmpWageBuilderUC5();
		EmpWageBuilderUC6();
	}

	static void EmpWageBuilderUC1() {
		int Full_Time = 1;
		double empCheck = (int) Math.random() * 10 % 2;
		if (empCheck == Full_Time) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

	static void EmpWageBuilderUC2() {

		int Full_Time = 1;
		int Emp_rate_per_hour = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = (int) Math.random() * 10 % 2;

		if (empCheck == Full_Time) {
			empHrs = 8;
		} else {
			empHrs = 0;
			empWage = empHrs * Emp_rate_per_hour;
			System.out.println("Emp Wage is " + " " + empWage);
		}
	}

	static void EmpWageBuilderUC3() {
		int Part_Time = 1;
		int Full_time = 2;
		int Emp_rate_per_hour = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCkeck = (int) Math.random() * 10 % 3;

		if (empCkeck == Part_Time) {
			empHrs = 4;

		} else if (empCkeck == Full_time) {
			empHrs = 8;
		} else {
			empHrs = 0;

			empWage = empHrs * Emp_rate_per_hour;
			System.out.println("EMP WAGE" + empWage);
		}
	}

	static void EmpWageBuilderUC4() {


		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		final int EMP_RATE_PER_HRS = 20;
		int empHrs = 0;
		int empWage = 0;

		int empCheck = (int) Math.random() * 10 % 3;
		switch (empCheck) {

		case PART_TIME:
			empHrs = 4;
			break;
		case FULL_TIME:
			empHrs = 8;

		default:
			empHrs = 0;
		}

		empWage = empHrs * EMP_RATE_PER_HRS;
		System.out.println("Emp Wage" + empWage);
	}

	static void EmpWageBuilderUC5() {


		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		final int EMP_RATE_PER_HRS = 20;
		final int NUMBER_OF_WORKINF_DAYS = 2;

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 0; day < NUMBER_OF_WORKINF_DAYS; day++) {
			int empCheck = (int) Math.random() * 10 % 3;
			switch (empCheck) {

			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HRS;
			totalEmpWage += empWage;
			System.out.println("Emp Wage" + " " + empWage);
		}
		System.out.println("Total Emp Wage" + " " + totalEmpWage);
	}

	static void EmpWageBuilderUC6() {

		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		final int EMP_RATE_PER_HRS = 20;
		final int NUMBER_OF_WORKINF_DAYS = 2;
		final int MAX_HRS_MONTH=20;
		int empHrs = 0;
		int empWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays=0;

		while(totalEmpHrs<=MAX_HRS_MONTH && totalWorkingDays<NUMBER_OF_WORKINF_DAYS) {
		totalWorkingDays++;
			int empCheck = (int) Math.random() * 10 % 3;
			switch (empCheck) {

			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs+=empHrs;
			
			System.out.println("Day" + totalWorkingDays+ "Emp Hr " + empHrs);
		}
		System.out.println("Total Emp Wage" + " " + totalEmpHrs);

	}
}

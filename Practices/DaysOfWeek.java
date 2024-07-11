package Practices;

public class DaysOfWeek {

	public static void main(String[] args) {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		int dayNumber = 1; // Example: 1 for Monday

		if (dayNumber >= 1 && dayNumber <= days.length) {
			String dayName = days[dayNumber - 1];
			System.out.println("Day " + dayNumber + " is " + dayName);
		} else {
			System.out.println("Invalid day number");
		}
	}

}

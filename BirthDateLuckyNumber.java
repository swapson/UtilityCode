public class BirthDateLuckyNumber {

	// Note: for simplicity date validation is not done

	public static void main(String[] args) throws Exception {
		// birthdate in DD-MM-YYYY format
		String dob = "30-07-2021";

		printLuckyNumber1(dob);
		printLuckyNumber2(dob);

	}

	private static void printLuckyNumber1(String dob) {
		String[] dobPart = dob.split("-");

		int dd = Integer.parseInt(dobPart[0]);
		int mm = Integer.parseInt(dobPart[1]);
		int yyyy = Integer.parseInt(dobPart[2]);

		int total = dd + mm + yyyy;
		int luckyNum = ((total - 1) % 9) + 1;

		System.out.printf("Logic1 :: DOB: %s, lucky number: %d\n", dob, luckyNum);

	}

	private static void printLuckyNumber2(String dob) {
		int digits = Integer.parseInt(dob.replaceAll("-", "").replaceAll("0", ""));
		int luckyNum = ((digits - 1) % 9) + 1;

		System.out.printf("Logic2 :: DOB: %s, lucky number: %d\n", dob, luckyNum);

	}
}

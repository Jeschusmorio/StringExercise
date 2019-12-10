public class StringExerciseMain {

	public static void main(String[] args) {
		String s1 = "Meier";
		String s2 = "Mayer";
		int alphOrder = s1.compareTo(s2);
		if ((alphOrder < 0) || (alphOrder == 0)) {
			System.out.println(s1 + "\n" + s2);
		}
		else {
			System.out.println(s2 + "\n" + s1);
		}
	}

}

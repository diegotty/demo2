package esercizi7;

public class MainStringaIterabile {
	public static void main(String[] args) {
		StringaIterabile str = new StringaIterabile("can8");
		for(Character c : str) {
			System.out.println(c);
		}
	}
}

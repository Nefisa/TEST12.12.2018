import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		
		String unos = input.nextLine();
		
		input.close();
		
		int pom = 0;
		
		for (int i = 0; i < unos.length(); i++) {
			if (Character.isLetter(unos.charAt(i))) {
				if (pom % 2 == 0) {
					System.out.print(Character.toUpperCase(unos.charAt(i)));
					pom = 1;
				} else {
					System.out.print(Character.toLowerCase(unos.charAt(i)));
					pom = 0;
				}
			} else
				System.out.print(unos.charAt(i));
		}
	}

}

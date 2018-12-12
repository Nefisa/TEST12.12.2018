import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite pozitivan cijeli broj: ");

		int broj = input.nextInt();

		if (broj <= 0) {
			System.out.println("Pogresan unos. Pokusajte ponovo: ");
			broj = input.nextInt();
		}

		input.close();

		System.out.print("\nHailstone sekvenca za broj " + broj + " je : ");

		ArrayList<Integer> sekvenca = new ArrayList<>();

		sekvenca.add(broj);

		while (broj != 1) {
			if (broj % 2 == 0) {
				broj /= 2;
				sekvenca.add(broj);
			} else {
				broj = (3 * broj) + 1;
				sekvenca.add(broj);
			}
		}

		for (int i = 0; i < sekvenca.size(); i++)
			System.out.print(sekvenca.get(i) + " ");
	}

}

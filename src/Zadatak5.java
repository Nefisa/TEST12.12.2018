import java.util.Scanner;

public class Zadatak5 {
	
	// jednostavnija verzija programa, gdje pri unosu uzima samo rijec, i provjerava samo slova

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite string: ");

		String unos = input.next();

		input.close();

		char karakterKojiSeNePonavlja = ' ';

		for (int i = 0; i < unos.length(); i++) {
			int brojPonavljanja = 0;
			char temp;
			if (Character.isLetter(unos.charAt(i)))
				temp = unos.charAt(i);
			else {
				continue;

			}
			for (int j = i + 1; j < unos.length(); j++) {
				if (unos.charAt(i) == unos.charAt(j)) {
					brojPonavljanja++;
					unos = unos.replace(temp, '1');
				}

			}

			if (brojPonavljanja == 0) {
				karakterKojiSeNePonavlja = temp;
				break;
			}

		}

		if (karakterKojiSeNePonavlja == ' ')
			System.out.println("Nema karaktera koji se ne ponavlja.");
		else
			System.out.println("Prvi karakter koji se ne ponavlja u unesenom stringu: " + karakterKojiSeNePonavlja);
	}

}

package Zadatak1;

import java.util.ArrayList;

public class Mobitel {

	private String proizvodjac;
	private String model;
	private double brzinaProcesora;
	private int brojJezgriProcesora;
	private double kolicinaRAMMemorije;
	private int kolicinaMemorije;
	private double brojMegaPikselaKamere;
	private ArrayList<String> nizInstaliranihAplikacija = new ArrayList<>(); // getter i setter za ovo polje ne postoje,
																				// jer su to u biti metode koje su
																				// zadane u zadatku (obrisi, instaliraj
																				// i ispisi Aplikaciju)

	public Mobitel() {

	}

	public Mobitel(String proizvodjac, String model, double brzinaProcesora, int brojJezgriProcesora,
			double kolicinaRAMMemorije, int kolicinaMemorije, double brojMegaPikselaKamere) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.brzinaProcesora = brzinaProcesora;
		this.brojJezgriProcesora = brojJezgriProcesora;
		this.kolicinaRAMMemorije = kolicinaRAMMemorije;
		this.kolicinaMemorije = kolicinaMemorije;
		this.brojMegaPikselaKamere = brojMegaPikselaKamere;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		if (brzinaProcesora > 0)
			this.brzinaProcesora = brzinaProcesora;
		else
			System.out.println("Neispravan unos. Pokusajte sa pozivitnim brojem.");
	}

	public int getBrojJezgriProcesora() {
		return brojJezgriProcesora;
	}

	public void setBrojJezgriProcesora(int brojJezgriProcesora) {
		if (brojJezgriProcesora > 0)
			this.brojJezgriProcesora = brojJezgriProcesora;
		else
			System.out.println("Neispravan unos. Pokusajte sa pozitivnim brojem.");
	}

	public double getKolicinaRAMMemorije() {
		return kolicinaRAMMemorije;
	}

	public void setKolicinaRAMMemorije(double kolicinaRAMMemorije) {
		if (kolicinaRAMMemorije > 0)
			this.kolicinaRAMMemorije = kolicinaRAMMemorije;
		else
			System.out.println("Neispravan unos. Pokusajte sa pozivitnim brojem.");
	}

	public int getKolicinaMemorije() {
		return kolicinaMemorije;
	}

	public void setKolicinaMemorije(int kolicinaMemorije) {
		if (kolicinaMemorije > 0)
			this.kolicinaMemorije = kolicinaMemorije;
		else
			System.out.println("Neispravan unos. Pokusajte sa pozitivnim brojem.");
	}

	public double getBrojMegaPikselaKamere() {
		return brojMegaPikselaKamere;
	}

	public void setBrojMegaPikselaKamere(double brojMegaPikselaKamere) {
		if (brojMegaPikselaKamere > 0)
			this.brojMegaPikselaKamere = brojMegaPikselaKamere;
		else
			System.out.println("Neispravan unos.Pokusajte sa pozitivnim brojem.");
	}

	public void ispisiSpecifikaciju() {

		System.out.println("Mobitel");
		System.out.println("Proizvodjac: " + this.proizvodjac + ", model: " + this.model);
		System.out.println(
				"Brzina procesora: " + this.brzinaProcesora + ", broj jezgri procesora: " + this.brojJezgriProcesora);
		System.out.println(
				"Kolicina RAM memorije: " + this.kolicinaRAMMemorije + ", kolicina memorije: " + this.kolicinaMemorije);
		System.out.println("Broj mega piksela kamere: " + this.brojMegaPikselaKamere);
	}

	public void instalirajAplikaciju(String imeAplikacije) {

		if (this.nizInstaliranihAplikacija.size() < 20) {
			this.nizInstaliranihAplikacija.add(imeAplikacije);
			System.out.println("Aplikacija uspjesno dodana!");
		} else
			System.out.println(
					"Dostigli ste maksimalan broj aplikacija. Molimo izbrisite jednu kako i pokusajte ponovo dodati.");
	}

	public void obrisiAplikaciju(String imeAplikacije) {

		for (int i = 0; i < this.nizInstaliranihAplikacija.size(); i++) {
			if (this.nizInstaliranihAplikacija.get(i).equals(imeAplikacije)) {
				this.nizInstaliranihAplikacija.remove(i);
				System.out.println("Aplikacija uspjesno obrisana.");
			}
		}

	}

	public void ispisiInstaliraneAplikacije() {

		System.out.println("Aplikacije instalirane na mobitelu su: ");
		for (int i = 0; i < this.nizInstaliranihAplikacija.size(); i++) {
			System.out.println((i + 1) + " " + this.nizInstaliranihAplikacija.get(i));
		}
	}

	public void ubaciSDKarticu(int memorija) {

		if (memorija <= 0) {
			System.out.println("Pogresan unos.");
		} else {
			this.kolicinaMemorije += memorija;
			System.out.println("Memorija povecana i sada iznosi: " + this.kolicinaMemorije);
		}
	}

}

package Zadatak1;

public class MobitelTest {
	
	public static void main(String[] args) {
		
		Mobitel mobitel1 = new Mobitel("Huawei", "Mate 20 Pro", 3.15, 8, 6, 128, 24);
		
		mobitel1.ispisiSpecifikaciju();
		
		mobitel1.instalirajAplikaciju("Viber");
		mobitel1.instalirajAplikaciju("Facebook");
		mobitel1.instalirajAplikaciju("Whatsapp");
		mobitel1.obrisiAplikaciju("Facebook");
		
		mobitel1.ispisiInstaliraneAplikacije();
	}

}

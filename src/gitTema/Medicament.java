package gitTema;

public class Medicament implements MetodeMedicamente {
	String nume;
	float pret;
	
	public Medicament(String nume, float pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}
	
	@Override
	public void actualizareNume(String nume) {
		this.nume = nume;
	}
	
}

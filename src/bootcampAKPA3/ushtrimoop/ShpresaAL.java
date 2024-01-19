package bootcampAKPA3.ushtrimoop;

import java.util.ArrayList;
import java.util.List;

public class ShpresaAL {
//	private List<Iphone> iphone;
//	private List<Nokia> nokia;
	private List<Telefon> telefonaGjendje;
	
	public ShpresaAL() {
		this.telefonaGjendje = new ArrayList<>();
	}
	
	public boolean shtoTelefon(Telefon tel) {
		this.telefonaGjendje.add(tel);
		return true;
	}
	public List<Telefon> getTelefonaGjendje(){
		return this.telefonaGjendje;
	}
}

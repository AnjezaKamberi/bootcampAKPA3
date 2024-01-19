package bootcampAKPA3.ushtrimoop;
import java.time.LocalDateTime;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//Telefon t = new Telefon(2005);
		Iphone i = new Iphone(2001,"Iphone",64);
		System.out.println(i.getKompaniProdhuese());
		System.out.println(i.getVitProdhimi());
		System.out.println(i.getMadhesia());
		i.degjoAudio(22);
		System.out.println(i.toString());
		Iphone i2 = new Iphone(2001, "Iphone", 64);
		//Iphone i2 = i;
		System.out.println(i==i2);
		System.out.println(i.equals(i2));
		Telefon t1 = new Iphone();
		Iphone i3 = (Iphone)t1;
		
		t1.degjoAudio();
		//nuk funksionon
		//t1.degjoAudio(57);
		ShpresaAL shpresaAl = new ShpresaAL();
		shpresaAl.shtoTelefon(i);
		shpresaAl.shtoTelefon(i2);
		shpresaAl.shtoTelefon(new Nokia());
		System.out.println("--------------------------------s");
		List<Telefon> telefonaGjendje = shpresaAl.getTelefonaGjendje();
		System.out.println(telefonaGjendje);
		
		System.out.println("Telefon instance of Iphone " + (telefonaGjendje.get(0) instanceof Iphone));
		System.out.println("Telefon instance of Iphone " + (telefonaGjendje.get(0) instanceof Telefon));
		System.out.println("Telefon instance of Iphone " + (telefonaGjendje.get(0) instanceof Nokia));
		LocalDateTime data = LocalDateTime.now();
;		
	}

}

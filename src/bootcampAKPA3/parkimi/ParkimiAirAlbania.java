package bootcampAKPA3.parkimi;

import java.time.LocalDateTime;
import java.util.*;

public class ParkimiAirAlbania {

	private int hapesiraTeLira;
	private List<MjeteTransporti> mjeteTransporti;

	public ParkimiAirAlbania() {
		this.hapesiraTeLira = 100;
		mjeteTransporti = new ArrayList<>();
	}

	public void shtoMjetTransportiNeParkim(MjeteTransporti mjetTransporti) {
		if(checkIfHapesiraTeLira()) {
			mjeteTransporti.add(mjetTransporti);
			hapesiraTeLira--;
			System.out.println("Mjetet e parkuara: "+mjeteTransporti);
		}
		else {
			System.out.println("Nuk ka vende te lira parkimi!");
		}
	}

	public boolean checkIfHapesiraTeLira() {
		if (hapesiraTeLira <= 100 && hapesiraTeLira >0) {
			System.out.println("Numri i hapesirave te lira eshte: " + hapesiraTeLira);
			return true;
		} else {
			return false;
		}

	}

}

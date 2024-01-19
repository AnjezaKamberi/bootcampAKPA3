package bootcampAKPA3.ushtrimoop;

public class Iphone extends Telefon{
	private int madhesia;
	
	public Iphone() {
		super();
		this.madhesia=32;
	}
	public Iphone(int vitProdhimi,String kompaniProdhuese,int madhesia) {
		super(kompaniProdhuese,vitProdhimi);
		this.madhesia=madhesia;
		
	}
	

	@Override
	public void autentifikohu() {
		System.out.println("Autentifikim");
		
	}
	public int getMadhesia() {
		return madhesia;
	}
	public void setMadhesia(int madhesia) {
		this.madhesia = madhesia;
	}
	
	@Override
	public void degjoAudio() {
		System.out.println("Po degjoj audio ne Iphone");
	}
	
	public void degjoAudio(int volumi) {
		System.out.println("Po degjoj audio ne volumin "+volumi);
	}
	@Override
	public String toString() {
		return super.toString()+" "+this.madhesia;
	}
	@Override
	public boolean equals(Object obj) {
		Iphone t = (Iphone)obj;
		return this.getKompaniProdhuese().equals(t.getKompaniProdhuese())
				&&this.getVitProdhimi()==t.getVitProdhimi()
				&&this.madhesia == t.getMadhesia();
			
	}

}

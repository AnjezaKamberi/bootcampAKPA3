package bootcampAKPA3.exceptions.shembull.celdo;

public class Kategori {
	private String kategoriProdukt;

	public Kategori(String kategoriProdukt) {
		this.kategoriProdukt = kategoriProdukt;
	}

	public String getKategoriProdukt() {
		return kategoriProdukt;
	}

	public void setKategoriProdukt(String kategoriProdukt) {
		this.kategoriProdukt = kategoriProdukt;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Kategori) {
			return this.kategoriProdukt.equals(((Kategori) o).getKategoriProdukt());
		}
		return false;
	}
}

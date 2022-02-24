package practiceOkulYonetimi;

public class Kisi {
	private String adSoyad;
	private String kimlikNo;
	private int yas;
	
	
	private Kisi(String adSoyad, String kimlikNo, int yas) {
		super();
		this.adSoyad = adSoyad;
		this.kimlikNo = kimlikNo;
		this.yas = yas;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getKimlikNo() {
		return kimlikNo;
	}
	public void setKemlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
}

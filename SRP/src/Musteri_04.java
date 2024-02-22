
public class Musteri_04 {
	
	public String musteriname;
	public int musteriid;
	public static String adres;
	public String telefon;
	public int kart;
	

	
	public String getMusteriname() {
		return musteriname;
	}
	public void setMusteriname(String musteriname) {
		this.musteriname = musteriname;
	}
	public int getMusteriid() {
		return musteriid;
	}
	public void setMusteriid(int musteriid) {
		this.musteriid = musteriid;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public int getKart() {
		return kart;
	}
	public void setKart(int kart) {
		this.kart = kart;
	}
	
	
	
		Urun ur=new Urun();
			public void odemeYap(int kartbakiye) {
				kartbakiye=5000;
				if(kartbakiye>=ur.getFiyat()) {
					System.out.println("Siparisiniz alindi");
					
				}
				else {
					System.out.println("YETERSİZ BAKİYE");
				}
		        
		    }
			
		
	
	
	

}

import java.util.ArrayList;
import java.util.List;


public class eticaret_04 {
	String name;
    int fiyat;
    String uruntur;
	
	public String musteriname;
	public int musteriid;
	public static String adres;
	public String telefon;
	public int kart;
	
	 public String teslimatadresi;
	  public int takipno;
	  public String kargosirketi;
	  
	  
	  
	
	    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public String getUruntur() {
		return uruntur;
	}

	public void setUruntur(String uruntur) {
		this.uruntur = uruntur;
	}

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

	public static String getAdres() {
		return adres;
	}

	public static void setAdres(String adres) {
		eticaret_04.adres = adres;
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

	public String getTeslimatadresi() {
		return teslimatadresi;
	}

	public void setTeslimatadresi(String teslimatadresi) {
		this.teslimatadresi = teslimatadresi;
	}

	public int getTakipno() {
		return takipno;
	}

	public void setTakipno(int takipno) {
		this.takipno = takipno;
	}

	public String getKargosirketi() {
		return kargosirketi;
	}

	public void setKargosirketi(String kargosirketi) {
		this.kargosirketi = kargosirketi;
	}

	public List<Urun> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urun> urunler) {
		this.urunler = urunler;
	}

		private List<Urun> urunler = new ArrayList<Urun>();

	    public  void urunEkle(Urun urun) {
	        urunler.add(urun);
	    }
	    

	    public void urunSil(Urun urun) {
	        urunler.remove(urun);
	    }

	    public double toplamTutarHesapla() {
	        double toplamTutar = 0;
	        for (Urun urun : urunler) {
	            toplamTutar += urun.getFiyat();
	        }
	        return toplamTutar;
	    }

	    	public void odemeYap(int kartbakiye) {
	    		Urun urun=new Urun();
				kartbakiye=5000;
				
				if(kartbakiye>=urun.getFiyat()) {
					System.out.println("Siparisiniz alindi");
					
				}
				else {
					System.out.println("YETERSİZ BAKİYE");
				}
		        
	    }
	    
	    public void kargofirmasi() {
	    	System.out.println("mng kargo");
	    }
	    
	    public void kargoaderesbilgi() {
	    	System.out.println("merkez mah. karanfil sok. ankara");
	    }
	}
		


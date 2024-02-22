import java.util.ArrayList;
import java.util.List;

public  class Urun {
	
	String name;
    int fiyat;
    String uruntur;
    
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFiyat() {
		return fiyat;
	}


	public int setFiyat(int fiyat) {
		return this.fiyat = fiyat;
	}


	public String getUruntur() {
		return uruntur;
	}


	public void setUruntur(String uruntur) {
		this.uruntur = uruntur;
	}
   
	

 List<String> urunler = new ArrayList<String>();
    public  void  urunEkle(String uruntur) {
      
			urunler.add(uruntur);
			System.out.println("urun eklendi");
		
    }
    public void sepet() {

 
    	 for (String element : urunler) {
 	    	
             System.out.println(element);
         }
    }

    public void urunSil(String uruntur) {
        urunler.remove(uruntur);
        System.out.println("urun cikarildi");
    }
    public double toplamTutarHesapla() {
    	List<Urun> urunler = new ArrayList<Urun>();
        double toplamTutar = 0;
        for (Urun urun : urunler) {
        	toplamTutar+=setFiyat(fiyat);
        	System.out.println("  " +toplamTutar);
            
        }
        return toplamTutar;
    }
    
    
    
    
	   
}

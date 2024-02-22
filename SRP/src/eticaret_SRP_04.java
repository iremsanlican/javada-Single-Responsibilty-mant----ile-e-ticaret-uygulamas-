
public class eticaret_SRP_04{
	
	public static void main(String[] args) {
		
	Urun u= new Urun();
    
    u.urunEkle("masa");
    u.sepet();
    u.urunSil("masa");
    u.setFiyat(150);
    u.toplamTutarHesapla();
    
    Musteri_04 m=new Musteri_04();
    m.odemeYap(5000);
  
    Kargo_04 k=new Kargo_04();
    k.kargoaderesbilgi();
    k.kargofirmasi();
    
	/*eticaret_04 e= new eticaret_04();
    e.odemeYap(77);*/
    
	}
}

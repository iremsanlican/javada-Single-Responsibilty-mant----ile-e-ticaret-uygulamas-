import java.util.Scanner;

public class Kargo_04 {
	
	
	  public String teslimatadresi;
	  public int takipno;
	  public String kargosirketi;
	  
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
	
	
	  
	 public void kargofirmasi() {
		    System.out.println("kargo firmasi seciniz");
	    	System.out.println("1-mng kargo"
	    			          +"2-aras kargo"
	    			          +"3-sendeo ");
	    	Scanner scan =new Scanner(System.in);
	    	int choice=scan.nextInt();
	    	
	    	if(choice==1) {
	    		System.out.println("kargonuz mng ile gelecektir");
	    	}
	    	else if(choice==2) {
	    		System.out.println("kargonuz aras ile gelecektir");
	    	}
	    	else {
	    		System.out.println("kargonuz sendeo ile gelecektir");
	    	}
	    		
	    	
	    }
	    
	    public void kargoaderesbilgi() {
	    	System.out.println("merkez mah. karanfil sok. ankara");
	    	
	    	
	    }
	  
	

}

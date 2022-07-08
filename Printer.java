
public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel <= -1 || tonerLevel > 100)
		{
			this.tonerLevel = -1;
		}else {
			this.tonerLevel = tonerLevel;
		}
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	
	public int addToner(int tonerAmount) {
		if(tonerAmount + this.tonerLevel >100){
	           return -1;
	        }
	        else if((tonerAmount >0 && tonerAmount <=100) && (tonerAmount + this.tonerLevel <=100)){
	          this.tonerLevel += tonerAmount;
	        }else{
	            return -1;
	        }
	        return this.tonerLevel;
	}
	
	public int getPagesPrinted() {
        return pagesPrinted;
    }
	
	public int printPages(int pages) {
		int pagesToPrint=0;
		
		if(duplex) {
			System.out.println("Printing in duplex mode");
			pagesToPrint = pages/2 + pages%2;
			this.pagesPrinted += pagesToPrint;
		}else {
			pagesToPrint = pages;
			this.pagesPrinted += pagesToPrint;
		}
		
		return pagesToPrint;
	}
	
	
	
	
	

}

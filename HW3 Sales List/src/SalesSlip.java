import java.util.ArrayList;

public class SalesSlip {
	private ArrayList<SalesItem> list;
	
	public SalesSlip() {
		list = new ArrayList<SalesItem>();
	}
	
	public void add(String name, double price, int quantity) {
		list.add(new SalesItem(name, price, quantity));
	}
	
	
	
	public String toString() {
		String str = "";
		for(SalesItem item : list) {
			if(item != list.get(list.size()-1))
				str+= item.toString()+"\n";
			else 
				str+= item.toString();
		}
		return str;
	}
	public String salesString() {
		return "$"+String.format("%.2f", this.totalSales());
	}
	public double totalSales() {
		double total = 0;
		for(SalesItem item : list) {
			total += item.getFullPrice();
		}
		return total;
	}
	
}


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SalesItem salesitem1 = new SalesItem("Choco Waffles", 10.45, 4);
		SalesItem salesitem2 = new SalesItem("Ginger Cookies", 2.00, 1);
		System.out.println(salesitem1.toString());
		System.out.println(salesitem2.toString());
		
		SalesSlip items= new SalesSlip();
		items.add("Choco Waffles", 10.45, 4);
		items.add("Ginger Cookies", 2.00, 1);
		items.add("Carmel Soda", 2.2, 1);
		items.add("Wheat Tortilla", 3.5, 1);
		items.add("Sour Cream", 1.99, 1);
		System.out.println(items.totalSales());
		System.out.println(items.toString());
		System.out.println(items.salesString());
	}

}

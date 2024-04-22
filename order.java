public class order {
	public int customerId;
	public int orderId;
	public order(int customerId,int orderId,product []products2,float totalprice) {
		this.customerId=Math.abs(customerId);
		this.orderId=Math.abs(orderId);
		this.products2=products2;
		this.totalprice=Math.abs(totalprice);
	}private product []products2;public void printOrderInfo() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for(int i =0; i< products2.length;i++) {
        	if (products2[i]!=null) {
        		System.out.println(" "+ products2[i].getname()+ "$"+products2[i].getprice());
        	}}
        System.out.println("Total price : "+(float)totalprice+"$");
	}public float totalprice;}

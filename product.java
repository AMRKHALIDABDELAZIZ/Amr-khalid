public class product {
	public int productId;
	public String name;
	public float price;public int  getproductID() {
		return productId;
	}public String  getname() {
		return name;
	}public float  getprice() {
		return price;}public void setproductID(int productId) {
		this.productId=Math.abs(productId);}public void setname(String name) {
		this.name=name;	}
	public void setprice(float price) {
		this.price=Math.abs(price);}
	public product (int productId,String name,double d) {
		this.productId=Math.abs(productId);
		this.name=name;
		this.price=(float) Math.abs(d);
	}
}

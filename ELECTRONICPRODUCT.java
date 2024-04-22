public class ELECTRONICPRODUCT extends product {
    public String brand;
	public String getbrand() {
		return brand;}
    public ELECTRONICPRODUCT(String name,int productID,  double d, String brand,int warrantyPeriod) {
		super(productID, name,d);
	    this.brand=brand;
	    this.warrantyPeriod=warrantyPeriod;}
    public int warrantyPeriod;
	public int getwarrantyPeriod() {
		return warrantyPeriod;}
	public void setbrand(String brand) {
		this.brand= brand;}
	public void setwarrantyPeriod(int warrantyPeriod) {
	    this.warrantyPeriod=warrantyPeriod;	
	}}

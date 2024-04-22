public class BOOKPRODUCT extends product {
	 public String author;
	 public String publisher;
	 public String getauthor() {
			return author;
		}
		public String getpublisher() {
			return publisher;
		}
		public void setauthor(String author) {
			this.author= author;
		}
		public void setpublisher(String publisher) {
		    this.publisher=publisher;	
		}
		 public BOOKPRODUCT(String name,int productID,  double d,String author,String publisher) {
				super(productID, name, d);
			    this.author=author;
			    this.publisher=publisher;
				}
		
}

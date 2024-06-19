public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "camisa";

	// numeric fields
        boolean outOfStock = false;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" quer comprar "+quantity+" "+itemDesc;

	// Calculating total cost
        if(quantity == 0)
        {
            System.out.println("Nao ha produtos no estoque!");
            outOfStock = true;
        }else if(quantity > 1)
        {
            total = (price*quantity)*tax;
            System.out.println(message + "s");
        }else
        {
            System.out.println(message);
        }
        
        
        
    }
    
}



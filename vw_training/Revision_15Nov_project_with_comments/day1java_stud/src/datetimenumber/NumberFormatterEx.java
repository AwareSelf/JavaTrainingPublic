package datetimenumber;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatterEx {

	public static void main(String[] args) {
		
		
		 ArrayList<Locale> locales = new ArrayList<>();
		 
		 
		 Locale l = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
		 
		 
		  locales.add(0, l);
		 
		  locales.add(1, new Locale.Builder().setLanguage("de").setRegion("DE").build());
		    
		  locales.add(2, new Locale.Builder().setLanguage("en").setRegion("US").build());
		 
		    
		    for (int i = 0; i < locales.size(); i++) {
		    //  displayNumber(locales.get(i));
		    	
		    	displayCurrency(locales.get(i));
		    }

	}
	
	
	 static public void displayNumber(Locale currentLocale) {
		  
		    Integer quantity = 123456;
		    Double amount = 345987.246;
		    String quantityOut;
		    String amountOut;
		     
		    NumberFormat numberFormatter;
		    
		    numberFormatter = NumberFormat.getNumberInstance(currentLocale);
		    
		    System.out.println(currentLocale.getDisplayName());
		    quantityOut = numberFormatter.format(quantity);
		    amountOut = numberFormatter.format(amount);
		    
		    
		    System.out.println(quantityOut + "   " + currentLocale.toString());
		    System.out.println(amountOut + "   " + currentLocale.toString());
		  }
	 
	 
	 
	 static public void displayCurrency(Locale currentLocale) {
		    
		    Double currencyAmount = 9876543.21;
		    
	  
		    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		   
		    
		    System.out.println(currentLocale.getDisplayName());
		    System.out.println(currencyFormatter.format(currencyAmount)); 
		    
		    
			Currency currentCurrency = Currency.getInstance(currentLocale);
		    System.out.println(currentCurrency.getDisplayName());
		    
		    
		        
		  }

}

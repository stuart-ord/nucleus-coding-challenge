package bitcoin;

// Imported packages
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class PortfolioPerformance {
	// Main function for testing purposes
	// Used to execute code
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Declare PortfolioPerformance
    	// Console log for testing desired output
		PortfolioPerformance p = new PortfolioPerformance();
    	System.out.print(p.getDailyPortfolioValues());
	}
	
	// Static list of prices
    private static final List<Price> PRICES = List.of(
            new Price(LocalDateTime.of(2021, Month.SEPTEMBER, 1, 5, 0, 0), new BigDecimal("35464.53")),
            new Price(LocalDateTime.of(2021, Month.SEPTEMBER, 2, 5, 0, 0), new BigDecimal("35658.76")),
            new Price(LocalDateTime.of(2021, Month.SEPTEMBER, 3, 5, 0, 0), new BigDecimal("36080.06")),
            new Price(LocalDateTime.of(2021, Month.SEPTEMBER, 3, 13, 0, 0), new BigDecimal("37111.11")),
            new Price(LocalDateTime.of(2021, Month.SEPTEMBER, 6, 5, 0, 0), new BigDecimal("38041.47")),
            new Price(LocalDateTime.of(2021, Month.SEPTEMBER, 7, 5, 0, 0), new BigDecimal("34029.61")));

    // Static list of transactions
    private static final List<Transaction> TRANSACTIONS = List.of(
            new Transaction(LocalDateTime.of(2021, Month.SEPTEMBER, 1, 9, 0, 0), new BigDecimal("0.012")),
            new Transaction(LocalDateTime.of(2021, Month.SEPTEMBER, 1, 15, 0, 0), new BigDecimal("-0.007")),
            new Transaction(LocalDateTime.of(2021, Month.SEPTEMBER, 4, 9, 0, 0), new BigDecimal("0.017")),
            new Transaction(LocalDateTime.of(2021, Month.SEPTEMBER, 5, 9, 0, 0), new BigDecimal("-0.01")),
            new Transaction(LocalDateTime.of(2021, Month.SEPTEMBER, 7, 9, 0, 0), new BigDecimal("0.1")));

    // Return a list of daily portfolio values with one record for each day
    // From the 01-09-2021 to the 07-09-2021
    public static List<DailyPortfolioValue> getDailyPortfolioValues() {
        // Declaring variables
    	LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 1);
    	LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 7);
    	BigDecimal noOfBitcoin = new BigDecimal("0");
    	BigDecimal currentPrice = new BigDecimal("0");
    	BigDecimal portfolioValue = new BigDecimal("0");  
    	List<DailyPortfolioValue> dailyPortfolioValues = new ArrayList<DailyPortfolioValue>();
    	
        // For loop for the date range
    	// endDate plusDays(1) to iterate including endDate
    	for (LocalDate d = startDate; d.isBefore(endDate.plusDays(1)); d = d.plusDays(1)) {
    		// Iterate through list of transactions
    		// Identifying transactions for  date and adding to noOfBitcoin
    		// Total noOfBitcoin for the date
    		
    		// Iterate through list of prices 
    		// Get price for relevant date needed for portfolioValue
    	
        	// Calculate portfolio value (no of units * fund price) 
    		// Assume 3 decimal places as max used
    		portfolioValue = noOfBitcoin.multiply(currentPrice);
    		portfolioValue.setScale(3, RoundingMode.HALF_UP);
    		
    		// Add date and portfolio value

    	}
    	
        // Output list of daily portfolio values    	
    	return dailyPortfolioValues;   	
    }
}
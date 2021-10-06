package bitcoin;

// Imported packages
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class PortfolioPerformance {
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
    	BigDecimal portfolioValue = new BigDecimal("0");  
    	BigDecimal currentPrice = new BigDecimal("0");
    	List<DailyPortfolioValue> dailyPortfolioValues = new ArrayList<DailyPortfolioValue>();
    	
        // For loop for the date range
    	// endDate plus 1 to iterate endDate inclusive
    	for (LocalDate d = startDate; d.isBefore(endDate.plusDays(1)); d = d.plusDays(1)) {
    		
    	}
    	
    	// Console log for testing desired output
    	System.out.print(dailyPortfolioValues);
    	
        // Output list of daily portfolio values    	
    	return dailyPortfolioValues;
    }
}

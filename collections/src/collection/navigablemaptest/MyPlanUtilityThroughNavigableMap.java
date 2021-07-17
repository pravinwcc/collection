package collection.navigablemaptest;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;


public class MyPlanUtilityThroughNavigableMap {

	// NavigableMap have 2 implementation classes TreeMap and ConcurrentSkipListMap 
	public static NavigableMap<Range, Validity> validityMap = new TreeMap<Range, Validity>();

	public static NavigableMap<Range, ExchangeRate> exchangeRateMap = new TreeMap<Range, ExchangeRate>();
	
	
	//public static NavigableMap<Range, Validity> validityMap = new ConcurrentSkipListMap <Range, Validity>();

	//public static NavigableMap<Range, ExchangeRate> exchangeRateMap = new ConcurrentSkipListMap<Range, ExchangeRate>();


	public static void putValidity(Range r, Validity v) {
		validityMap.put(r, v);
	}

	public static void putExchangeRate(Range r, ExchangeRate ex) {
		exchangeRateMap.put(r, ex);
	}

	public static Validity getPlanValidity(long totalAmount) {

		Range rr = new Range();
		rr.setStartRange(totalAmount);
		rr.setEndRange(totalAmount);

		return validityMap.get(validityMap.ceilingKey(rr));

	}

	public static double getPlanCost(long onnet,long offnet, long data,long sms) {

		
		double todatlAmount=0.0;
		Range onnetRange= new Range();onnetRange.setEndRange(onnet);
		Range offnetRange= new Range();offnetRange.setEndRange(offnet);
		Range dataRange= new Range();dataRange.setEndRange(data);
		Range smsRange= new Range();smsRange.setEndRange(sms);
		
		todatlAmount=todatlAmount+onnet*exchangeRateMap.get(exchangeRateMap.ceilingKey(onnetRange)).getOnnet();
		todatlAmount=todatlAmount+offnet*exchangeRateMap.get(exchangeRateMap.ceilingKey(offnetRange)).getOffnet();
		todatlAmount=todatlAmount+data*exchangeRateMap.get(exchangeRateMap.ceilingKey(dataRange)).getData();
		todatlAmount=todatlAmount+sms*exchangeRateMap.get(exchangeRateMap.ceilingKey(smsRange)).getSms();
		
		return todatlAmount;
	
	}
}

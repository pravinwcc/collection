package collection.navigablemaptest;


public class TestMyPlannavigableMap {

	public static void main(String[] args) {

		Validity v1=new Validity();
		Validity v2=new Validity();
		Validity v3=new Validity();
		Validity v4=new Validity();
		v1.setDays(2);
		v2.setDays(7);
		v3.setDays(15);
		v4.setDays(30);
		
		Range r1= new Range();
		Range r2= new Range();
		Range r3= new Range();
		Range r4= new Range();
		r1.setStartRange(1);
		r1.setEndRange(89);
		
		r2.setStartRange(90);
		r2.setEndRange(1999);
		
		r3.setStartRange(2000);
		r3.setEndRange(49999);
		
		r4.setStartRange(50000);
		r4.setEndRange(90000000);
		
		MyPlanUtilityThroughNavigableMap.putValidity(r1, v1);
		MyPlanUtilityThroughNavigableMap.putValidity(r2, v2);
		MyPlanUtilityThroughNavigableMap.putValidity(r3, v3);
		MyPlanUtilityThroughNavigableMap.putValidity(r4, v4);
		
		/////////////////////////////////////
		Range r11= new Range();
		Range r22= new Range();
		Range r33= new Range();
		Range r44= new Range();
		
		ExchangeRate exr1= new ExchangeRate();
		ExchangeRate exr2= new ExchangeRate();
		ExchangeRate exr3= new ExchangeRate();
		ExchangeRate exr4= new ExchangeRate();
		
		r11.setStartRange(1);
		r11.setEndRange(9);
		
		r22.setStartRange(10);
		r22.setEndRange(49);
		
		r33.setStartRange(50);
		r33.setEndRange(99);
		
		r44.setStartRange(100);
		r44.setEndRange(499);
				
		exr1.setOnnet(40);
		exr1.setOffnet(60);
		exr1.setData(2.44);
		exr1.setSms(15);
		exr1.setOfferIDForRates(10);
		
		exr2.setOnnet(40);
		exr2.setOffnet(55);
		exr2.setData(2.21);
		exr2.setSms(13);
		exr2.setOfferIDForRates(11);
		
		exr3.setOnnet(35);
		exr3.setOffnet(55);
		exr3.setData(2.01);
		exr3.setSms(12);
		exr3.setOfferIDForRates(12);
		
		exr4.setOnnet(32);
		exr4.setOffnet(50);
		exr4.setData(1.83);
		exr4.setSms(10);
		exr4.setOfferIDForRates(13);
		
		
		MyPlanUtilityThroughNavigableMap.putExchangeRate(r11, exr1);
		MyPlanUtilityThroughNavigableMap.putExchangeRate(r22, exr2);
		MyPlanUtilityThroughNavigableMap.putExchangeRate(r33, exr3);
		MyPlanUtilityThroughNavigableMap.putExchangeRate(r44, exr4);
		
		ExchangeRate rr=new ExchangeRate();
		rr.setOnnet(9);
		rr.setOffnet(49);
		rr.setData(99);
		rr.setSms(499);
		
		//System.out.println(MyPlanUtilityThroughNavigableMap.getPlanCost(9,49,99,499));
		
		
		System.out.println(MyPlanUtilityThroughNavigableMap.getPlanValidity(90).getDays());
		
	}

}

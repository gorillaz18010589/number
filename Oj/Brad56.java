package c;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

//java.time.LocalDate :本地時間
//java.time.LocalDate=> now():取得本地德系統時間
//java.time.LocalDateTime => 
//static LocalDate	of(int year, int month, int dayOfMonth)
//isLeapYear():是否是閏年 (回傳LocalDate)
//isBefore(now):比較月份誰比較早(回傳LocalDate)
//java.time.temporal.ChronoUnit =>between(Temporal temporal1Inclusive, Temporal temporal2Exclusive):兩個日期的時間差,用天數表現,回傳(long)
//java.time.Period =>between(LocalDate startDateInclusive, LocalDate endDateExclusive) :(回傳static Period)	

public class Brad56 {

	public static void main(String[] args) {
	LocalDate now = LocalDate.now();//顯示2019-06-29
	System.out.println(now); 
	
	LocalDate birthday = LocalDate.of(1990, 4, 5); //設定你要的年月日
	System.out.println(birthday.isLeapYear()); //是否是閏年
	System.out.println(birthday.isBefore(now)); //比較誰比較早
	System.out.println(now.getDayOfMonth()); //抓到今天幾號
	       LocalDate m3plus  = now.plusMonths(1); //新曾月份(幾月) 回傳值( LocalDate)
	       System.out.println(m3plus);
	       
	  LocalDate n5 =  now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); //新增相對條件新增下星期五,往今天開始找下一個星期五
	    System.out.println(n5);
	    
	   long days =ChronoUnit.DAYS.between(birthday, now); //兩個日期的時間差,用天數表現
	   System.out.println(days);
	   
	   //專案期限時間
	   
	   LocalDate deadline = LocalDate.of(2019,8, 1);
	   	Period period	=Period.between(now, deadline);
	   	System.out.println(period.getMonths()+"月" + period.getDays()+"天");
	} 

}

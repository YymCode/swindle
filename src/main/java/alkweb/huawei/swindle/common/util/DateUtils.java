package alkweb.huawei.swindle.common.util;



import java.io.Serializable;
import java.util.Calendar;


public class DateUtils implements Serializable {
	/**
	 * 获取传入日期所在周的周一（周一到周日为一周）
	 * @param inputday 传入的日期 格式：2018-12-12
	 * @return 周一的日期 格式：20181210 
	 */
    public static String getWeekMonday(String inputday){
    	Calendar now = Calendar.getInstance();
		int tyear = Integer.parseInt(inputday.substring(0, 4));
		int tmonth = Integer.parseInt(inputday.substring(5, 6).equals("0")?inputday.substring(6, 7):inputday.substring(5, 7))-1;
		int tday = Integer.parseInt(inputday.substring(8, 9).equals("0")?inputday.substring(9, 10):inputday.substring(8,10));
		now.set(tyear, tmonth, tday);
		
		int week = now.get(Calendar.DAY_OF_WEEK)-1;
		
		Calendar weekFirst = now;
		weekFirst.add(Calendar.DAY_OF_MONTH, week==0?-6:1-week);
		
		int weekF = weekFirst.get(Calendar.DAY_OF_WEEK)-1;
		
		int yearF = weekFirst.get(Calendar.YEAR);
		int monthF = weekFirst.get(Calendar.MONTH)+1;
		int dayF = weekFirst.get(Calendar.DAY_OF_MONTH);
		String rs = ""+yearF;
		if(monthF<10) {
			rs+="0"+monthF;
		}else {
			rs+=monthF;
		}
		if(dayF<10) {
			rs+="0"+dayF;
		}else {
			rs+=dayF;
		}
    	return rs;
    }
    
    /**
	 * 获取传入日期所在周的周日（周一到周日为一周）
	 * @param inputday 传入的日期 格式：2018-12-12
	 * @return 周日的日期 格式：20181216 
	 */
    public static String getWeekSunday(String inputday){
    	Calendar now = Calendar.getInstance();
		int tyear = Integer.parseInt(inputday.substring(0, 4));
		int tmonth = Integer.parseInt(inputday.substring(5, 6).equals("0")?inputday.substring(6, 7):inputday.substring(5, 7))-1;
		int tday = Integer.parseInt(inputday.substring(8, 9).equals("0")?inputday.substring(9, 10):inputday.substring(8,10));
		now.set(tyear, tmonth, tday);
		
		int week = now.get(Calendar.DAY_OF_WEEK)-1;
		Calendar weekEnd = now;
		weekEnd.add(Calendar.DAY_OF_MONTH, week==0?0:7-week);
		int weekE = weekEnd.get(Calendar.DAY_OF_WEEK)-1;
		
		int yearE = weekEnd.get(Calendar.YEAR);
		int monthE = weekEnd.get(Calendar.MONTH)+1;
		int dayE = weekEnd.get(Calendar.DAY_OF_MONTH);
		String rs = ""+yearE;
		if(monthE<10) {
			rs+="0"+monthE;
		}else {
			rs+=monthE;
		}
		if(dayE<10) {
			rs+="0"+dayE;
		}else {
			rs+=dayE;
		}
    	return rs;
    }
}

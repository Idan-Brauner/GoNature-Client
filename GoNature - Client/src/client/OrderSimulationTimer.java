//package client;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.Timer;
//import java.util.TimerTask;
//
//
//
//public class OrderSimulationTimer extends TimerTask implements Runnable{
//		
//		public static String system_date_init;
//		public static String system_time_init;
//	 	public static DateTimeFormatter mySystemTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
//	 	public static LocalDateTime t;
//	 	public static DateTimeFormatter calcFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
//		
//	 	public static int i=0;
//		public static String[] temp_time;
//		public static String system_date;
//		public static String system_time;
//		public static LocalDateTime calcTime;
//
//	
//	
//    @Override
//    public void run() {
//
//    	//outputs
//    //	System.out.println(system_date+"\n"+system_time);
//
//    	LocalDateTime min_forward=calcTime.plusMinutes(30);
//    	calcTime=min_forward;
//    	system_date=String.valueOf(calcTime.toLocalDate());
//    	system_time=String.valueOf(calcTime.toLocalTime());
//    	}
//
//    
// public static void runTime(String localDate, String hour){
//	 	system_date_init=localDate;
//		system_time_init=hour;
//		t=  LocalDateTime.of(LocalDate.parse(system_date_init),LocalTime.parse(system_time_init));
//		temp_time = t.format(calcFormatter).toString().split(" ");
//		system_date=localDate;
//		system_time=hour;
//		calcTime=LocalDateTime.of(LocalDate.parse(system_date),LocalTime.parse(system_time));
//        TimerTask timerTask = new OrderSimulationTimer();
//        Timer timer = new Timer(true);
//        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
//        System.out.println("TimerTask started");
//
//    
//	
//
//}
//
//}
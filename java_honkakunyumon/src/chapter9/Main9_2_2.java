package chapter9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main9_2_2 {
	LocalDate date = LocalDate.now();
	System.out.println(date);

	//時刻
	LocalTime time = LocalTime.now();
	System.out.println(time);

	//日時
	LocalDateTime dateTime = LocalDateTime.now();

	System.out.println(dateTime);


}

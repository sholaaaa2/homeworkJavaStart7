package com.gmail.kukaruka52;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String text = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("dd.mm.yyyy");
		text = sc.nextLine();

		Date nowDate = new Date();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
		try {
			date = sdf.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (date.getMonth() != nowDate.getMonth()) {
			SimpleDateFormat mon = new SimpleDateFormat("MMMM");

			System.out.println("Your month: " + mon.format(date));
			System.out.println("Now month: " + mon.format(nowDate));
		}
		if (date.getYear() != nowDate.getYear()) {
			SimpleDateFormat year = new SimpleDateFormat("yyyy");

			System.out.println("Your year: " + year.format(date));
			System.out.println("Now year: " + year.format(nowDate));
		}
	}

}

package com.itcast.DemoCollection;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Demo {
	private static final double advert = 0.40;
	private static final double integral = 0.50;
	private static final double redEnvelopes = 0.10;

	public static void main(String[] args) {
		Date date = new Date(new Date().getTime() - 60 * 60 * 24 * 1000);
		String dateStr = new SimpleDateFormat("yyyyMMdd").format(date);
		System.out.println(dateStr); 
		System.out.println();
	}

	private static int PercentageRandom() {
		double randomNumber;
		randomNumber = Math.random();
		if (randomNumber >= 0 && randomNumber <= advert) {
			// 返回广告数据
			return 1;
		} else if (randomNumber >= advert / 100 && randomNumber <= advert + integral) {
			// 返回积分数据
			return 2;
		} else if (randomNumber >= advert + integral && randomNumber <= advert + integral + redEnvelopes) {
			// 返回红包数据
			return 3;
		}
		return -1;
	}
}

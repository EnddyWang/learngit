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
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(60/10000);
	}

	private static int PercentageRandom() {
		double randomNumber;
		randomNumber = Math.random();
		if (randomNumber >= 0 && randomNumber <= advert) {
			// ���ع������
			return 1;
		} else if (randomNumber >= advert / 100 && randomNumber <= advert + integral) {
			// ���ػ�������
			return 2;
		} else if (randomNumber >= advert + integral && randomNumber <= advert + integral + redEnvelopes) {
			// ���غ������
			return 3;
		}
		return -1;
	}
}

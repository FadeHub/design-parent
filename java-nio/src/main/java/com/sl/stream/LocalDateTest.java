package com.sl.stream;

import java.time.*;
import java.util.Date;

/**
 * @author shuliangzhao
 * @Title: LocalDateTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/9/1 14:17
 */
public class LocalDateTest {
    public static void main(String[] args) {
        Period tenDays = Period.between(LocalDate.of(2014, 3, 8),
                LocalDate.of(2014, 3, 18));
        System.out.println(tenDays.getChronology());

        LocalDateTime dt1 = LocalDateTime.of(2019, 9, 1, 15, 45, 20);
        LocalDate date = LocalDate.now();
        LocalTime date1 = LocalTime.now();
        LocalDateTime dt3 = date.atTime(15, 45, 20);
        LocalDateTime dt5 = date1.atDate(date);
        Instant instant = Instant.ofEpochSecond(3);
        Instant.ofEpochSecond(3,-1000000);
        dateToCoverLocadate();
        LocaldateToCoverDate();
    }


    public static void dateToCoverLocadate() {
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);
    }                       


    public static void LocaldateToCoverDate() {
        LocalDateTime now = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = now.atZone(zoneId).toInstant();
        Date from = Date.from(instant);
        System.out.println(from);
    }
}

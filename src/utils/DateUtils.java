package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final String DATE_PATTERN = "dd-MM-yyyy";

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
        return sdf.format(date);
    }

    public static Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat(DATE_PATTERN).parse(dateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Use dd-MM-yyyy.");
            return null;
        }
    }

    public static boolean isPast(Date date) {
        return date.before(new Date());
    }
}

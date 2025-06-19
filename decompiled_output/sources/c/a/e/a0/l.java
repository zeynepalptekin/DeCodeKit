package c.a.e.a0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public class l {
    private static String a(int r3) {
        if (r3 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (r3 == 1) {
            return "MMMM d, y";
        }
        if (r3 == 2) {
            return "MMM d, y";
        }
        if (r3 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + r3);
    }

    private static String b(int r3) {
        if (r3 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (r3 == 1) {
            return "MMMM d, yyyy";
        }
        if (r3 == 2) {
            return "MMM d, yyyy";
        }
        if (r3 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + r3);
    }

    private static String c(int r3) {
        if (r3 == 0 || r3 == 1) {
            return "h:mm:ss a z";
        }
        if (r3 == 2) {
            return "h:mm:ss a";
        }
        if (r3 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + r3);
    }

    public static DateFormat d(int r2) {
        return new SimpleDateFormat(a(r2), Locale.US);
    }

    public static DateFormat e(int r1, int r2) {
        return new SimpleDateFormat(b(r1) + " " + c(r2), Locale.US);
    }
}

package c.a.e.a0.p.o;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2292a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    private static final TimeZone f2293b = TimeZone.getTimeZone(f2292a);

    private static boolean a(String str, int r2, char c2) {
        return r2 < str.length() && str.charAt(r2) == c2;
    }

    public static String b(Date date) {
        return d(date, false, f2293b);
    }

    public static String c(Date date, boolean z) {
        return d(date, z, f2293b);
    }

    public static String d(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        f(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        f(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        f(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            f(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int r8 = offset / 60000;
            int r0 = Math.abs(r8 / 60);
            int r82 = Math.abs(r8 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            f(sb, r0, 2);
            sb.append(':');
            f(sb, r82, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int e(String str, int r3) {
        while (r3 < str.length()) {
            char cCharAt = str.charAt(r3);
            if (cCharAt < '0' || cCharAt > '9') {
                return r3;
            }
            r3++;
        }
        return str.length();
    }

    private static void f(StringBuilder sb, int r2, int r3) {
        String string = Integer.toString(r2);
        for (int length = r3 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x0183, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:60:0x0107, B:77:0x01b4, B:78:0x01bb, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x0183, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:60:0x0107, B:77:0x01b4, B:78:0x01bb, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date g(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.a0.p.o.a.g(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int h(String str, int r6, int r7) throws NumberFormatException {
        int r0;
        int r3;
        if (r6 < 0 || r7 > str.length() || r6 > r7) {
            throw new NumberFormatException(str);
        }
        if (r6 < r7) {
            r0 = r6 + 1;
            int r32 = Character.digit(str.charAt(r6), 10);
            if (r32 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(r6, r7));
            }
            r3 = -r32;
        } else {
            r0 = r6;
            r3 = 0;
        }
        while (r0 < r7) {
            int r4 = r0 + 1;
            int r02 = Character.digit(str.charAt(r0), 10);
            if (r02 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(r6, r7));
            }
            r3 = (r3 * 10) - r02;
            r0 = r4;
        }
        return -r3;
    }
}

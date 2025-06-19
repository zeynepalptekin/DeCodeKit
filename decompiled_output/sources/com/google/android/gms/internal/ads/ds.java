package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class ds {
    @androidx.annotation.i0
    public static un2 a(fz2 fz2Var) throws NumberFormatException {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = fz2Var.f3479c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jC = str != null ? c(str) : 0L;
        String str2 = map.get("Cache-Control");
        int r11 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int r12 = 0;
            j = 0;
            j2 = 0;
            while (r11 < strArrSplit.length) {
                String strTrim = strArrSplit[r11].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    r12 = 1;
                }
                r11++;
            }
            r11 = r12;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long jC2 = str3 != null ? c(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jC3 = str4 != null ? c(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j4 = jCurrentTimeMillis + (j * 1000);
            if (r11 != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (jC <= 0 || jC2 < jC) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jC2 - jC);
                j3 = j4;
            }
        }
        un2 un2Var = new un2();
        un2Var.f5560a = fz2Var.f3478b;
        un2Var.f5561b = str5;
        un2Var.f = j4;
        un2Var.e = j3;
        un2Var.f5562c = jC;
        un2Var.d = jC3;
        un2Var.g = map;
        un2Var.h = fz2Var.d;
        return un2Var;
    }

    static String b(long j) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static long c(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                qf.c("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            qf.e(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}

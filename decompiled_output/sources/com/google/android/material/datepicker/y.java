package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.b.c.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    static final String f6682a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    static AtomicReference<x> f6683b = new AtomicReference<>();

    private y() {
    }

    private static SimpleDateFormat A(Locale locale) {
        return o("LLLL, yyyy", locale);
    }

    @h0
    private static String B(@h0 String str) {
        int r0 = b(str, "yY", 1, 0);
        if (r0 >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int r3 = b(str, "EMd", 1, r0);
        if (r3 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, r0) + 1, r3), " ").trim();
    }

    static void C(@i0 x xVar) {
        f6683b.set(xVar);
    }

    static long a(long j) {
        Calendar calendarV = v();
        calendarV.setTimeInMillis(j);
        return f(calendarV).getTimeInMillis();
    }

    private static int b(@h0 String str, @h0 String str2, int r4, int r5) {
        while (r5 >= 0 && r5 < str.length() && str2.indexOf(str.charAt(r5)) == -1) {
            if (str.charAt(r5) == '\'') {
                do {
                    r5 += r4;
                    if (r5 < 0 || r5 >= str.length()) {
                        break;
                    }
                } while (str.charAt(r5) != '\'');
            }
            r5 += r4;
        }
        return r5;
    }

    @TargetApi(24)
    static DateFormat c(Locale locale) {
        return e("MMMd", locale);
    }

    @TargetApi(24)
    static DateFormat d(Locale locale) {
        return e("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(u());
        return instanceForSkeleton;
    }

    static Calendar f(Calendar calendar) {
        Calendar calendarW = w(calendar);
        Calendar calendarV = v();
        calendarV.set(calendarW.get(1), calendarW.get(2), calendarW.get(5));
        return calendarV;
    }

    private static java.text.DateFormat g(int r0, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(r0, locale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }

    static java.text.DateFormat h() {
        return i(Locale.getDefault());
    }

    static java.text.DateFormat i(Locale locale) {
        return g(0, locale);
    }

    static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    static java.text.DateFormat k(Locale locale) {
        return g(2, locale);
    }

    static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    static java.text.DateFormat m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) k(locale);
        simpleDateFormat.applyPattern(B(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static SimpleDateFormat n(String str) {
        return o(str, Locale.getDefault());
    }

    private static SimpleDateFormat o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }

    static SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String q(Resources resources, SimpleDateFormat simpleDateFormat) throws Resources.NotFoundException {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll("d", resources.getString(a.m.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(a.m.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(a.m.mtrl_picker_text_input_year_abbr));
    }

    static x r() {
        x xVar = f6683b.get();
        return xVar == null ? x.e() : xVar;
    }

    private static TimeZone s() {
        return TimeZone.getTimeZone(f6682a);
    }

    static Calendar t() {
        Calendar calendarC = r().c();
        calendarC.set(11, 0);
        calendarC.set(12, 0);
        calendarC.set(13, 0);
        calendarC.set(14, 0);
        calendarC.setTimeZone(s());
        return calendarC;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone(f6682a);
    }

    static Calendar v() {
        return w(null);
    }

    static Calendar w(@i0 Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(s());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    static DateFormat x(Locale locale) {
        return e("yMMMd", locale);
    }

    @TargetApi(24)
    static DateFormat y(Locale locale) {
        return e("yMMMEd", locale);
    }

    static SimpleDateFormat z() {
        return A(Locale.getDefault());
    }
}

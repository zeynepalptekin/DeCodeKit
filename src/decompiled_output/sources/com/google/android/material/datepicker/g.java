package com.google.android.material.datepicker;

import android.os.Build;
import androidx.annotation.i0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
class g {
    private g() {
    }

    static b.i.o.f<String, String> a(@i0 Long l, @i0 Long l2) {
        return b(l, l2, null);
    }

    static b.i.o.f<String, String> b(@i0 Long l, @i0 Long l2, @i0 SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return b.i.o.f.a(null, null);
        }
        if (l == null) {
            return b.i.o.f.a(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return b.i.o.f.a(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar calendarT = y.t();
        Calendar calendarV = y.v();
        calendarV.setTimeInMillis(l.longValue());
        Calendar calendarV2 = y.v();
        calendarV2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return b.i.o.f.a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        }
        return calendarV.get(1) == calendarV2.get(1) ? calendarV.get(1) == calendarT.get(1) ? b.i.o.f.a(f(l.longValue(), Locale.getDefault()), f(l2.longValue(), Locale.getDefault())) : b.i.o.f.a(f(l.longValue(), Locale.getDefault()), j(l2.longValue(), Locale.getDefault())) : b.i.o.f.a(j(l.longValue(), Locale.getDefault()), j(l2.longValue(), Locale.getDefault()));
    }

    static String c(long j) {
        return d(j, null);
    }

    static String d(long j, @i0 SimpleDateFormat simpleDateFormat) {
        Calendar calendarT = y.t();
        Calendar calendarV = y.v();
        calendarV.setTimeInMillis(j);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : calendarT.get(1) == calendarV.get(1) ? e(j) : i(j);
    }

    static String e(long j) {
        return f(j, Locale.getDefault());
    }

    static String f(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? y.c(locale).format(new Date(j)) : y.m(locale).format(new Date(j));
    }

    static String g(long j) {
        return h(j, Locale.getDefault());
    }

    static String h(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? y.d(locale).format(new Date(j)) : y.i(locale).format(new Date(j));
    }

    static String i(long j) {
        return j(j, Locale.getDefault());
    }

    static String j(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? y.x(locale).format(new Date(j)) : y.k(locale).format(new Date(j));
    }

    static String k(long j) {
        return l(j, Locale.getDefault());
    }

    static String l(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? y.y(locale).format(new Date(j)) : y.i(locale).format(new Date(j));
    }
}

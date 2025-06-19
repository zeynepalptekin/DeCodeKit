package com.google.android.material.datepicker;

import androidx.annotation.i0;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
class x {

    /* renamed from: c, reason: collision with root package name */
    private static final x f6679c = new x(null, null);

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final Long f6680a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    private final TimeZone f6681b;

    private x(@i0 Long l, @i0 TimeZone timeZone) {
        this.f6680a = l;
        this.f6681b = timeZone;
    }

    static x a(long j) {
        return new x(Long.valueOf(j), null);
    }

    static x b(long j, @i0 TimeZone timeZone) {
        return new x(Long.valueOf(j), timeZone);
    }

    static x e() {
        return f6679c;
    }

    Calendar c() {
        return d(this.f6681b);
    }

    Calendar d(@i0 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f6680a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}

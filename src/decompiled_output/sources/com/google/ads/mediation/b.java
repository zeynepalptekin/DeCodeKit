package com.google.ads.mediation;

import android.location.Location;
import c.a.a.a;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Date f2320a;

    /* renamed from: b, reason: collision with root package name */
    private final a.b f2321b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f2322c;
    private final boolean d;
    private final Location e;

    public b(Date date, a.b bVar, Set<String> set, boolean z, Location location) {
        this.f2320a = date;
        this.f2321b = bVar;
        this.f2322c = set;
        this.d = z;
        this.e = location;
    }

    public Integer a() {
        if (this.f2320a == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(this.f2320a);
        Integer numValueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
        return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(numValueOf.intValue() - 1) : numValueOf;
    }

    public Date b() {
        return this.f2320a;
    }

    public a.b c() {
        return this.f2321b;
    }

    public Set<String> d() {
        return this.f2322c;
    }

    public Location e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}

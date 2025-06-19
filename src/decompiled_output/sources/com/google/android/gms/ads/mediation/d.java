package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.i0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class d {
    public static final int k = 1;
    public static final int l = 0;
    public static final int m = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f2451a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f2452b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f2453c;
    private final Context d;
    private final boolean e;
    private final Location f;
    private final int g;
    private final int h;
    private final String i;
    private final String j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public d(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @i0 Location location, int r7, int r8, @i0 String str2, String str3) {
        this.f2451a = str;
        this.f2452b = bundle;
        this.f2453c = bundle2;
        this.d = context;
        this.e = z;
        this.f = location;
        this.g = r7;
        this.h = r8;
        this.i = str2;
        this.j = str3;
    }

    public String a() {
        return this.f2451a;
    }

    public Context b() {
        return this.d;
    }

    public Location c() {
        return this.f;
    }

    @i0
    public String d() {
        return this.i;
    }

    public Bundle e() {
        return this.f2453c;
    }

    public Bundle f() {
        return this.f2452b;
    }

    public String g() {
        return this.j;
    }

    public boolean h() {
        return this.e;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }
}

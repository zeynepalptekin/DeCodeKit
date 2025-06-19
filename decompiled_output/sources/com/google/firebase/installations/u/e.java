package com.google.firebase.installations.u;

import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.c.a.c;
import com.google.firebase.installations.u.b;

@c.a.c.a.c
/* loaded from: classes.dex */
public abstract class e {

    @c.a
    public static abstract class a {
        @h0
        public abstract e a();

        @h0
        public abstract a b(@h0 b bVar);

        @h0
        public abstract a c(@h0 String str);

        @h0
        public abstract a d(long j);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @h0
    public static a a() {
        return new b.C0211b().d(0L);
    }

    @i0
    public abstract b b();

    @i0
    public abstract String c();

    @h0
    public abstract long d();

    @h0
    public abstract a e();
}

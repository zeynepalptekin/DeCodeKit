package com.google.firebase.installations.u;

import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.c.a.c;
import com.google.firebase.installations.u.a;

@c.a.c.a.c
/* loaded from: classes.dex */
public abstract class d {

    @c.a
    public static abstract class a {
        @h0
        public abstract d a();

        @h0
        public abstract a b(@h0 e eVar);

        @h0
        public abstract a c(@h0 String str);

        @h0
        public abstract a d(@h0 String str);

        @h0
        public abstract a e(@h0 b bVar);

        @h0
        public abstract a f(@h0 String str);
    }

    public enum b {
        OK,
        BAD_CONFIG
    }

    @h0
    public static a a() {
        return new a.b();
    }

    @i0
    public abstract e b();

    @i0
    public abstract String c();

    @i0
    public abstract String d();

    @i0
    public abstract b e();

    @i0
    public abstract String f();

    @h0
    public abstract a g();
}

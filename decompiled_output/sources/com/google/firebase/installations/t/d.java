package com.google.firebase.installations.t;

import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.c.a.c;
import com.google.firebase.installations.t.a;
import com.google.firebase.installations.t.c;

@c.a.c.a.c
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @h0
    public static d f6989a = a().a();

    @c.a
    public static abstract class a {
        @h0
        public abstract d a();

        @h0
        public abstract a b(@i0 String str);

        @h0
        public abstract a c(long j);

        @h0
        public abstract a d(@h0 String str);

        @h0
        public abstract a e(@i0 String str);

        @h0
        public abstract a f(@i0 String str);

        @h0
        public abstract a g(@h0 c.a aVar);

        @h0
        public abstract a h(long j);
    }

    @h0
    public static a a() {
        return new a.b().h(0L).g(c.a.ATTEMPT_MIGRATION).c(0L);
    }

    @i0
    public abstract String b();

    public abstract long c();

    @i0
    public abstract String d();

    @i0
    public abstract String e();

    @i0
    public abstract String f();

    @h0
    public abstract c.a g();

    public abstract long h();

    public boolean i() {
        return g() == c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == c.a.NOT_GENERATED || g() == c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == c.a.REGISTERED;
    }

    public boolean l() {
        return g() == c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == c.a.ATTEMPT_MIGRATION;
    }

    @h0
    public abstract a n();

    @h0
    public d o(@h0 String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    @h0
    public d p() {
        return n().b(null).a();
    }

    @h0
    public d q(@h0 String str) {
        return n().e(str).g(c.a.REGISTER_ERROR).a();
    }

    @h0
    public d r() {
        return n().g(c.a.NOT_GENERATED).a();
    }

    @h0
    public d s(@h0 String str, @h0 String str2, long j, @i0 String str3, long j2) {
        return n().d(str).g(c.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    @h0
    public d t(@h0 String str) {
        return n().d(str).g(c.a.UNREGISTERED).a();
    }
}

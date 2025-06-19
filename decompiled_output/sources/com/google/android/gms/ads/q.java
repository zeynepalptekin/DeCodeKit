package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.h0;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.k03;
import com.google.android.gms.internal.ads.o03;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2483a = "com.google.android.gms.ads";

    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final o03 f2484a = new o03();

        @Deprecated
        public final String a() {
            return null;
        }

        @Deprecated
        public final boolean b() {
            return false;
        }

        @Deprecated
        public final a c(boolean z) {
            return this;
        }

        @Deprecated
        public final a d(String str) {
            return this;
        }
    }

    private q() {
    }

    public static void a(Context context) {
        k03.v().a(context);
    }

    public static com.google.android.gms.ads.g0.b b() {
        return k03.v().b();
    }

    @h0
    public static x c() {
        return k03.v().c();
    }

    @Deprecated
    public static com.google.android.gms.ads.k0.c d(Context context) {
        return k03.v().d(context);
    }

    public static String e() {
        return k03.v().e();
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public static void f(Context context) {
        i(context, null, null);
    }

    public static void g(Context context, com.google.android.gms.ads.g0.c cVar) {
        k03.v().m(context, null, cVar);
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    @Deprecated
    public static void h(Context context, String str) {
        i(context, str, null);
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    @Deprecated
    public static void i(Context context, String str, a aVar) {
        k03.v().m(context, str, null);
    }

    public static void j(Context context, String str) {
        k03.v().f(context, str);
    }

    @com.google.android.gms.common.annotation.a
    public static void k(Class<? extends RtbAdapter> cls) {
        k03.v().g(cls);
    }

    public static void l(boolean z) {
        k03.v().h(z);
    }

    public static void m(float f) {
        k03.v().i(f);
    }

    public static void n(@h0 x xVar) {
        k03.v().j(xVar);
    }
}

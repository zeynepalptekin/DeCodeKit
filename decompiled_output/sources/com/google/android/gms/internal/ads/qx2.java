package com.google.android.gms.internal.ads;

import java.util.Random;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qx2 {
    private static qx2 j = new qx2();

    /* renamed from: a, reason: collision with root package name */
    private final jr f5070a;

    /* renamed from: b, reason: collision with root package name */
    private final ax2 f5071b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5072c;
    private final y d;
    private final a0 e;
    private final z f;
    private final as g;
    private final Random h;
    private final WeakHashMap<com.google.android.gms.ads.j0.b, String> i;

    protected qx2() {
        this(new jr(), new ax2(new hw2(), new iw2(), new s03(), new q5(), new fk(), new kl(), new qg(), new p5()), new y(), new a0(), new z(), jr.z(), new as(0, 202510000, true), new Random(), new WeakHashMap());
    }

    private qx2(jr jrVar, ax2 ax2Var, y yVar, a0 a0Var, z zVar, String str, as asVar, Random random, WeakHashMap<com.google.android.gms.ads.j0.b, String> weakHashMap) {
        this.f5070a = jrVar;
        this.f5071b = ax2Var;
        this.d = yVar;
        this.e = a0Var;
        this.f = zVar;
        this.f5072c = str;
        this.g = asVar;
        this.h = random;
        this.i = weakHashMap;
    }

    public static jr a() {
        return j.f5070a;
    }

    public static ax2 b() {
        return j.f5071b;
    }

    public static a0 c() {
        return j.e;
    }

    public static y d() {
        return j.d;
    }

    public static z e() {
        return j.f;
    }

    public static String f() {
        return j.f5072c;
    }

    public static as g() {
        return j.g;
    }

    public static Random h() {
        return j.h;
    }

    public static WeakHashMap<com.google.android.gms.ads.j0.b, String> i() {
        return j.i;
    }
}

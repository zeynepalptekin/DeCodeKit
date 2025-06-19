package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f5203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5204b;

    /* renamed from: c, reason: collision with root package name */
    private final T f5205c;

    private s(int r1, String str, T t) {
        this.f5203a = r1;
        this.f5204b = str;
        this.f5205c = t;
        qx2.d().b(this);
    }

    /* synthetic */ s(int r1, String str, Object obj, r rVar) {
        this(r1, str, obj);
    }

    public static s<Float> c(int r1, String str, float f) {
        return new w(1, str, Float.valueOf(0.0f));
    }

    public static s<Integer> d(int r1, String str, int r3) {
        return new u(1, str, Integer.valueOf(r3));
    }

    public static s<Boolean> e(int r1, String str, Boolean bool) {
        return new r(r1, str, bool);
    }

    public static s<String> f(int r1, String str, String str2) {
        return new v(1, str, str2);
    }

    public static s<String> j(int r1, String str) {
        s<String> sVarF = f(1, str, null);
        qx2.d().d(sVarF);
        return sVarF;
    }

    public static s<Long> k(int r0, String str, long j) {
        return new t(1, str, Long.valueOf(j));
    }

    public final String a() {
        return this.f5204b;
    }

    public final int b() {
        return this.f5203a;
    }

    protected abstract T g(SharedPreferences sharedPreferences);

    public abstract T h(Bundle bundle);

    public abstract void i(SharedPreferences.Editor editor, T t);

    protected abstract T l(JSONObject jSONObject);

    public final T m() {
        return this.f5205c;
    }
}

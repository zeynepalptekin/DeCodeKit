package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class ah2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final String f2689a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final jf2 f2690b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2691c;
    private final String d;
    protected final fm0.a.C0175a e;
    protected Method f;
    private final int g;
    private final int h;

    public ah2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r6, int r7) {
        this.f2690b = jf2Var;
        this.f2691c = str;
        this.d = str2;
        this.e = c0175a;
        this.g = r6;
        this.h = r7;
    }

    protected abstract void a() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        long jNanoTime;
        Method methodE;
        try {
            jNanoTime = System.nanoTime();
            methodE = this.f2690b.e(this.f2691c, this.d);
            this.f = methodE;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodE == null) {
            return null;
        }
        a();
        vs1 vs1VarW = this.f2690b.w();
        if (vs1VarW != null && this.g != Integer.MIN_VALUE) {
            vs1VarW.b(this.h, this.g, (System.nanoTime() - jNanoTime) / 1000);
        }
        return null;
    }
}

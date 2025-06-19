package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.vc0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public class vs1 {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f5729c = new ConditionVariable();

    @androidx.annotation.x0
    protected static volatile yu2 d = null;
    private static volatile Random e = null;

    /* renamed from: a, reason: collision with root package name */
    private jf2 f5730a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.x0
    protected volatile Boolean f5731b;

    public vs1(jf2 jf2Var) {
        this.f5730a = jf2Var;
        jf2Var.r().execute(new ur1(this));
    }

    public static int e() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : f().nextInt();
        } catch (RuntimeException unused) {
            return f().nextInt();
        }
    }

    private static Random f() {
        if (e == null) {
            synchronized (vs1.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public final void b(int r8, int r9, long j) {
        d(r8, r9, j, null, null);
    }

    public final void c(int r8, int r9, long j, String str) {
        d(r8, -1, j, str, null);
    }

    public final void d(int r3, int r4, long j, String str, Exception exc) {
        try {
            f5729c.block();
            if (!this.f5731b.booleanValue() || d == null) {
                return;
            }
            vc0.a.C0186a c0186aW = vc0.a.U().x(this.f5730a.f3958a.getPackageName()).w(j);
            if (str != null) {
                c0186aW.C(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                i72.a(exc, new PrintWriter(stringWriter));
                c0186aW.z(stringWriter.toString()).A(exc.getClass().getName());
            }
            dv2 dv2VarA = d.a(((vc0.a) ((l92) c0186aW.P())).f());
            dv2VarA.b(r3);
            if (r4 != -1) {
                dv2VarA.a(r4);
            }
            dv2VarA.c();
        } catch (Exception unused) {
        }
    }
}

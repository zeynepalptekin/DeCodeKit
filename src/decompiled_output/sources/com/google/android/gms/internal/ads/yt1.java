package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class yt1 {
    private static final HashMap<String, Class<?>> g = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f6173a;

    /* renamed from: b, reason: collision with root package name */
    private final bu1 f6174b;

    /* renamed from: c, reason: collision with root package name */
    private final xr1 f6175c;
    private final vr1 d;

    @androidx.annotation.i0
    private lt1 e;
    private final Object f = new Object();

    public yt1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 bu1 bu1Var, @androidx.annotation.h0 xr1 xr1Var, @androidx.annotation.h0 vr1 vr1Var) {
        this.f6173a = context;
        this.f6174b = bu1Var;
        this.f6175c = xr1Var;
        this.d = vr1Var;
    }

    private final synchronized Class<?> a(@androidx.annotation.h0 ot1 ot1Var) throws zt1 {
        if (ot1Var.b() == null) {
            throw new zt1(4010, "mc");
        }
        String strQ = ot1Var.b().Q();
        Class<?> cls = g.get(strQ);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.d.a(ot1Var.c())) {
                throw new zt1(2026, "VM did not pass signature verification");
            }
            try {
                File fileD = ot1Var.d();
                if (!fileD.exists()) {
                    fileD.mkdirs();
                }
                Class<?> clsLoadClass = new DexClassLoader(ot1Var.c().getAbsolutePath(), fileD.getAbsolutePath(), null, this.f6173a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                g.put(strQ, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zt1(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zt1(2026, e2);
        }
    }

    private final Object b(@androidx.annotation.h0 Class<?> cls, @androidx.annotation.h0 ot1 ot1Var) throws zt1 {
        try {
            return cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f6173a, "msa-r", ot1Var.e(), null, new Bundle(), 2);
        } catch (Exception e) {
            throw new zt1(2004, e);
        }
    }

    @androidx.annotation.i0
    public final as1 c() {
        lt1 lt1Var;
        synchronized (this.f) {
            lt1Var = this.e;
        }
        return lt1Var;
    }

    @androidx.annotation.i0
    public final ot1 d() {
        synchronized (this.f) {
            if (this.e == null) {
                return null;
            }
            return this.e.f();
        }
    }

    public final void e(@androidx.annotation.h0 ot1 ot1Var) throws zt1 {
        int r3;
        Exception exc;
        xr1 xr1Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            lt1 lt1Var = new lt1(b(a(ot1Var), ot1Var), ot1Var, this.f6174b, this.f6175c);
            if (!lt1Var.g()) {
                throw new zt1(4000, "init failed");
            }
            int r9 = lt1Var.h();
            if (r9 != 0) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(r9);
                throw new zt1(4001, sb.toString());
            }
            synchronized (this.f) {
                if (this.e != null) {
                    try {
                        this.e.e();
                    } catch (zt1 e) {
                        this.f6175c.b(e.a(), -1L, e);
                    }
                    this.e = lt1Var;
                } else {
                    this.e = lt1Var;
                }
            }
            this.f6175c.h(b.x.c.a.g.d, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (zt1 e2) {
            xr1 xr1Var2 = this.f6175c;
            r3 = e2.a();
            xr1Var = xr1Var2;
            exc = e2;
            xr1Var.b(r3, System.currentTimeMillis() - jCurrentTimeMillis, exc);
        } catch (Exception e3) {
            r3 = 4010;
            xr1Var = this.f6175c;
            exc = e3;
            xr1Var.b(r3, System.currentTimeMillis() - jCurrentTimeMillis, exc);
        }
    }
}

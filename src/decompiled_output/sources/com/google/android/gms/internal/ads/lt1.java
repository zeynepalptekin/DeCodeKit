package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.fm0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class lt1 implements as1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4303a;

    /* renamed from: b, reason: collision with root package name */
    private final ot1 f4304b;

    /* renamed from: c, reason: collision with root package name */
    private final bu1 f4305c;
    private final xr1 d;

    lt1(@androidx.annotation.h0 Object obj, @androidx.annotation.h0 ot1 ot1Var, @androidx.annotation.h0 bu1 bu1Var, @androidx.annotation.h0 xr1 xr1Var) {
        this.f4303a = obj;
        this.f4304b = ot1Var;
        this.f4305c = bu1Var;
        this.d = xr1Var;
    }

    @androidx.annotation.i0
    private final synchronized byte[] i(Map<String, String> map, Map<String, Object> map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.d.b(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f4303a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f4303a, null, map2);
    }

    @androidx.annotation.i0
    private static String j(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((fm0.f) ((l92) fm0.f.L().v(mt0.DG).w(a82.S(bArr)).P())).f(), 11);
    }

    @Override // com.google.android.gms.internal.ads.as1
    @androidx.annotation.i0
    public final synchronized String a(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> mapB;
        mapB = this.f4305c.b();
        mapB.put("f", "c");
        mapB.put("ctx", context);
        mapB.put("cs", str2);
        mapB.put("aid", null);
        mapB.put("view", view);
        mapB.put("act", activity);
        return j(i(null, mapB));
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final synchronized void b(String str, MotionEvent motionEvent) throws zt1 {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f4303a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f4303a, map);
            this.d.h(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zt1(2005, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.as1
    @androidx.annotation.i0
    public final synchronized String c(Context context, String str) {
        Map<String, Object> mapC;
        mapC = this.f4305c.c();
        mapC.put("f", "q");
        mapC.put("ctx", context);
        mapC.put("aid", null);
        return j(i(null, mapC));
    }

    @Override // com.google.android.gms.internal.ads.as1
    @androidx.annotation.i0
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map<String, Object> mapA;
        mapA = this.f4305c.a();
        mapA.put("f", "v");
        mapA.put("ctx", context);
        mapA.put("aid", null);
        mapA.put("view", view);
        mapA.put("act", activity);
        return j(i(null, mapA));
    }

    public final synchronized void e() throws zt1 {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f4303a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f4303a, new Object[0]);
            this.d.h(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zt1(2003, e);
        }
    }

    final ot1 f() {
        return this.f4304b;
    }

    final synchronized boolean g() throws zt1 {
        try {
        } catch (Exception e) {
            throw new zt1(2001, e);
        }
        return ((Boolean) this.f4303a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f4303a, new Object[0])).booleanValue();
    }

    public final synchronized int h() throws zt1 {
        try {
        } catch (Exception e) {
            throw new zt1(2006, e);
        }
        return ((Integer) this.f4303a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f4303a, new Object[0])).intValue();
    }
}

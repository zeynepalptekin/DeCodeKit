package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class yg2 {
    private static final String h = "yg2";

    /* renamed from: a, reason: collision with root package name */
    private final jf2 f6132a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6133b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6134c;
    private final Class<?>[] f;
    private final int d = 2;
    private volatile Method e = null;
    private CountDownLatch g = new CountDownLatch(1);

    public yg2(jf2 jf2Var, String str, String str2, Class<?>... clsArr) {
        this.f6132a = jf2Var;
        this.f6133b = str;
        this.f6134c = str2;
        this.f = clsArr;
        jf2Var.r().submit(new xg2(this));
    }

    private final String b(byte[] bArr, String str) throws j62, UnsupportedEncodingException {
        return new String(this.f6132a.t().b(bArr, str), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        try {
            try {
                Class clsLoadClass = this.f6132a.s().loadClass(b(this.f6132a.u(), this.f6133b));
                if (clsLoadClass != null) {
                    this.e = clsLoadClass.getMethod(b(this.f6132a.u(), this.f6134c), this.f);
                    Method method = this.e;
                }
            } finally {
                this.g.countDown();
            }
        } catch (j62 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        }
    }

    public final Method d() {
        if (this.e != null) {
            return this.e;
        }
        try {
            if (this.g.await(2L, TimeUnit.SECONDS)) {
                return this.e;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}

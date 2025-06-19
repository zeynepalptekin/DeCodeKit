package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.qf;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b<T> implements Comparable<b<T>> {
    private final qf.a d;
    private final int e;
    private final String f;
    private final int g;
    private final Object h;

    @androidx.annotation.i0
    @androidx.annotation.u("mLock")
    private j7 i;
    private Integer j;
    private f3 k;
    private boolean l;

    @androidx.annotation.u("mLock")
    private boolean m;

    @androidx.annotation.u("mLock")
    private boolean n;
    private boolean o;
    private oc p;

    @androidx.annotation.i0
    private un2 q;

    @androidx.annotation.u("mLock")
    private d1 r;

    public b(int r3, String str, @androidx.annotation.i0 j7 j7Var) {
        Uri uri;
        String host;
        this.d = qf.a.f4997c ? new qf.a() : null;
        this.h = new Object();
        this.l = true;
        int r0 = 0;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = null;
        this.e = r3;
        this.f = str;
        this.i = j7Var;
        this.p = new xq2();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            r0 = host.hashCode();
        }
        this.g = r0;
    }

    public final String A() {
        String str = this.f;
        int r1 = this.e;
        if (r1 == 0 || r1 == -1) {
            return str;
        }
        String string = Integer.toString(r1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    @androidx.annotation.i0
    public final un2 B() {
        return this.q;
    }

    public byte[] E() throws sl2 {
        return null;
    }

    public final boolean G() {
        return this.l;
    }

    public final int H() {
        return this.p.b();
    }

    public final oc I() {
        return this.p;
    }

    public final void J() {
        synchronized (this.h) {
            this.n = true;
        }
    }

    public final boolean M() {
        boolean z;
        synchronized (this.h) {
            z = this.n;
        }
        return z;
    }

    final void N() {
        d1 d1Var;
        synchronized (this.h) {
            d1Var = this.r;
        }
        if (d1Var != null) {
            d1Var.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        b bVar = (b) obj;
        g4 g4Var = g4.NORMAL;
        return g4Var == g4Var ? this.j.intValue() - bVar.j.intValue() : g4Var.ordinal() - g4Var.ordinal();
    }

    public Map<String, String> e() throws sl2 {
        return Collections.emptyMap();
    }

    public final int g() {
        return this.e;
    }

    public final String i() {
        return this.f;
    }

    public final boolean j() {
        synchronized (this.h) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b<?> k(f3 f3Var) {
        this.k = f3Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b<?> m(un2 un2Var) {
        this.q = un2Var;
        return this;
    }

    protected abstract k8<T> n(fz2 fz2Var);

    final void o(d1 d1Var) {
        synchronized (this.h) {
            this.r = d1Var;
        }
    }

    final void p(k8<?> k8Var) {
        d1 d1Var;
        synchronized (this.h) {
            d1Var = this.r;
        }
        if (d1Var != null) {
            d1Var.a(this, k8Var);
        }
    }

    protected abstract void q(T t);

    public final void r(pd pdVar) {
        j7 j7Var;
        synchronized (this.h) {
            j7Var = this.i;
        }
        if (j7Var != null) {
            j7Var.a(pdVar);
        }
    }

    public final void s(String str) {
        if (qf.a.f4997c) {
            this.d.a(str, Thread.currentThread().getId());
        }
    }

    public String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.g));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        j();
        String str = this.f;
        String strValueOf2 = String.valueOf(g4.NORMAL);
        String strValueOf3 = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(strConcat).length() + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" ");
        sb.append(strValueOf2);
        sb.append(" ");
        sb.append(strValueOf3);
        return sb.toString();
    }

    public final int v() {
        return this.g;
    }

    final void x(int r2) {
        f3 f3Var = this.k;
        if (f3Var != null) {
            f3Var.b(this, r2);
        }
    }

    final void y(String str) {
        f3 f3Var = this.k;
        if (f3Var != null) {
            f3Var.d(this);
        }
        if (qf.a.f4997c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new e2(this, str, id));
            } else {
                this.d.a(str, id);
                this.d.b(toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b<?> z(int r1) {
        this.j = Integer.valueOf(r1);
        return this;
    }
}

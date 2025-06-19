package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.xe0;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class wt1 implements xu1 {
    protected static volatile jf2 w;
    protected MotionEvent d;
    protected double m;
    private double n;
    private double o;
    protected float p;
    protected float q;
    protected float r;
    protected float s;
    protected DisplayMetrics v;
    protected LinkedList<MotionEvent> e = new LinkedList<>();
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    protected long k = 0;
    protected long l = 0;
    private boolean t = false;
    protected boolean u = false;

    protected wt1(Context context) {
        try {
            if (((Boolean) qx2.e().c(e0.M1)).booleanValue()) {
                x41.f();
            } else {
                rf2.a(w);
            }
            this.v = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String j(Context context, String str, int r22, View view, Activity activity, byte[] bArr) {
        vs1 vs1VarW;
        String str2;
        int r12;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) qx2.e().c(e0.B1)).booleanValue();
        fm0.a.C0175a c0175aI = null;
        if (zBooleanValue) {
            vs1VarW = w != null ? w.w() : null;
            str2 = ((Boolean) qx2.e().c(e0.M1)).booleanValue() ? "be" : "te";
        } else {
            vs1VarW = null;
            str2 = null;
        }
        try {
            if (r22 == w31.g) {
                c0175aI = k(context, view, activity);
                this.t = true;
                r12 = b.i.p.a0.e;
            } else if (r22 == w31.f) {
                c0175aI = n(context, view, activity);
                r12 = b.i.p.a0.j;
            } else {
                c0175aI = i(context, null);
                r12 = 1000;
            }
            if (zBooleanValue && vs1VarW != null) {
                vs1VarW.c(r12, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2);
            }
        } catch (Exception e) {
            if (zBooleanValue && vs1VarW != null) {
                vs1VarW.d(r22 == w31.g ? b.i.p.a0.f : r22 == w31.f ? b.i.p.a0.k : r22 == w31.e ? b.i.p.a0.d : -1, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (c0175aI != null) {
            try {
                if (((fm0.a) ((l92) c0175aI.P())).b() != 0) {
                    String strH = x41.h((fm0.a) ((l92) c0175aI.P()), str);
                    if (!zBooleanValue || vs1VarW == null) {
                        return strH;
                    }
                    vs1VarW.c(r22 == w31.g ? b.i.p.a0.h : r22 == w31.f ? b.i.p.a0.l : r22 == w31.e ? b.i.p.a0.g : -1, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2);
                    return strH;
                }
            } catch (Exception e2) {
                String string = Integer.toString(7);
                if (!zBooleanValue || vs1VarW == null) {
                    return string;
                }
                vs1VarW.d(r22 == w31.g ? b.i.p.a0.i : r22 == w31.f ? b.i.p.a0.m : r22 == w31.e ? 1005 : -1, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e2);
                return string;
            }
        }
        return Integer.toString(5);
    }

    private final void m() {
        this.j = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.k = 0L;
        this.l = 0L;
        if (this.e.size() > 0) {
            Iterator<MotionEvent> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.e.clear();
        } else {
            MotionEvent motionEvent = this.d;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public void a(View view) {
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public void b(int r17, int r18, int r19) {
        MotionEvent motionEventObtain;
        if (this.d != null) {
            if (((Boolean) qx2.e().c(e0.z1)).booleanValue()) {
                m();
            } else {
                this.d.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.v;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            motionEventObtain = MotionEvent.obtain(0L, r19, 1, r17 * f, r18 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEventObtain = null;
        }
        this.d = motionEventObtain;
        this.u = false;
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public String c(Context context) {
        if (tf2.a()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return j(context, null, w31.e, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public String d(Context context, View view, Activity activity) {
        return j(context, null, w31.f, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String e(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public void f(MotionEvent motionEvent) {
        boolean z = false;
        if (this.t) {
            m();
            this.t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = 0.0d;
            this.n = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.n;
            double d2 = rawY - this.o;
            this.m += Math.sqrt((d * d) + (d2 * d2));
            this.n = rawX;
            this.o = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.d = motionEventObtain;
                    this.e.add(motionEventObtain);
                    if (this.e.size() > 6) {
                        this.e.remove().recycle();
                    }
                    this.h++;
                    this.j = h(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.g += motionEvent.getHistorySize() + 1;
                    qf2 qf2VarL = l(motionEvent);
                    if ((qf2VarL == null || qf2VarL.e == null || qf2VarL.h == null) ? false : true) {
                        this.k += qf2VarL.e.longValue() + qf2VarL.h.longValue();
                    }
                    if (this.v != null && qf2VarL != null && qf2VarL.f != null && qf2VarL.i != null) {
                        z = true;
                    }
                    if (z) {
                        this.l += qf2VarL.f.longValue() + qf2VarL.i.longValue();
                    }
                } else if (action2 == 3) {
                    this.i++;
                }
            } catch (gf2 unused) {
            }
        } else {
            this.p = motionEvent.getX();
            this.q = motionEvent.getY();
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.f++;
        }
        this.u = true;
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public String g(Context context, String str, View view, Activity activity) {
        return j(context, str, w31.g, view, activity, null);
    }

    protected abstract long h(StackTraceElement[] stackTraceElementArr) throws gf2;

    protected abstract fm0.a.C0175a i(Context context, xe0.a aVar);

    protected abstract fm0.a.C0175a k(Context context, View view, Activity activity);

    protected abstract qf2 l(MotionEvent motionEvent) throws gf2;

    protected abstract fm0.a.C0175a n(Context context, View view, Activity activity);
}

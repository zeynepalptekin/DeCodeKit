package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class mg {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4406b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    @com.google.android.gms.common.util.d0
    private static boolean f4407c = false;

    @GuardedBy("lock")
    @com.google.android.gms.common.util.d0
    private static boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private sr1 f4408a;

    @com.google.android.gms.common.util.d0
    private final void i(Context context) {
        synchronized (f4406b) {
            if (((Boolean) qx2.e().c(e0.k3)).booleanValue() && !d) {
                try {
                    d = true;
                    this.f4408a = (sr1) wr.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", og.f4690a);
                } catch (yr e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @androidx.annotation.i0
    public final String a(Context context) {
        if (!((Boolean) qx2.e().c(e0.k3)).booleanValue()) {
            return null;
        }
        try {
            i(context);
            String strValueOf = String.valueOf(this.f4408a.q7());
            return strValueOf.length() != 0 ? "a.".concat(strValueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    @androidx.annotation.i0
    public final c.a.b.b.e.c b(String str, WebView webView, String str2, String str3, String str4) {
        return c(str, webView, str2, str3, str4, "Google");
    }

    @androidx.annotation.i0
    public final c.a.b.b.e.c c(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f4406b) {
            try {
                try {
                    if (((Boolean) qx2.e().c(e0.k3)).booleanValue() && f4407c) {
                        try {
                            return this.f4408a.V6(str, c.a.b.b.e.e.i2(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            tr.e("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void d(c.a.b.b.e.c cVar, View view) {
        synchronized (f4406b) {
            if (((Boolean) qx2.e().c(e0.k3)).booleanValue() && f4407c) {
                try {
                    this.f4408a.R4(cVar, c.a.b.b.e.e.i2(view));
                } catch (RemoteException | NullPointerException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void e(c.a.b.b.e.c cVar) {
        synchronized (f4406b) {
            if (((Boolean) qx2.e().c(e0.k3)).booleanValue() && f4407c) {
                try {
                    this.f4408a.j8(cVar);
                } catch (RemoteException | NullPointerException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void f(c.a.b.b.e.c cVar) {
        synchronized (f4406b) {
            if (((Boolean) qx2.e().c(e0.k3)).booleanValue() && f4407c) {
                try {
                    this.f4408a.d3(cVar);
                } catch (RemoteException | NullPointerException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void g(c.a.b.b.e.c cVar, View view) {
        synchronized (f4406b) {
            if (((Boolean) qx2.e().c(e0.k3)).booleanValue() && f4407c) {
                try {
                    this.f4408a.a3(cVar, c.a.b.b.e.e.i2(view));
                } catch (RemoteException | NullPointerException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean h(Context context) {
        synchronized (f4406b) {
            if (!((Boolean) qx2.e().c(e0.k3)).booleanValue()) {
                return false;
            }
            if (f4407c) {
                return true;
            }
            try {
                i(context);
                boolean zY4 = this.f4408a.Y4(c.a.b.b.e.e.i2(context));
                f4407c = zY4;
                return zY4;
            } catch (RemoteException e) {
                e = e;
                tr.e("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                tr.e("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}

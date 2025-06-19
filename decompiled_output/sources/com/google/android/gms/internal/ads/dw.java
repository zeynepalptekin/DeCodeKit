package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public final class dw extends sv implements ev {
    private xu g;
    private String h;
    private boolean i;
    private Exception j;
    private boolean k;

    public dw(zt ztVar, au auVar) {
        super(ztVar);
        xu xuVar = new xu(ztVar.getContext(), auVar);
        this.g = xuVar;
        xuVar.p(this);
    }

    private static String A(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void B(String str) {
        synchronized (this) {
            this.i = true;
            notify();
            a();
        }
        String str2 = this.h;
        if (str2 != null) {
            String strX = x(str2);
            Exception exc = this.j;
            if (exc != null) {
                o(this.h, strX, "badUrl", A(str, exc));
            } else {
                o(this.h, strX, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sv, com.google.android.gms.common.api.c
    public final void a() {
        xu xuVar = this.g;
        if (xuVar != null) {
            xuVar.p(null);
            this.g.m();
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void b(final boolean z, final long j) {
        final zt ztVar = this.f.get();
        if (ztVar != null) {
            cs.e.execute(new Runnable(ztVar, z, j) { // from class: com.google.android.gms.internal.ads.gw
                private final zt d;
                private final boolean e;
                private final long f;

                {
                    this.d = ztVar;
                    this.e = z;
                    this.f = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.A0(this.e, this.f);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void c(int r1, int r2) {
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void e(String str, Exception exc) {
        String str2 = (String) qx2.e().c(e0.l);
        if (str2 != null) {
            List listAsList = Arrays.asList(str2.split(","));
            if (listAsList.contains("all") || listAsList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.j = exc;
        tr.d("Precache error", exc);
        B(str);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void g(int r1) {
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void h() {
        B(null);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void r(int r2) {
        this.g.v().j(r2);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void s(int r2) {
        this.g.v().k(r2);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void t(int r2) {
        this.g.v().h(r2);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void u(int r2) {
        this.g.v().i(r2);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final boolean v(String str, String[] strArr) throws Throwable {
        String str2;
        long j;
        long j2;
        long j3;
        String str3;
        long j4;
        long j5;
        this.h = str;
        String strX = x(str);
        String str4 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int r2 = 0; r2 < strArr.length; r2++) {
                try {
                    uriArr[r2] = Uri.parse(strArr[r2]);
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str);
                    sb.append(" Exception: ");
                    sb.append(message);
                    tr.i(sb.toString());
                    a();
                    o(str, strX, str4, A(str4, e));
                    return false;
                }
            }
            this.g.q(uriArr, this.e);
            zt ztVar = this.f.get();
            if (ztVar != null) {
                ztVar.f(strX, this);
            }
            com.google.android.gms.common.util.g gVarJ = com.google.android.gms.ads.internal.p.j();
            long jA = gVarJ.a();
            long jLongValue = ((Long) qx2.e().c(e0.s)).longValue();
            long jLongValue2 = ((Long) qx2.e().c(e0.r)).longValue() * 1000;
            long jIntValue = ((Integer) qx2.e().c(e0.q)).intValue();
            long j6 = -1;
            while (true) {
                try {
                    synchronized (this) {
                        try {
                            if (gVarJ.a() - jA > jLongValue2) {
                                long j7 = jLongValue2;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(j7);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            }
                            if (this.i) {
                                if (this.j != null) {
                                    throw this.j;
                                }
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                            if (!this.k) {
                                rh2 rh2VarS = this.g.s();
                                str2 = str4;
                                if (rh2VarS == null) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                try {
                                    long jM = rh2VarS.M();
                                    if (jM > 0) {
                                        long jO0 = rh2VarS.O0();
                                        if (jO0 != j6) {
                                            j = jIntValue;
                                            j2 = jLongValue2;
                                            j4 = jLongValue;
                                            n(str, strX, jO0, jM, jO0 > 0, xu.t(), xu.u());
                                            j5 = jO0;
                                        } else {
                                            j = jIntValue;
                                            j2 = jLongValue2;
                                            j4 = jLongValue;
                                            j5 = j6;
                                        }
                                        if (jO0 >= jM) {
                                            q(str, strX, jM);
                                            break;
                                        }
                                        if (this.g.l() >= j && jO0 > 0) {
                                            break;
                                        }
                                        j3 = j4;
                                        str3 = j5;
                                    } else {
                                        j = jIntValue;
                                        j2 = jLongValue2;
                                        j3 = jLongValue;
                                        str3 = j6;
                                    }
                                    try {
                                        try {
                                            wait(j3);
                                        } catch (Throwable th) {
                                            th = th;
                                            str4 = str3;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    jLongValue = j3;
                    str4 = str2;
                    jIntValue = j;
                    jLongValue2 = j2;
                    j6 = str3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final boolean w(String str) {
        return v(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.sv
    protected final String x(String str) {
        String strValueOf = String.valueOf(super.x(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    public final xu z() {
        synchronized (this) {
            this.k = true;
            notify();
        }
        this.g.p(null);
        xu xuVar = this.g;
        this.g = null;
        return xuVar;
    }
}

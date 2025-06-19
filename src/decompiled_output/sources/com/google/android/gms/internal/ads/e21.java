package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import b.d.b.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e21 implements u01<gi0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3207a;

    /* renamed from: b, reason: collision with root package name */
    private final hj0 f3208b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3209c;
    private final im1 d;

    public e21(Context context, Executor executor, hj0 hj0Var, im1 im1Var) {
        this.f3207a = context;
        this.f3208b = hj0Var;
        this.f3209c = executor;
        this.d = im1Var;
    }

    private static String d(km1 km1Var) {
        try {
            return km1Var.u.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        return (this.f3207a instanceof Activity) && com.google.android.gms.common.util.v.d() && g1.a(this.f3207a) && !TextUtils.isEmpty(d(km1Var));
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<gi0> b(final wm1 wm1Var, final km1 km1Var) {
        String strD = d(km1Var);
        final Uri uri = strD != null ? Uri.parse(strD) : null;
        return qx1.j(qx1.g(null), new ax1(this, uri, wm1Var, km1Var) { // from class: com.google.android.gms.internal.ads.h21

            /* renamed from: a, reason: collision with root package name */
            private final e21 f3618a;

            /* renamed from: b, reason: collision with root package name */
            private final Uri f3619b;

            /* renamed from: c, reason: collision with root package name */
            private final wm1 f3620c;
            private final km1 d;

            {
                this.f3618a = this;
                this.f3619b = uri;
                this.f3620c = wm1Var;
                this.d = km1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3618a.c(this.f3619b, this.f3620c, this.d, obj);
            }
        }, this.f3209c);
    }

    final /* synthetic */ dy1 c(Uri uri, wm1 wm1Var, km1 km1Var, Object obj) throws Exception {
        try {
            b.d.b.c cVarD = new c.a().d();
            cVarD.f859a.setData(uri);
            com.google.android.gms.ads.internal.overlay.b bVar = new com.google.android.gms.ads.internal.overlay.b(cVarD.f859a);
            final ks ksVar = new ks();
            ii0 ii0VarA = this.f3208b.a(new v70(wm1Var, km1Var, null), new hi0(new pj0(ksVar) { // from class: com.google.android.gms.internal.ads.g21

                /* renamed from: a, reason: collision with root package name */
                private final ks f3492a;

                {
                    this.f3492a = ksVar;
                }

                @Override // com.google.android.gms.internal.ads.pj0
                public final void a(boolean z, Context context) {
                    ks ksVar2 = this.f3492a;
                    try {
                        com.google.android.gms.ads.internal.p.b();
                        com.google.android.gms.ads.internal.overlay.l.a(context, (AdOverlayInfoParcel) ksVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            ksVar.a(new AdOverlayInfoParcel(bVar, null, ii0VarA.k(), null, new as(0, 0, false)));
            this.d.f();
            return qx1.g(ii0VarA.j());
        } catch (Throwable th) {
            tr.c("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}

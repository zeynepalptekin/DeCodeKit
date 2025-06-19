package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ro0 {

    /* renamed from: a, reason: collision with root package name */
    private final an1 f5169a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5170b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f5171c;

    public ro0(an1 an1Var, Executor executor, dr0 dr0Var) {
        this.f5169a = an1Var;
        this.f5170b = executor;
        this.f5171c = dr0Var;
    }

    private final void e(rw rwVar) {
        rwVar.o("/video", f6.m);
        rwVar.o("/videoMeta", f6.n);
        rwVar.o("/precache", new xv());
        rwVar.o("/delayPageLoaded", f6.q);
        rwVar.o("/instrument", f6.o);
        rwVar.o("/log", f6.h);
        rwVar.o("/videoClicked", f6.i);
        rwVar.C0().d(true);
        rwVar.o("/click", f6.d);
        if (((Boolean) qx2.e().c(e0.f2)).booleanValue()) {
            rwVar.o("/getNativeAdViewSignals", f6.t);
        }
        if (this.f5169a.f2721c != null) {
            rwVar.C0().g(true);
            rwVar.o("/open", new d7(null, null));
        } else {
            rwVar.C0().g(false);
        }
        if (com.google.android.gms.ads.internal.p.A().k(rwVar.getContext())) {
            rwVar.o("/logScionEvent", new b7(rwVar.getContext()));
        }
    }

    final /* synthetic */ dy1 a(String str, String str2, Object obj) throws Exception {
        final rw rwVarC = this.f5171c.c(qw2.l());
        final ls lsVarF = ls.f(rwVarC);
        e(rwVarC);
        rwVarC.p0(this.f5169a.f2721c != null ? hy.d() : hy.c());
        rwVarC.C0().m(new dy(this, rwVarC, lsVarF) { // from class: com.google.android.gms.internal.ads.yo0

            /* renamed from: a, reason: collision with root package name */
            private final ro0 f6156a;

            /* renamed from: b, reason: collision with root package name */
            private final rw f6157b;

            /* renamed from: c, reason: collision with root package name */
            private final ls f6158c;

            {
                this.f6156a = this;
                this.f6157b = rwVarC;
                this.f6158c = lsVarF;
            }

            @Override // com.google.android.gms.internal.ads.dy
            public final void a(boolean z) {
                this.f6156a.c(this.f6157b, this.f6158c, z);
            }
        });
        rwVarC.b0(str, str2, null);
        return lsVarF;
    }

    final /* synthetic */ dy1 b(JSONObject jSONObject, final rw rwVar) throws Exception {
        final ls lsVarF = ls.f(rwVar);
        rwVar.p0(this.f5169a.f2721c != null ? hy.d() : hy.c());
        rwVar.C0().m(new dy(this, rwVar, lsVarF) { // from class: com.google.android.gms.internal.ads.xo0

            /* renamed from: a, reason: collision with root package name */
            private final ro0 f6015a;

            /* renamed from: b, reason: collision with root package name */
            private final rw f6016b;

            /* renamed from: c, reason: collision with root package name */
            private final ls f6017c;

            {
                this.f6015a = this;
                this.f6016b = rwVar;
                this.f6017c = lsVarF;
            }

            @Override // com.google.android.gms.internal.ads.dy
            public final void a(boolean z) {
                this.f6015a.d(this.f6016b, this.f6017c, z);
            }
        });
        rwVar.q("google.afma.nativeAds.renderVideo", jSONObject);
        return lsVarF;
    }

    final /* synthetic */ void c(rw rwVar, ls lsVar, boolean z) {
        if (!z) {
            lsVar.b(new k41(xn1.INTERNAL_ERROR, "Instream video Web View failed to load."));
            return;
        }
        if (this.f5169a.f2720b != null && rwVar.n() != null) {
            rwVar.n().D8(this.f5169a.f2720b);
        }
        lsVar.g();
    }

    final /* synthetic */ void d(rw rwVar, ls lsVar, boolean z) {
        if (this.f5169a.f2720b != null && rwVar.n() != null) {
            rwVar.n().D8(this.f5169a.f2720b);
        }
        lsVar.g();
    }

    public final dy1<rw> f(final JSONObject jSONObject) {
        return qx1.j(qx1.j(qx1.g(null), new ax1(this) { // from class: com.google.android.gms.internal.ads.wo0

            /* renamed from: a, reason: collision with root package name */
            private final ro0 f5867a;

            {
                this.f5867a = this;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5867a.h(obj);
            }
        }, this.f5170b), new ax1(this, jSONObject) { // from class: com.google.android.gms.internal.ads.uo0

            /* renamed from: a, reason: collision with root package name */
            private final ro0 f5565a;

            /* renamed from: b, reason: collision with root package name */
            private final JSONObject f5566b;

            {
                this.f5565a = this;
                this.f5566b = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5565a.b(this.f5566b, (rw) obj);
            }
        }, this.f5170b);
    }

    public final dy1<rw> g(final String str, final String str2) {
        return qx1.j(qx1.g(null), new ax1(this, str, str2) { // from class: com.google.android.gms.internal.ads.to0

            /* renamed from: a, reason: collision with root package name */
            private final ro0 f5429a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5430b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5431c;

            {
                this.f5429a = this;
                this.f5430b = str;
                this.f5431c = str2;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5429a.a(this.f5430b, this.f5431c, obj);
            }
        }, this.f5170b);
    }

    final /* synthetic */ dy1 h(Object obj) throws Exception {
        rw rwVarC = this.f5171c.c(qw2.l());
        final ls lsVarF = ls.f(rwVarC);
        e(rwVarC);
        rwVarC.C0().b(new gy(lsVarF) { // from class: com.google.android.gms.internal.ads.vo0

            /* renamed from: a, reason: collision with root package name */
            private final ls f5714a;

            {
                this.f5714a = lsVarF;
            }

            @Override // com.google.android.gms.internal.ads.gy
            public final void a() {
                this.f5714a.g();
            }
        });
        rwVarC.loadUrl((String) qx2.e().c(e0.e2));
        return lsVarF;
    }
}

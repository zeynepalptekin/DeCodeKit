package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.nf;
import c.a.b.b.g.c.pf;
import c.a.b.b.g.c.wb;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends nf {

    @com.google.android.gms.common.util.d0
    b5 e = null;
    private Map<Integer, d6> f = new b.f.a();

    class a implements d6 {

        /* renamed from: a, reason: collision with root package name */
        private c.a.b.b.g.c.c f6336a;

        a(c.a.b.b.g.c.c cVar) {
            this.f6336a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.d6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f6336a.K0(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.e.B().I().b("Event listener threw exception", e);
            }
        }
    }

    class b implements e6 {

        /* renamed from: a, reason: collision with root package name */
        private c.a.b.b.g.c.c f6338a;

        b(c.a.b.b.g.c.c cVar) {
            this.f6338a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.e6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f6338a.K0(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.e.B().I().b("Event interceptor threw exception", e);
            }
        }
    }

    private final void b2() {
        if (this.e == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void e2(pf pfVar, String str) {
        this.e.G().R(pfVar, str);
    }

    @Override // c.a.b.b.g.c.of
    public void beginAdUnitExposure(String str, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.S().v(str, j);
    }

    @Override // c.a.b.b.g.c.of
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws IllegalStateException, RemoteException {
        b2();
        this.e.E().C0(str, str2, bundle);
    }

    @Override // c.a.b.b.g.c.of
    public void clearMeasurementEnabled(long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.E().T(null);
    }

    @Override // c.a.b.b.g.c.of
    public void endAdUnitExposure(String str, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.S().C(str, j);
    }

    @Override // c.a.b.b.g.c.of
    public void generateEventId(pf pfVar) throws RemoteException {
        b2();
        this.e.G().P(pfVar, this.e.G().E0());
    }

    @Override // c.a.b.b.g.c.of
    public void getAppInstanceId(pf pfVar) throws IllegalStateException, RemoteException {
        b2();
        this.e.x().v(new h6(this, pfVar));
    }

    @Override // c.a.b.b.g.c.of
    public void getCachedAppInstanceId(pf pfVar) throws RemoteException {
        b2();
        e2(pfVar, this.e.E().m0());
    }

    @Override // c.a.b.b.g.c.of
    public void getConditionalUserProperties(String str, String str2, pf pfVar) throws IllegalStateException, RemoteException {
        b2();
        this.e.x().v(new ka(this, pfVar, str, str2));
    }

    @Override // c.a.b.b.g.c.of
    public void getCurrentScreenClass(pf pfVar) throws RemoteException {
        b2();
        e2(pfVar, this.e.E().p0());
    }

    @Override // c.a.b.b.g.c.of
    public void getCurrentScreenName(pf pfVar) throws RemoteException {
        b2();
        e2(pfVar, this.e.E().o0());
    }

    @Override // c.a.b.b.g.c.of
    public void getGmpAppId(pf pfVar) throws RemoteException {
        b2();
        e2(pfVar, this.e.E().q0());
    }

    @Override // c.a.b.b.g.c.of
    public void getMaxUserProperties(String str, pf pfVar) throws RemoteException {
        b2();
        this.e.E();
        com.google.android.gms.common.internal.r.g(str);
        this.e.G().O(pfVar, 25);
    }

    @Override // c.a.b.b.g.c.of
    public void getTestFlag(pf pfVar, int r6) throws RemoteException {
        b2();
        if (r6 == 0) {
            this.e.G().R(pfVar, this.e.E().i0());
            return;
        }
        if (r6 == 1) {
            this.e.G().P(pfVar, this.e.E().j0().longValue());
            return;
        }
        if (r6 != 2) {
            if (r6 == 3) {
                this.e.G().O(pfVar, this.e.E().k0().intValue());
                return;
            } else {
                if (r6 != 4) {
                    return;
                }
                this.e.G().T(pfVar, this.e.E().h0().booleanValue());
                return;
            }
        }
        ha haVarG = this.e.G();
        double dDoubleValue = this.e.E().l0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            haVarG.f6543a.B().I().b("Error returning double value to wrapper", e);
        }
    }

    @Override // c.a.b.b.g.c.of
    public void getUserProperties(String str, String str2, boolean z, pf pfVar) throws IllegalStateException, RemoteException {
        b2();
        this.e.x().v(new i7(this, pfVar, str, str2, z));
    }

    @Override // c.a.b.b.g.c.of
    public void initForTests(Map map) throws RemoteException {
        b2();
    }

    @Override // c.a.b.b.g.c.of
    public void initialize(c.a.b.b.e.c cVar, c.a.b.b.g.c.f fVar, long j) throws RemoteException {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        b5 b5Var = this.e;
        if (b5Var == null) {
            this.e = b5.a(context, fVar, Long.valueOf(j));
        } else {
            b5Var.B().I().a("Attempting to initialize multiple times");
        }
    }

    @Override // c.a.b.b.g.c.of
    public void isDataCollectionEnabled(pf pfVar) throws IllegalStateException, RemoteException {
        b2();
        this.e.x().v(new k9(this, pfVar));
    }

    @Override // c.a.b.b.g.c.of
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.E().b0(str, str2, bundle, z, z2, j);
    }

    @Override // c.a.b.b.g.c.of
    public void logEventAndBundle(String str, String str2, Bundle bundle, pf pfVar, long j) throws IllegalStateException, RemoteException {
        b2();
        com.google.android.gms.common.internal.r.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.e.x().v(new j8(this, pfVar, new s(str2, new n(bundle), "app", j), str));
    }

    @Override // c.a.b.b.g.c.of
    public void logHealthData(int r10, String str, c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) throws IllegalStateException, RemoteException {
        b2();
        this.e.B().y(r10, true, false, str, cVar == null ? null : c.a.b.b.e.e.e2(cVar), cVar2 == null ? null : c.a.b.b.e.e.e2(cVar2), cVar3 != null ? c.a.b.b.e.e.e2(cVar3) : null);
    }

    @Override // c.a.b.b.g.c.of
    public void onActivityCreated(c.a.b.b.e.c cVar, Bundle bundle, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivityCreated((Activity) c.a.b.b.e.e.e2(cVar), bundle);
        }
    }

    @Override // c.a.b.b.g.c.of
    public void onActivityDestroyed(c.a.b.b.e.c cVar, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivityDestroyed((Activity) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // c.a.b.b.g.c.of
    public void onActivityPaused(c.a.b.b.e.c cVar, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivityPaused((Activity) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // c.a.b.b.g.c.of
    public void onActivityResumed(c.a.b.b.e.c cVar, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivityResumed((Activity) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // c.a.b.b.g.c.of
    public void onActivitySaveInstanceState(c.a.b.b.e.c cVar, pf pfVar, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        Bundle bundle = new Bundle();
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivitySaveInstanceState((Activity) c.a.b.b.e.e.e2(cVar), bundle);
        }
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.e.B().I().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // c.a.b.b.g.c.of
    public void onActivityStarted(c.a.b.b.e.c cVar, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivityStarted((Activity) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // c.a.b.b.g.c.of
    public void onActivityStopped(c.a.b.b.e.c cVar, long j) throws RemoteException {
        b2();
        h7 h7Var = this.e.E().f6388c;
        if (h7Var != null) {
            this.e.E().g0();
            h7Var.onActivityStopped((Activity) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // c.a.b.b.g.c.of
    public void performAction(Bundle bundle, pf pfVar, long j) throws RemoteException {
        b2();
        pfVar.s0(null);
    }

    @Override // c.a.b.b.g.c.of
    public void registerOnMeasurementEventListener(c.a.b.b.g.c.c cVar) throws RemoteException {
        b2();
        d6 aVar = this.f.get(Integer.valueOf(cVar.a()));
        if (aVar == null) {
            aVar = new a(cVar);
            this.f.put(Integer.valueOf(cVar.a()), aVar);
        }
        this.e.E().N(aVar);
    }

    @Override // c.a.b.b.g.c.of
    public void resetAnalyticsData(long j) throws IllegalStateException, RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        f6VarE.V(null);
        f6VarE.x().v(new q6(f6VarE, j));
    }

    @Override // c.a.b.b.g.c.of
    public void setConditionalUserProperty(Bundle bundle, long j) throws IllegalStateException, RemoteException {
        b2();
        if (bundle == null) {
            this.e.B().E().a("Conditional user property must not be null");
        } else {
            this.e.E().J(bundle, j);
        }
    }

    @Override // c.a.b.b.g.c.of
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        if (wb.b() && f6VarE.j().w(null, u.J0)) {
            f6VarE.I(bundle, 30, j);
        }
    }

    @Override // c.a.b.b.g.c.of
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        if (wb.b() && f6VarE.j().w(null, u.K0)) {
            f6VarE.I(bundle, 10, j);
        }
    }

    @Override // c.a.b.b.g.c.of
    public void setCurrentScreen(c.a.b.b.e.c cVar, String str, String str2, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.O().I((Activity) c.a.b.b.e.e.e2(cVar), str, str2);
    }

    @Override // c.a.b.b.g.c.of
    public void setDataCollectionEnabled(boolean z) throws IllegalStateException, RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        f6VarE.s();
        f6VarE.x().v(new e7(f6VarE, z));
    }

    @Override // c.a.b.b.g.c.of
    public void setDefaultEventParameters(Bundle bundle) throws IllegalStateException {
        b2();
        final f6 f6VarE = this.e.E();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        f6VarE.x().v(new Runnable(f6VarE, bundle2) { // from class: com.google.android.gms.measurement.internal.j6
            private final f6 d;
            private final Bundle e;

            {
                this.d = f6VarE;
                this.e = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.B0(this.e);
            }
        });
    }

    @Override // c.a.b.b.g.c.of
    public void setEventInterceptor(c.a.b.b.g.c.c cVar) throws IllegalStateException, RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        b bVar = new b(cVar);
        f6VarE.s();
        f6VarE.x().v(new t6(f6VarE, bVar));
    }

    @Override // c.a.b.b.g.c.of
    public void setInstanceIdProvider(c.a.b.b.g.c.d dVar) throws RemoteException {
        b2();
    }

    @Override // c.a.b.b.g.c.of
    public void setMeasurementEnabled(boolean z, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.E().T(Boolean.valueOf(z));
    }

    @Override // c.a.b.b.g.c.of
    public void setMinimumSessionDuration(long j) throws IllegalStateException, RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        f6VarE.x().v(new n6(f6VarE, j));
    }

    @Override // c.a.b.b.g.c.of
    public void setSessionTimeoutDuration(long j) throws IllegalStateException, RemoteException {
        b2();
        f6 f6VarE = this.e.E();
        f6VarE.x().v(new m6(f6VarE, j));
    }

    @Override // c.a.b.b.g.c.of
    public void setUserId(String str, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.E().e0(null, "_id", str, true, j);
    }

    @Override // c.a.b.b.g.c.of
    public void setUserProperty(String str, String str2, c.a.b.b.e.c cVar, boolean z, long j) throws IllegalStateException, RemoteException {
        b2();
        this.e.E().e0(str, str2, c.a.b.b.e.e.e2(cVar), z, j);
    }

    @Override // c.a.b.b.g.c.of
    public void unregisterOnMeasurementEventListener(c.a.b.b.g.c.c cVar) throws RemoteException {
        b2();
        d6 d6VarRemove = this.f.remove(Integer.valueOf(cVar.a()));
        if (d6VarRemove == null) {
            d6VarRemove = new a(cVar);
        }
        this.e.E().w0(d6VarRemove);
    }
}

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class l00 extends yf1 {

    /* renamed from: a, reason: collision with root package name */
    private final ih1 f4170a;

    /* renamed from: b, reason: collision with root package name */
    private ze2<uf1> f4171b;

    /* renamed from: c, reason: collision with root package name */
    private ze2<String> f4172c;
    private ze2<eg1> d;
    private ze2<Integer> e;
    private ze2<ig1> f;
    private ze2<pg1> g;
    private ze2<ug1> h;
    private ze2<Boolean> i;
    private ze2<ApplicationInfo> j;
    private ze2<dh1> k;
    private ze2<hh1> l;
    private ze2<wh1> m;
    private ze2<String> n;
    private ze2<tt0> o;
    private ze2<tt0> p;
    private ze2<tt0> q;
    private ze2<tt0> r;
    private ze2<Map<zq1, tt0>> s;
    private ze2<Set<ch0<ir1>>> t;
    private ze2<Set<ch0<ir1>>> u;
    private ze2 v;
    private ze2<cr1> w;
    private final /* synthetic */ e00 x;

    private l00(e00 e00Var, ih1 ih1Var) {
        this.x = e00Var;
        this.f4170a = ih1Var;
        this.f4171b = new vf1(h20.f3617a, this.x.k, this.x.f, bq1.a());
        this.f4172c = new mh1(ih1Var);
        this.d = new gg1(vz.f5751a, this.x.k, this.f4172c, bq1.a());
        this.e = new nh1(ih1Var);
        this.f = new ng1(h20.f3617a, this.e, this.x.k, this.x.G, this.x.f, bq1.a());
        this.g = new rg1(b20.f2779a, bq1.a(), this.x.k);
        this.h = new wg1(d20.f3061a, bq1.a(), this.f4172c);
        this.i = new oh1(ih1Var);
        this.j = new lh1(ih1Var);
        this.k = new fh1(this.x.I, this.x.f, this.i, this.j);
        this.l = new jh1(f20.f3361a, this.x.f, this.x.k);
        this.m = new yh1(bq1.a());
        this.n = new qh1(ih1Var);
        this.o = me2.a(ht0.a());
        this.p = me2.a(ft0.a());
        this.q = me2.a(jt0.a());
        this.r = me2.a(lt0.a());
        this.s = ((ue2) ((ue2) ((ue2) ((ue2) se2.b(4).a(zq1.GMS_SIGNALS, this.o)).a(zq1.BUILD_URL, this.p)).a(zq1.HTTP, this.q)).a(zq1.PRE_PROCESS, this.r)).b();
        this.t = me2.a(new ot0(this.n, this.x.k, bq1.a(), this.s));
        ve2 ve2VarC = ve2.a(0, 1).b(this.t).c();
        this.u = ve2VarC;
        this.v = kr1.a(ve2VarC);
        this.w = me2.a(hr1.a(bq1.a(), this.x.f, this.v));
    }

    private final yg1 d() {
        return new yg1((q) we2.b(new q(), "Cannot return null from a non-@Nullable @Provides method"), bq1.b(), (List) we2.b(this.f4170a.e(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final ag1 e() {
        return new ag1(e20.a(), bq1.b(), (String) we2.b(this.f4170a.b(), "Cannot return null from a non-@Nullable @Provides method"), this.f4170a.c());
    }

    @Override // com.google.android.gms.internal.ads.yf1
    public final ef1<JSONObject> a() {
        return kf1.a(bq1.b(), qv1.s((ff1) we2.b(new pd1(new ug1(a20.a(), bq1.b(), mh1.a(this.f4170a)), 0L, (ScheduledExecutorService) this.x.f.get()), "Cannot return null from a non-@Nullable @Provides method"), (ff1) we2.b(new pd1(new dh1(n10.a(this.x.f3193b), (ScheduledExecutorService) this.x.f.get(), this.f4170a.d(), lh1.a(this.f4170a)), ((Long) qx2.e().c(e0.u2)).longValue(), (ScheduledExecutorService) this.x.f.get()), "Cannot return null from a non-@Nullable @Provides method"), (ff1) we2.b(new pd1(new hh1(c20.a(), (ScheduledExecutorService) this.x.f.get(), mz.a(this.x.f3194c)), ((Long) qx2.e().c(e0.C2)).longValue(), (ScheduledExecutorService) this.x.f.get()), "Cannot return null from a non-@Nullable @Provides method"), (ff1) we2.b(new pd1(new uf1(e20.a(), mz.a(this.x.f3194c), (ScheduledExecutorService) this.x.f.get(), bq1.b()), 0L, (ScheduledExecutorService) this.x.f.get()), "Cannot return null from a non-@Nullable @Provides method"), (ff1) we2.b(new pd1(new wh1(bq1.b()), 0L, (ScheduledExecutorService) this.x.f.get()), "Cannot return null from a non-@Nullable @Provides method"), (ff1) we2.b(ph1.a(), "Cannot return null from a non-@Nullable @Provides method"), new eg1(null, mz.a(this.x.f3194c), mh1.a(this.f4170a), bq1.b()), new pg1(y10.a(), bq1.b(), mz.a(this.x.f3194c)), d(), e(), new ig1(e20.a(), this.f4170a.h(), mz.a(this.x.f3194c), (ao) this.x.G.get(), (ScheduledExecutorService) this.x.f.get(), bq1.b()), (ff1) this.x.H.get()));
    }

    @Override // com.google.android.gms.internal.ads.yf1
    public final ef1<JSONObject> b() {
        return uh1.a(a20.a(), this.x.H.get(), e(), d(), me2.b(this.f4171b), me2.b(this.d), me2.b(this.f), me2.b(this.g), me2.b(this.h), me2.b(this.k), me2.b(this.l), me2.b(this.m), bq1.b(), (ScheduledExecutorService) this.x.f.get());
    }

    @Override // com.google.android.gms.internal.ads.yf1
    public final cr1 c() {
        return this.w.get();
    }
}

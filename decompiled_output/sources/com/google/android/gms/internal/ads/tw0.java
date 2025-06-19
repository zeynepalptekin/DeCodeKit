package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class tw0 implements ax1<wi, wm1> {

    /* renamed from: a, reason: collision with root package name */
    private final nd0 f5456a;

    public tw0(nd0 nd0Var) {
        this.f5456a = nd0Var;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final /* synthetic */ dy1<wm1> a(wi wiVar) throws Exception {
        wi wiVar2 = wiVar;
        this.f5456a.e0(wiVar2);
        dy1<wm1> dy1VarD = d(wiVar2);
        qx1.f(dy1VarD, new ww0(this), cs.f);
        return dy1VarD;
    }

    protected abstract dy1<wm1> d(wi wiVar) throws uv0;
}

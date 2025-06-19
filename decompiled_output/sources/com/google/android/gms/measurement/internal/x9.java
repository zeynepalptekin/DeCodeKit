package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.wb;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class x9 implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ma f6560a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t9 f6561b;

    x9(t9 t9Var, ma maVar) {
        this.f6561b = t9Var;
        this.f6560a = maVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        y3 y3VarI;
        String str;
        if (wb.b() && this.f6561b.M().p(u.L0) && (!this.f6561b.b(this.f6560a.d).q() || !e.b(this.f6560a.z).q())) {
            y3VarI = this.f6561b.B().N();
            str = "Analytics storage consent denied. Returning null app instance id";
        } else {
            f4 f4VarV = this.f6561b.V(this.f6560a);
            if (f4VarV != null) {
                return f4VarV.x();
            }
            y3VarI = this.f6561b.B().I();
            str = "App info was null when attempting to get app instance id";
        }
        y3VarI.a(str);
        return null;
    }
}

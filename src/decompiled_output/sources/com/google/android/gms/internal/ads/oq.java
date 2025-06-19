package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class oq extends b<fz2> {
    private final ks<fz2> s;
    private final Map<String, String> t;
    private final nr u;

    public oq(String str, ks<fz2> ksVar) {
        this(str, null, ksVar);
    }

    private oq(String str, Map<String, String> map, ks<fz2> ksVar) throws IOException {
        super(0, str, new rq(ksVar));
        this.t = null;
        this.s = ksVar;
        nr nrVar = new nr();
        this.u = nrVar;
        nrVar.f(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.b
    protected final k8<fz2> n(fz2 fz2Var) {
        return k8.b(fz2Var, ds.a(fz2Var));
    }

    @Override // com.google.android.gms.internal.ads.b
    protected final /* synthetic */ void q(fz2 fz2Var) throws IOException {
        fz2 fz2Var2 = fz2Var;
        this.u.j(fz2Var2.f3479c, fz2Var2.f3477a);
        nr nrVar = this.u;
        byte[] bArr = fz2Var2.f3478b;
        if (nr.a() && bArr != null) {
            nrVar.s(bArr);
        }
        this.s.a(fz2Var2);
    }
}

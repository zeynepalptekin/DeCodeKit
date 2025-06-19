package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v3 implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ String e;
    private final /* synthetic */ Object f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ w3 i;

    v3(w3 w3Var, int r2, String str, Object obj, Object obj2, Object obj3) {
        this.i = w3Var;
        this.d = r2;
        this.e = str;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        char c2;
        j4 j4VarT = this.i.f6543a.t();
        if (!j4VarT.p()) {
            this.i.w(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.i.f6550c == 0) {
            if (this.i.j().A()) {
                w3Var = this.i;
                c2 = 'C';
            } else {
                w3Var = this.i;
                c2 = 'c';
            }
            w3Var.f6550c = c2;
        }
        if (this.i.d < 0) {
            this.i.d = 32053L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.d);
        char c3 = this.i.f6550c;
        long j = this.i.d;
        String strV = w3.v(true, this.e, this.f, this.g, this.h);
        StringBuilder sb = new StringBuilder(String.valueOf(strV).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c3);
        sb.append(j);
        sb.append(":");
        sb.append(strV);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.e.substring(0, 1024);
        }
        j4VarT.d.b(string, 1L);
    }
}

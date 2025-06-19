package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w00 {

    /* renamed from: a, reason: collision with root package name */
    private jz f5755a;

    /* renamed from: b, reason: collision with root package name */
    private i10 f5756b;

    /* renamed from: c, reason: collision with root package name */
    private jr1 f5757c;
    private s10 d;
    private wn1 e;

    private w00() {
    }

    public final w00 a(i10 i10Var) {
        this.f5756b = (i10) we2.a(i10Var);
        return this;
    }

    public final gz b() {
        we2.c(this.f5755a, jz.class);
        we2.c(this.f5756b, i10.class);
        if (this.f5757c == null) {
            this.f5757c = new jr1();
        }
        if (this.d == null) {
            this.d = new s10();
        }
        if (this.e == null) {
            this.e = new wn1();
        }
        return new e00(this.f5755a, this.f5756b, this.f5757c, this.d, this.e);
    }

    public final w00 c(jz jzVar) {
        this.f5755a = (jz) we2.a(jzVar);
        return this;
    }
}

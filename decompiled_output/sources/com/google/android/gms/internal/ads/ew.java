package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ew extends sv implements xp2<ip2> {
    private String g;
    private final au h;
    private boolean i;
    private final bw j;
    private final kv k;
    private ByteBuffer l;
    private boolean m;
    private final Object n;
    private boolean o;

    public ew(zt ztVar, au auVar) {
        super(ztVar);
        this.h = auVar;
        this.j = new bw();
        this.k = new kv();
        this.n = new Object();
    }

    private final void C() {
        int r6 = (int) this.j.b();
        int r1 = (int) this.k.a(this.l);
        int r5 = this.l.position();
        int r0 = Math.round(r1 * (r5 / r6));
        boolean z = r0 > 0;
        int r12 = xu.t();
        int r13 = xu.u();
        String str = this.g;
        m(str, x(str), r5, r6, r0, r1, z, r12, r13);
    }

    public final String A() {
        return this.g;
    }

    public final boolean B() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.xp2
    public final /* bridge */ /* synthetic */ void d(ip2 ip2Var) {
    }

    @Override // com.google.android.gms.internal.ads.xp2
    public final /* bridge */ /* synthetic */ void f(ip2 ip2Var, int r2) {
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void h() {
        this.i = true;
    }

    @Override // com.google.android.gms.internal.ads.xp2
    public final /* synthetic */ void k(ip2 ip2Var, jp2 jp2Var) {
        ip2 ip2Var2 = ip2Var;
        if (ip2Var2 instanceof lp2) {
            this.j.a((lp2) ip2Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: Exception -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0032, blocks: (B:5:0x0028, B:11:0x004b, B:17:0x0098, B:42:0x00ef, B:43:0x010a, B:45:0x010d, B:46:0x0130), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[Catch: Exception -> 0x013c, TRY_ENTER, TryCatch #1 {Exception -> 0x013c, blocks: (B:3:0x000d, B:9:0x0035, B:12:0x004e, B:13:0x0086, B:19:0x00a9, B:20:0x00ab), top: B:61:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:? -> B:53:0x013a). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.sv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew.w(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.sv
    protected final String x(String str) {
        String strValueOf = String.valueOf(super.x(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    public final ByteBuffer z() {
        synchronized (this.n) {
            if (this.l != null && !this.m) {
                this.l.flip();
                this.m = true;
            }
            this.i = true;
        }
        return this.l;
    }
}

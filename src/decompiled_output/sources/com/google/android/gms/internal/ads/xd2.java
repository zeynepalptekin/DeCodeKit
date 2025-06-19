package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class xd2 extends zd2 implements o50 {
    private r80 m;
    private String n;
    private boolean o;
    private long p;

    public xd2(String str) {
        this.n = str;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void b(r80 r80Var) {
        this.m = r80Var;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void e(be2 be2Var, ByteBuffer byteBuffer, long j, n40 n40Var) throws IOException {
        this.p = be2Var.position() - byteBuffer.remaining();
        this.o = byteBuffer.remaining() == 16;
        f(be2Var, j, n40Var);
    }

    @Override // com.google.android.gms.internal.ads.zd2
    public final void f(be2 be2Var, long j, n40 n40Var) throws IOException {
        this.e = be2Var;
        long jPosition = be2Var.position();
        this.g = jPosition;
        this.h = jPosition - ((this.o || 8 + j >= 4294967296L) ? 16 : 8);
        be2Var.c(be2Var.position() + j);
        this.i = be2Var.position();
        this.d = n40Var;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final String q() {
        return this.n;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class vd2 implements o50 {
    private static he2 n = he2.b(vd2.class);
    private String d;
    private r80 e;
    private ByteBuffer h;
    private long i;
    private long j;
    private be2 l;
    private long k = -1;
    private ByteBuffer m = null;
    private boolean g = true;
    boolean f = true;

    protected vd2(String str) {
        this.d = str;
    }

    private final synchronized void a() {
        if (!this.g) {
            try {
                he2 he2Var = n;
                String strValueOf = String.valueOf(this.d);
                he2Var.a(strValueOf.length() != 0 ? "mem mapping ".concat(strValueOf) : new String("mem mapping "));
                this.h = this.l.d(this.i, this.k);
                this.g = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void b(r80 r80Var) {
        this.e = r80Var;
    }

    public final synchronized void c() {
        a();
        he2 he2Var = n;
        String strValueOf = String.valueOf(this.d);
        he2Var.a(strValueOf.length() != 0 ? "parsing details of ".concat(strValueOf) : new String("parsing details of "));
        if (this.h != null) {
            ByteBuffer byteBuffer = this.h;
            this.f = true;
            byteBuffer.rewind();
            d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.m = byteBuffer.slice();
            }
            this.h = null;
        }
    }

    protected abstract void d(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.o50
    public final void e(be2 be2Var, ByteBuffer byteBuffer, long j, n40 n40Var) throws IOException {
        long jPosition = be2Var.position();
        this.i = jPosition;
        this.j = jPosition - byteBuffer.remaining();
        this.k = j;
        this.l = be2Var;
        be2Var.c(be2Var.position() + j);
        this.g = false;
        this.f = false;
        c();
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final String q() {
        return this.d;
    }
}

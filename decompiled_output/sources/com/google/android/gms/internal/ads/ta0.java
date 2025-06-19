package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class ta0 extends wd2 {
    private int A;
    private int B;
    private int C;
    private int D;
    private Date q;
    private Date r;
    private long s;
    private long t;
    private double u;
    private float v;
    private ge2 w;
    private long x;
    private int y;
    private int z;

    public ta0() {
        super("mvhd");
        this.u = 1.0d;
        this.v = 1.0f;
        this.w = ge2.j;
    }

    @Override // com.google.android.gms.internal.ads.vd2
    public final void d(ByteBuffer byteBuffer) {
        long jB;
        g(byteBuffer);
        if (f() == 1) {
            this.q = de2.a(p60.d(byteBuffer));
            this.r = de2.a(p60.d(byteBuffer));
            this.s = p60.b(byteBuffer);
            jB = p60.d(byteBuffer);
        } else {
            this.q = de2.a(p60.b(byteBuffer));
            this.r = de2.a(p60.b(byteBuffer));
            this.s = p60.b(byteBuffer);
            jB = p60.b(byteBuffer);
        }
        this.t = jB;
        this.u = p60.e(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.v = ((short) ((r0[1] & 255) | ((short) (0 | ((r0[0] << 8) & b.i.p.p.f))))) / 256.0f;
        p60.c(byteBuffer);
        p60.b(byteBuffer);
        p60.b(byteBuffer);
        this.w = ge2.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.z = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.x = p60.b(byteBuffer);
    }

    public final long h() {
        return this.t;
    }

    public final long i() {
        return this.s;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.q + ";modificationTime=" + this.r + ";timescale=" + this.s + ";duration=" + this.t + ";rate=" + this.u + ";volume=" + this.v + ";matrix=" + this.w + ";nextTrackId=" + this.x + "]";
    }
}

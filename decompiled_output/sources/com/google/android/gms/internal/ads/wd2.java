package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class wd2 extends vd2 implements o50 {
    private int o;
    private int p;

    protected wd2(String str) {
        super(str);
    }

    public final int f() {
        if (!this.f) {
            c();
        }
        return this.o;
    }

    protected final long g(ByteBuffer byteBuffer) {
        this.o = p60.a(byteBuffer.get());
        this.p = (p60.c(byteBuffer) << 8) + 0 + p60.a(byteBuffer.get());
        return 4L;
    }
}

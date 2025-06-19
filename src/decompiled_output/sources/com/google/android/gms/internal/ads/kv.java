package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kv {

    /* renamed from: a, reason: collision with root package name */
    private long f4152a;

    public final long a(ByteBuffer byteBuffer) {
        ta0 ta0Var;
        q70 q70Var;
        long j = this.f4152a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator<o50> it = new m30(new hv(byteBufferDuplicate), mv.f4456c).g().iterator();
            while (true) {
                ta0Var = null;
                if (!it.hasNext()) {
                    q70Var = null;
                    break;
                }
                o50 next = it.next();
                if (next instanceof q70) {
                    q70Var = (q70) next;
                    break;
                }
            }
            Iterator<o50> it2 = q70Var.g().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                o50 next2 = it2.next();
                if (next2 instanceof ta0) {
                    ta0Var = (ta0) next2;
                    break;
                }
            }
            long jH = (ta0Var.h() * 1000) / ta0Var.i();
            this.f4152a = jH;
            return jH;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}

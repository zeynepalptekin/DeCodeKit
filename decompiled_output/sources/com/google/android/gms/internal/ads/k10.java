package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class k10 extends ThreadLocal<ByteBuffer> {
    k10(l20 l20Var) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}

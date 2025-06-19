package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s90 extends vd2 {
    private ByteBuffer o;

    public s90(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.vd2
    public final void d(ByteBuffer byteBuffer) {
        this.o = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}

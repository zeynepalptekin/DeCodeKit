package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.h0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f6969a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f6970b = Byte.parseByte("00001111", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final int f6971c = 22;

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID r2, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(r2.getMostSignificantBits());
        byteBufferWrap.putLong(r2.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    @h0
    public String a() {
        byte[] bArrC = c(UUID.randomUUID(), new byte[17]);
        bArrC[16] = bArrC[0];
        bArrC[0] = (byte) ((f6970b & bArrC[0]) | f6969a);
        return b(bArrC);
    }
}

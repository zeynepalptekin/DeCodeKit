package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.e0.a;
import com.google.android.gms.internal.ads.fm0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
final class os1 implements qs1 {

    /* renamed from: a, reason: collision with root package name */
    private static final fm0.a f4735a = fm0.a.x0();

    os1() {
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final fm0.a a() {
        return f4735a;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final fm0.a b(Context context) throws IllegalStateException, c.a.b.b.d.g, IOException, c.a.b.b.d.h {
        fm0.a.C0175a c0175aV0 = fm0.a.v0();
        com.google.android.gms.ads.e0.a aVar = new com.google.android.gms.ads.e0.a(context);
        aVar.f();
        a.C0160a c0160aC = aVar.c();
        String strA = c0160aC.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID r1 = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(r1.getMostSignificantBits());
            byteBufferWrap.putLong(r1.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            c0175aV0.K(strA);
            c0175aV0.A(c0160aC.b());
            c0175aV0.v(fm0.a.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (fm0.a) ((l92) c0175aV0.P());
    }
}

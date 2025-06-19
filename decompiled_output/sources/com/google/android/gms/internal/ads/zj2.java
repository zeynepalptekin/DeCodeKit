package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes.dex */
final class zj2 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f6275a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f6276b;

    private zj2(MediaCodec.CryptoInfo cryptoInfo) {
        this.f6275a = cryptoInfo;
        this.f6276b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int r2, int r3) {
        this.f6276b.set(r2, r3);
        this.f6275a.setPattern(this.f6276b);
    }
}

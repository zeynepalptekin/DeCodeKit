package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes.dex */
final class xm2 implements vm2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6005a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f6006b;

    public xm2(boolean z) {
        this.f6005a = z ? 1 : 0;
    }

    private final void e() {
        if (this.f6006b == null) {
            this.f6006b = new MediaCodecList(this.f6005a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final MediaCodecInfo a(int r2) {
        e();
        return this.f6006b[r2];
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final int c() {
        e();
        return this.f6006b.length;
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}

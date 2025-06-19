package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class um2 implements vm2 {
    private um2() {
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final MediaCodecInfo a(int r1) {
        return MediaCodecList.getCodecInfoAt(r1);
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final int c() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.vm2
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}

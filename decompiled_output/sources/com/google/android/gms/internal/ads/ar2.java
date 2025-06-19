package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* loaded from: classes.dex */
final class ar2 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ uq2 f2741a;

    private ar2(uq2 uq2Var, MediaCodec mediaCodec) {
        this.f2741a = uq2Var;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@androidx.annotation.h0 MediaCodec mediaCodec, long j, long j2) {
        uq2 uq2Var = this.f2741a;
        if (this != uq2Var.y0) {
            return;
        }
        uq2Var.V();
    }
}

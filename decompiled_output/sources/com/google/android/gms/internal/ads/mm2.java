package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class mm2 extends Exception {
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;

    public mm2(di2 di2Var, Throwable th, boolean z, int r6) {
        String strValueOf = String.valueOf(di2Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(r6);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.d = di2Var.i;
        this.e = false;
        this.f = null;
        String str = r6 < 0 ? "neg_" : "";
        int r4 = Math.abs(r6);
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(r4);
        this.g = sb2.toString();
    }

    public mm2(di2 di2Var, Throwable th, boolean z, String str) {
        String strValueOf = String.valueOf(di2Var);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(strValueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.d = di2Var.i;
        this.e = false;
        this.f = str;
        String diagnosticInfo = null;
        if (nq2.f4592a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.g = diagnosticInfo;
    }
}

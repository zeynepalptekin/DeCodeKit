package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;

@TargetApi(16)
/* loaded from: classes.dex */
public final class km2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4114a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4115b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4116c;
    public final boolean d;
    private final String e;
    private final MediaCodecInfo.CodecCapabilities f;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private km2(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.vp2.d(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f4114a = r2
            r1.e = r3
            r1.f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L2a
            int r5 = com.google.android.gms.internal.ads.nq2.f4592a
            r0 = 19
            if (r5 < r0) goto L25
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            r1.f4115b = r5
            r5 = 21
            if (r4 == 0) goto L44
            int r0 = com.google.android.gms.internal.ads.nq2.f4592a
            if (r0 < r5) goto L3f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r1.f4116c = r0
            if (r6 != 0) goto L5e
            if (r4 == 0) goto L5d
            int r6 = com.google.android.gms.internal.ads.nq2.f4592a
            if (r6 < r5) goto L59
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L59
            r4 = 1
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            r1.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.km2.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public static km2 a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new km2(str, str2, codecCapabilities, z, z2);
    }

    @TargetApi(21)
    private static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int r4, int r5, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(r4, r5) : videoCapabilities.areSizeAndRateSupported(r4, r5, d);
    }

    public static km2 f(String str) {
        return new km2(str, null, null, false, false);
    }

    private final void h(String str) {
        String str2 = this.f4114a;
        String str3 = this.e;
        String str4 = nq2.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    public final boolean b(int r5, int r6, double d) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                string = "sizeAndRate.vCaps";
            } else {
                if (c(videoCapabilities, r5, r6, d)) {
                    return true;
                }
                if (r5 < r6 && c(videoCapabilities, r6, r5, d)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(r5);
                    sb.append("x");
                    sb.append(r6);
                    sb.append("x");
                    sb.append(d);
                    String string2 = sb.toString();
                    String str = this.f4114a;
                    String str2 = this.e;
                    String str3 = nq2.e;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
                    sb2.append("AssumedSupport [");
                    sb2.append(string2);
                    sb2.append("] [");
                    sb2.append(str);
                    sb2.append(", ");
                    sb2.append(str2);
                    sb2.append("] [");
                    sb2.append(str3);
                    sb2.append("]");
                    Log.d("MediaCodecInfo", sb2.toString());
                    return true;
                }
                StringBuilder sb3 = new StringBuilder(69);
                sb3.append("sizeAndRate.support, ");
                sb3.append(r5);
                sb3.append("x");
                sb3.append(r6);
                sb3.append("x");
                sb3.append(d);
                string = sb3.toString();
            }
        }
        h(string);
        return false;
    }

    @TargetApi(21)
    public final boolean d(int r4) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            string = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                string = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(r4)) {
                    return true;
                }
                StringBuilder sb = new StringBuilder(31);
                sb.append("sampleRate.support, ");
                sb.append(r4);
                string = sb.toString();
            }
        }
        h(string);
        return false;
    }

    @TargetApi(21)
    public final boolean e(int r4) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            string = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                string = "channelCount.aCaps";
            } else {
                if (audioCapabilities.getMaxInputChannelCount() >= r4) {
                    return true;
                }
                StringBuilder sb = new StringBuilder(33);
                sb.append("channelCount.support, ");
                sb.append(r4);
                string = sb.toString();
            }
        }
        h(string);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.km2.g(java.lang.String):boolean");
    }

    @TargetApi(21)
    public final Point i(int r4, int r5) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(nq2.q(r4, widthAlignment) * widthAlignment, nq2.q(r5, heightAlignment) * heightAlignment);
            }
            str = "align.vCaps";
        }
        h(str);
        return null;
    }

    public final MediaCodecInfo.CodecProfileLevel[] j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}

package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes.dex */
final class jj2 extends gj2 {
    private final AudioTimestamp j;
    private long k;
    private long l;
    private long m;

    public jj2() {
        super(null);
        this.j = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.gj2
    public final void b(AudioTrack audioTrack, boolean z) {
        super.b(audioTrack, z);
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // com.google.android.gms.internal.ads.gj2
    public final boolean f() {
        boolean timestamp = this.f3547a.getTimestamp(this.j);
        if (timestamp) {
            long j = this.j.framePosition;
            if (this.l > j) {
                this.k++;
            }
            this.l = j;
            this.m = j + (this.k << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.gj2
    public final long g() {
        return this.j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.gj2
    public final long h() {
        return this.m;
    }
}

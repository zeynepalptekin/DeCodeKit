package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* loaded from: classes.dex */
class gj2 {

    /* renamed from: a, reason: collision with root package name */
    protected AudioTrack f3547a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3548b;

    /* renamed from: c, reason: collision with root package name */
    private int f3549c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    private gj2() {
    }

    /* synthetic */ gj2(hj2 hj2Var) {
        this();
    }

    public final void a() {
        if (this.g != -9223372036854775807L) {
            return;
        }
        this.f3547a.pause();
    }

    public void b(AudioTrack audioTrack, boolean z) {
        this.f3547a = audioTrack;
        this.f3548b = z;
        this.g = -9223372036854775807L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        if (audioTrack != null) {
            this.f3549c = audioTrack.getSampleRate();
        }
    }

    public final void c(long j) {
        this.h = d();
        this.g = SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.f3547a.stop();
    }

    public final long d() {
        if (this.g != -9223372036854775807L) {
            return Math.min(this.i, this.h + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * this.f3549c) / 1000000));
        }
        int playState = this.f3547a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.f3547a.getPlaybackHeadPosition();
        if (this.f3548b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f = this.d;
            }
            playbackHeadPosition += this.f;
        }
        if (this.d > playbackHeadPosition) {
            this.e++;
        }
        this.d = playbackHeadPosition;
        return playbackHeadPosition + (this.e << 32);
    }

    public final long e() {
        return (d() * 1000000) / this.f3549c;
    }

    public boolean f() {
        return false;
    }

    public long g() {
        throw new UnsupportedOperationException();
    }

    public long h() {
        throw new UnsupportedOperationException();
    }
}

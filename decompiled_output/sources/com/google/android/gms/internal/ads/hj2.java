package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class hj2 extends Thread {
    private final /* synthetic */ AudioTrack d;
    private final /* synthetic */ ej2 e;

    hj2(ej2 ej2Var, AudioTrack audioTrack) {
        this.e = ej2Var;
        this.d = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.d.flush();
            this.d.release();
        } finally {
            this.e.f.open();
        }
    }
}

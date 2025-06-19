package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class mp {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4434a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f4435b = 1.0f;

    public static float c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    private final synchronized boolean f() {
        return this.f4435b >= 0.0f;
    }

    public final synchronized void a(boolean z) {
        this.f4434a = z;
    }

    public final synchronized void b(float f) {
        this.f4435b = f;
    }

    public final synchronized float d() {
        if (!f()) {
            return 1.0f;
        }
        return this.f4435b;
    }

    public final synchronized boolean e() {
        return this.f4434a;
    }
}

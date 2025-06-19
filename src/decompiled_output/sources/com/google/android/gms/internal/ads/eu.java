package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* loaded from: classes.dex */
public final class eu implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f3326a;

    /* renamed from: b, reason: collision with root package name */
    private final du f3327b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3328c;
    private boolean d;
    private boolean e;
    private float f = 1.0f;

    public eu(Context context, du duVar) {
        this.f3326a = (AudioManager) context.getSystemService("audio");
        this.f3327b = duVar;
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3 = this.d && !this.e && this.f > 0.0f;
        if (z3 && !(z2 = this.f3328c)) {
            AudioManager audioManager = this.f3326a;
            if (audioManager != null && !z2) {
                this.f3328c = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.f3327b.a();
            return;
        }
        if (z3 || !(z = this.f3328c)) {
            return;
        }
        AudioManager audioManager2 = this.f3326a;
        if (audioManager2 != null && z) {
            this.f3328c = audioManager2.abandonAudioFocus(this) == 0;
        }
        this.f3327b.a();
    }

    public final float a() {
        float f = this.e ? 0.0f : this.f;
        if (this.f3328c) {
            return f;
        }
        return 0.0f;
    }

    public final void b(boolean z) {
        this.e = z;
        f();
    }

    public final void c(float f) {
        this.f = f;
        f();
    }

    public final void d() {
        this.d = true;
        f();
    }

    public final void e() {
        this.d = false;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int r1) {
        this.f3328c = r1 > 0;
        this.f3327b.a();
    }
}

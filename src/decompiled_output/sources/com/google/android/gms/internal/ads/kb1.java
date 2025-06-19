package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class kb1 implements ff1<hb1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4075a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4076b;

    public kb1(cy1 cy1Var, Context context) {
        this.f4075a = cy1Var;
        this.f4076b = context;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<hb1> a() {
        return this.f4075a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.jb1

            /* renamed from: a, reason: collision with root package name */
            private final kb1 f3938a;

            {
                this.f3938a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3938a.b();
            }
        });
    }

    final /* synthetic */ hb1 b() throws Exception {
        AudioManager audioManager = (AudioManager) this.f4076b.getSystemService("audio");
        return new hb1(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.p.h().d(), com.google.android.gms.ads.internal.p.h().e());
    }
}

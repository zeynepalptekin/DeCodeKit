package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.dp;
import com.google.android.gms.internal.ads.ko;
import com.google.android.gms.internal.ads.to;

/* loaded from: classes.dex */
final class j extends ko {
    final /* synthetic */ e d;

    private j(e eVar) {
        this.d = eVar;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void b() {
        Bitmap bitmapA = com.google.android.gms.ads.internal.p.v().a(Integer.valueOf(this.d.f.r.i));
        if (bitmapA != null) {
            dp dpVarE = com.google.android.gms.ads.internal.p.e();
            e eVar = this.d;
            Activity activity = eVar.e;
            com.google.android.gms.ads.internal.i iVar = eVar.f.r;
            final Drawable drawableD = dpVarE.d(activity, bitmapA, iVar.g, iVar.h);
            to.h.post(new Runnable(this, drawableD) { // from class: com.google.android.gms.ads.internal.overlay.m
                private final j d;
                private final Drawable e;

                {
                    this.d = this;
                    this.e = drawableD;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    j jVar = this.d;
                    jVar.d.e.getWindow().setBackgroundDrawable(this.e);
                }
            });
        }
    }
}

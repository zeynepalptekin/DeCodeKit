package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.ts1;
import com.google.android.gms.internal.ads.ys1;

@com.google.android.gms.common.internal.v
/* loaded from: classes.dex */
public final class is1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3863a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f3864b;

    public is1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Looper looper) {
        this.f3863a = context;
        this.f3864b = looper;
    }

    public final void a(@androidx.annotation.h0 String str) {
        new ls1(this.f3863a, this.f3864b, (ys1) ((l92) ys1.M().x(this.f3863a.getPackageName()).w(ys1.b.BLOCKED_IMPRESSION).v(ts1.K().w(str).v(ts1.a.BLOCKED_REASON_BACKGROUND)).P())).e();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
final class iz implements zo {

    /* renamed from: a, reason: collision with root package name */
    private File f3886a = null;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f3887b;

    iz(Context context) {
        this.f3887b = context;
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final File O() {
        if (this.f3886a == null) {
            this.f3886a = new File(this.f3887b.getCacheDir(), "volley");
        }
        return this.f3886a;
    }
}

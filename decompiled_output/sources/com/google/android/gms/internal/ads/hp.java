package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
/* loaded from: classes.dex */
public class hp extends ep {
    @Override // com.google.android.gms.internal.ads.dp
    public boolean b(View view) {
        return super.b(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final int q() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final long u() {
        if (((Boolean) qx2.e().c(e0.Y1)).booleanValue()) {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        }
        return -1L;
    }
}

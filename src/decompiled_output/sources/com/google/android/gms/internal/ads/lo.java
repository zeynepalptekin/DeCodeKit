package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
final class lo extends ko {
    private Context d;

    lo(Context context) {
        this.d = context;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void b() {
        boolean zD;
        try {
            zD = com.google.android.gms.ads.e0.a.d(this.d);
        } catch (c.a.b.b.d.g | c.a.b.b.d.h | IOException | IllegalStateException e) {
            tr.c("Fail to get isAdIdFakeForDebugLogging", e);
            zD = false;
        }
        nr.l(zD);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(zD);
        tr.i(sb.toString());
    }
}

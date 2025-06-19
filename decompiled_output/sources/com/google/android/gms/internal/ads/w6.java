package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class w6 implements z6<rw> {
    w6() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) {
        rw rwVar2 = rwVar;
        WindowManager windowManager = (WindowManager) rwVar2.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.p.c();
        DisplayMetrics displayMetricsB = to.b(windowManager);
        int r1 = displayMetricsB.widthPixels;
        int r7 = displayMetricsB.heightPixels;
        int[] r2 = new int[2];
        HashMap map2 = new HashMap();
        ((View) rwVar2).getLocationInWindow(r2);
        map2.put("xInPixels", Integer.valueOf(r2[0]));
        map2.put("yInPixels", Integer.valueOf(r2[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(r1));
        map2.put("windowHeightInPixels", Integer.valueOf(r7));
        rwVar2.M("locationReady", map2);
        tr.i("GET LOCATION COMPILED");
    }
}

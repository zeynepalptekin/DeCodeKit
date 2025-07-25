package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class kx implements z6<rw> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ hx f4156a;

    kx(hx hxVar) {
        this.f4156a = hxVar;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int r2 = Integer.parseInt(str);
                synchronized (this.f4156a) {
                    if (this.f4156a.M != r2) {
                        this.f4156a.M = r2;
                        this.f4156a.requestLayout();
                    }
                }
            } catch (Exception e) {
                tr.d("Exception occurred while getting webview content height", e);
            }
        }
    }
}

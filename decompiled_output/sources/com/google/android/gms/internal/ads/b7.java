package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes.dex */
public final class b7 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2795a;

    public b7(Context context) {
        this.f2795a = context;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (com.google.android.gms.ads.internal.p.A().k(this.f2795a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c2 = 65535;
            int r1 = str.hashCode();
            if (r1 != 94399) {
                if (r1 != 94401) {
                    if (r1 == 94407 && str.equals("_ai")) {
                        c2 = 1;
                    }
                } else if (str.equals("_ac")) {
                    c2 = 0;
                }
            } else if (str.equals("_aa")) {
                c2 = 2;
            }
            if (c2 == 0) {
                com.google.android.gms.ads.internal.p.A().x(this.f2795a, str2);
                return;
            }
            if (c2 == 1) {
                com.google.android.gms.ads.internal.p.A().y(this.f2795a, str2);
            } else if (c2 != 2) {
                tr.g("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.p.A().B(this.f2795a, str2);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@TargetApi(21)
/* loaded from: classes.dex */
final class jm {
    private static final Map<String, String> d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f3994a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f3995b;

    /* renamed from: c, reason: collision with root package name */
    private final ul f3996c;

    static {
        HashMap map = new HashMap();
        if (com.google.android.gms.common.util.v.j()) {
            map.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            map.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        d = map;
    }

    jm(Context context, List<String> list, ul ulVar) {
        this.f3994a = context;
        this.f3995b = list;
        this.f3996c = ulVar;
    }

    final List<String> a(String[] strArr) {
        boolean z;
        boolean z2;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.f3995b.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                String next = it.next();
                if (next.equals(str)) {
                    break;
                }
                strValueOf = String.valueOf(next);
            } while (!(strValueOf.length() != 0 ? "android.webkit.resource.".concat(strValueOf) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                if (d.containsKey(str)) {
                    com.google.android.gms.ads.internal.p.c();
                    if (!to.l0(this.f3994a, d.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.f3996c.k(str);
                }
            } else {
                this.f3996c.j(str);
            }
        }
        return arrayList;
    }
}

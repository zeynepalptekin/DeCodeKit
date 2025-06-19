package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class g7 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final k7 f3506a;

    private g7(k7 k7Var) {
        this.f3506a = k7Var;
    }

    public static void b(rw rwVar, k7 k7Var) {
        rwVar.o("/reward", new g7(k7Var));
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) throws NumberFormatException {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f3506a.c0();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f3506a.M();
                    return;
                }
                return;
            }
        }
        qk qkVar = null;
        try {
            int r0 = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                qkVar = new qk(str2, r0);
            }
        } catch (NumberFormatException e) {
            tr.d("Unable to parse reward amount.", e);
        }
        this.f3506a.j0(qkVar);
    }
}

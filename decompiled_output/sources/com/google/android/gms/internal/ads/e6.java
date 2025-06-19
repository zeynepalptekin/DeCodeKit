package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.c.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class e6 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final d6 f3219a;

    public e6(d6 d6Var) {
        this.f3219a = d6Var;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get(a.C0190a.f6334b);
        if (str == null) {
            tr.i("App event with no name parameter.");
        } else {
            this.f3219a.Q(str, map.get("info"));
        }
    }
}

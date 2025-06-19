package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.c.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c6 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final b6 f2928a;

    public c6(b6 b6Var) {
        this.f2928a = b6Var;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        if (this.f2928a == null) {
            return;
        }
        String str = map.get(a.C0190a.f6334b);
        if (str == null) {
            tr.h("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleO = null;
        if (map.containsKey("info")) {
            try {
                bundleO = qq.o(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                tr.c("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleO == null) {
            tr.g("Failed to convert ad metadata to Bundle.");
        } else {
            this.f2928a.e(str, bundleO);
        }
    }
}

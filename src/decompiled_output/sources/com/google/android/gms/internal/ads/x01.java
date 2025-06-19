package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class x01 {

    /* renamed from: c, reason: collision with root package name */
    private km1 f5911c = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, uw2> f5910b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List<uw2> f5909a = Collections.synchronizedList(new ArrayList());

    public final List<uw2> a() {
        return this.f5909a;
    }

    public final void b(km1 km1Var, long j, @androidx.annotation.i0 dw2 dw2Var) {
        String str = km1Var.v;
        if (this.f5910b.containsKey(str)) {
            if (this.f5911c == null) {
                this.f5911c = km1Var;
            }
            uw2 uw2Var = this.f5910b.get(str);
            uw2Var.e = j;
            uw2Var.f = dw2Var;
        }
    }

    public final ra0 c() {
        return new ra0(this.f5911c, "", this);
    }

    public final void d(km1 km1Var) {
        String str = km1Var.v;
        if (this.f5910b.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = km1Var.u.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, km1Var.u.getString(next));
            } catch (JSONException unused) {
            }
        }
        uw2 uw2Var = new uw2(km1Var.D, 0L, null, bundle);
        this.f5909a.add(uw2Var);
        this.f5910b.put(str, uw2Var);
    }
}

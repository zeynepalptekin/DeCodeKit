package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public final class uh {

    /* renamed from: a, reason: collision with root package name */
    @Nonnull
    private View f5519a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5520b = new HashMap();

    public final uh c(Map<String, View> map) {
        this.f5520b.clear();
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.f5520b.put(entry.getKey(), new WeakReference<>(value));
            }
        }
        return this;
    }

    public final uh d(View view) {
        this.f5519a = view;
        return this;
    }
}

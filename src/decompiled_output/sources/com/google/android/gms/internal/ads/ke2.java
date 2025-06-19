package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ke2 {
    public static <T> List<T> a(int r1) {
        return r1 == 0 ? Collections.emptyList() : new ArrayList(r1);
    }

    static <T> HashSet<T> b(int r1) {
        return new HashSet<>(d(r1));
    }

    public static <K, V> LinkedHashMap<K, V> c(int r1) {
        return new LinkedHashMap<>(d(r1));
    }

    private static int d(int r1) {
        return r1 < 3 ? r1 + 1 : r1 < 1073741824 ? (int) ((r1 / 0.75f) + 1.0f) : ActivityChooserView.f.j;
    }
}

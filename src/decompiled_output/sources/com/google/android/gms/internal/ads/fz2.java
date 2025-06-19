package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class fz2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3477a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3478b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    public final Map<String, String> f3479c;

    @androidx.annotation.i0
    public final List<bv2> d;
    public final boolean e;
    private final long f;

    private fz2(int r1, byte[] bArr, @androidx.annotation.i0 Map<String, String> map, @androidx.annotation.i0 List<bv2> list, boolean z, long j) {
        this.f3477a = r1;
        this.f3478b = bArr;
        this.f3479c = map;
        this.d = list == null ? null : Collections.unmodifiableList(list);
        this.e = z;
        this.f = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public fz2(int r9, byte[] bArr, @androidx.annotation.i0 Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new bv2(entry.getKey(), entry.getValue()));
            }
        }
        this(r9, bArr, map, arrayList, z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fz2(int r9, byte[] bArr, boolean z, long j, @androidx.annotation.i0 List<bv2> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (bv2 bv2Var : list) {
                treeMap.put(bv2Var.a(), bv2Var.b());
            }
        }
        this(r9, bArr, treeMap, list, z, j);
    }

    @Deprecated
    public fz2(byte[] bArr, @androidx.annotation.i0 Map<String, String> map) {
        this(m.f.f719b, bArr, map, false, 0L);
    }
}

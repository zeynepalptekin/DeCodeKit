package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class h {
    private h() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a(@androidx.annotation.i0 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static <T> List<T> b() {
        return Collections.emptyList();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static <T> List<T> c(@RecentlyNonNull T t) {
        return Collections.singletonList(t);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static <T> List<T> d(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : c(tArr[0]) : b();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <K, V> Map<K, V> e(@RecentlyNonNull K k, @RecentlyNonNull V v, @RecentlyNonNull K k2, @RecentlyNonNull V v2, @RecentlyNonNull K k3, @RecentlyNonNull V v3) {
        Map mapL = l(3, false);
        mapL.put(k, v);
        mapL.put(k2, v2);
        mapL.put(k3, v3);
        return Collections.unmodifiableMap(mapL);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <K, V> Map<K, V> f(@RecentlyNonNull K k, @RecentlyNonNull V v, @RecentlyNonNull K k2, @RecentlyNonNull V v2, @RecentlyNonNull K k3, @RecentlyNonNull V v3, @RecentlyNonNull K k4, @RecentlyNonNull V v4, @RecentlyNonNull K k5, @RecentlyNonNull V v5, @RecentlyNonNull K k6, @RecentlyNonNull V v6) {
        Map mapL = l(6, false);
        mapL.put(k, v);
        mapL.put(k2, v2);
        mapL.put(k3, v3);
        mapL.put(k4, v4);
        mapL.put(k5, v5);
        mapL.put(k6, v6);
        return Collections.unmodifiableMap(mapL);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <K, V> Map<K, V> g(@RecentlyNonNull K[] kArr, @RecentlyNonNull V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            int length2 = vArr.length;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int length3 = kArr.length;
        if (length3 == 0) {
            return Collections.emptyMap();
        }
        if (length3 == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapL = l(kArr.length, false);
        for (int r2 = 0; r2 < kArr.length; r2++) {
            mapL.put(kArr[r2], vArr[r2]);
        }
        return Collections.unmodifiableMap(mapL);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> Set<T> h(@RecentlyNonNull int r1) {
        return r1 == 0 ? new b.f.b() : k(r1, true);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static <T> Set<T> i(@RecentlyNonNull T t, @RecentlyNonNull T t2, @RecentlyNonNull T t3) {
        Set setK = k(3, false);
        setK.add(t);
        setK.add(t2);
        setK.add(t3);
        return Collections.unmodifiableSet(setK);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static <T> Set<T> j(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set setK = k(2, false);
            setK.add(t);
            setK.add(t2);
            return Collections.unmodifiableSet(setK);
        }
        if (length == 3) {
            return i(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setK2 = k(tArr.length, false);
            Collections.addAll(setK2, tArr);
            return Collections.unmodifiableSet(setK2);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set setK3 = k(4, false);
        setK3.add(t3);
        setK3.add(t4);
        setK3.add(t5);
        setK3.add(t6);
        return Collections.unmodifiableSet(setK3);
    }

    private static <T> Set<T> k(int r1, boolean z) {
        return r1 <= (z ? 128 : 256) ? new b.f.b(r1) : new HashSet(r1, z ? 0.75f : 1.0f);
    }

    private static <K, V> Map<K, V> l(int r1, boolean z) {
        return r1 <= 256 ? new b.f.a(r1) : new HashMap(r1, 1.0f);
    }
}

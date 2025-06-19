package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class q {

    @com.google.android.gms.common.annotation.a
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f2541a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f2542b;

        private a(Object obj) {
            this.f2542b = r.k(obj);
            this.f2541a = new ArrayList();
        }

        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public final a a(@RecentlyNonNull String str, @androidx.annotation.i0 Object obj) {
            List<String> list = this.f2541a;
            String str2 = (String) r.k(str);
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strValueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f2542b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f2541a.size();
            for (int r2 = 0; r2 < size; r2++) {
                sb.append(this.f2541a.get(r2));
                if (r2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private q() {
        throw new AssertionError("Uninstantiable");
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean b(@androidx.annotation.i0 Object obj, @androidx.annotation.i0 Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int c(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a d(@RecentlyNonNull Object obj) {
        return new a(obj);
    }
}

package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class z {
    private z() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static Set<Scope> a(@RecentlyNonNull Collection<String> collection) {
        com.google.android.gms.common.internal.r.l(collection, "scopeStrings can't be null.");
        return b((String[]) collection.toArray(new String[collection.size()]));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static Set<Scope> b(@RecentlyNonNull String... strArr) {
        com.google.android.gms.common.internal.r.l(strArr, "scopeStrings can't be null.");
        HashSet hashSet = new HashSet(strArr.length);
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(new Scope(str));
            }
        }
        return hashSet;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String[] c(@RecentlyNonNull Set<Scope> set) {
        com.google.android.gms.common.internal.r.l(set, "scopes can't be null.");
        return d((Scope[]) set.toArray(new Scope[set.size()]));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String[] d(@RecentlyNonNull Scope[] scopeArr) {
        com.google.android.gms.common.internal.r.l(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int r1 = 0; r1 < scopeArr.length; r1++) {
            strArr[r1] = scopeArr[r1].h();
        }
        return strArr;
    }
}

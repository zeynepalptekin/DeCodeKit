package com.google.android.gms.common.stats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.z.a implements ReflectedParcelable {

    @com.google.android.gms.common.annotation.a
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public static final int f2557a = 7;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public static final int f2558b = 8;
    }

    @RecentlyNonNull
    public abstract long h();

    @RecentlyNonNull
    public abstract int i();

    @RecentlyNonNull
    public abstract long j();

    @RecentlyNonNull
    public abstract String l();

    @RecentlyNonNull
    public String toString() {
        long jH = h();
        int i = i();
        long j = j();
        String strL = l();
        StringBuilder sb = new StringBuilder(String.valueOf(strL).length() + 53);
        sb.append(jH);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(j);
        sb.append(strL);
        return sb.toString();
    }
}

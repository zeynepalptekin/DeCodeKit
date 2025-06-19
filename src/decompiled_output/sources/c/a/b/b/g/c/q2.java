package c.a.b.b.g.c;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1795a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f1796b;

    /* renamed from: c, reason: collision with root package name */
    final String f1797c;
    final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    @Nullable
    private final a3<Context, Boolean> i;

    public q2(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private q2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable a3<Context, Boolean> a3Var) {
        this.f1795a = null;
        this.f1796b = uri;
        this.f1797c = str2;
        this.d = str3;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = null;
    }

    public final l2<Double> a(String str, double d) {
        return l2.i(this, str, -3.0d, true);
    }

    public final l2<Long> b(String str, long j) {
        return l2.j(this, str, j, true);
    }

    public final l2<String> c(String str, String str2) {
        return l2.k(this, str, str2, true);
    }

    public final l2<Boolean> d(String str, boolean z) {
        return l2.l(this, str, z, true);
    }
}

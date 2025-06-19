package c.a.a;

import android.content.Context;
import androidx.recyclerview.widget.m;
import com.google.android.gms.ads.f;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f1585b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1586c = -2;
    public static final int d = 32;
    public static final int e = 50;
    public static final int f = 90;
    public static final b g = new b(-1, -2, "mb");
    public static final b h = new b(320, 50, "mb");
    public static final b i = new b(300, m.f.f720c, "as");
    public static final b j = new b(468, 60, "as");
    public static final b k = new b(728, 90, "as");
    public static final b l = new b(160, 600, "as");

    /* renamed from: a, reason: collision with root package name */
    private final f f1587a;

    public b(int r2, int r3) {
        this(new f(r2, r3));
    }

    private b(int r1, int r2, String str) {
        this(new f(r1, r2));
    }

    public b(f fVar) {
        this.f1587a = fVar;
    }

    public final b a(b... bVarArr) {
        b bVar = null;
        if (bVarArr == null) {
            return null;
        }
        float f2 = 0.0f;
        int r2 = d();
        int r3 = b();
        for (b bVar2 : bVarArr) {
            if (i(bVar2.d(), bVar2.b())) {
                float f3 = (r7 * r8) / (r2 * r3);
                if (f3 > 1.0f) {
                    f3 = 1.0f / f3;
                }
                if (f3 > f2) {
                    bVar = bVar2;
                    f2 = f3;
                }
            }
        }
        return bVar;
    }

    public final int b() {
        return this.f1587a.d();
    }

    public final int c(Context context) {
        return this.f1587a.e(context);
    }

    public final int d() {
        return this.f1587a.l();
    }

    public final int e(Context context) {
        return this.f1587a.m(context);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f1587a.equals(((b) obj).f1587a);
        }
        return false;
    }

    public final boolean f() {
        return this.f1587a.n();
    }

    public final boolean g() {
        return false;
    }

    public final boolean h() {
        return this.f1587a.p();
    }

    public final int hashCode() {
        return this.f1587a.hashCode();
    }

    public final boolean i(int r5, int r6) {
        int r0 = d();
        int r1 = b();
        float f2 = r5;
        float f3 = r0;
        if (f2 > f3 * 1.25f || f2 < f3 * 0.8f) {
            return false;
        }
        float f4 = r6;
        float f5 = r1;
        return f4 <= 1.25f * f5 && f4 >= f5 * 0.8f;
    }

    public final String toString() {
        return this.f1587a.toString();
    }
}

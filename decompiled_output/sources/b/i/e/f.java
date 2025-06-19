package b.i.e;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.h0;
import androidx.annotation.m0;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public final class f {

    @h0
    public static final f e = new f(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1016c;
    public final int d;

    private f(int r1, int r2, int r3, int r4) {
        this.f1014a = r1;
        this.f1015b = r2;
        this.f1016c = r3;
        this.d = r4;
    }

    @h0
    public static f a(int r1, int r2, int r3, int r4) {
        return (r1 == 0 && r2 == 0 && r3 == 0 && r4 == 0) ? e : new f(r1, r2, r3, r4);
    }

    @h0
    public static f b(@h0 Rect rect) {
        return a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @m0(api = 29)
    @h0
    public static f c(@h0 Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    @m0(api = 29)
    @Deprecated
    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static f e(@h0 Insets insets) {
        return c(insets);
    }

    @m0(api = 29)
    @h0
    public Insets d() {
        return Insets.of(this.f1014a, this.f1015b, this.f1016c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.d == fVar.d && this.f1014a == fVar.f1014a && this.f1016c == fVar.f1016c && this.f1015b == fVar.f1015b;
    }

    public int hashCode() {
        return (((((this.f1014a * 31) + this.f1015b) * 31) + this.f1016c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.f1014a + ", top=" + this.f1015b + ", right=" + this.f1016c + ", bottom=" + this.d + '}';
    }
}

package b.i.e;

import android.graphics.PointF;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f1025a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1026b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f1027c;
    private final float d;

    public i(@h0 PointF pointF, float f, @h0 PointF pointF2, float f2) {
        this.f1025a = (PointF) b.i.o.i.g(pointF, "start == null");
        this.f1026b = f;
        this.f1027c = (PointF) b.i.o.i.g(pointF2, "end == null");
        this.d = f2;
    }

    @h0
    public PointF a() {
        return this.f1027c;
    }

    public float b() {
        return this.d;
    }

    @h0
    public PointF c() {
        return this.f1025a;
    }

    public float d() {
        return this.f1026b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f1026b, iVar.f1026b) == 0 && Float.compare(this.d, iVar.d) == 0 && this.f1025a.equals(iVar.f1025a) && this.f1027c.equals(iVar.f1027c);
    }

    public int hashCode() {
        int r0 = this.f1025a.hashCode() * 31;
        float f = this.f1026b;
        int r02 = (((r0 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f1027c.hashCode()) * 31;
        float f2 = this.d;
        return r02 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f1025a + ", startFraction=" + this.f1026b + ", end=" + this.f1027c + ", endFraction=" + this.d + '}';
    }
}

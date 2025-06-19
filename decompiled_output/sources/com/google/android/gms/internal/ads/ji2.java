package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ji2 {
    public static final ji2 d = new ji2(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3968a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3969b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3970c;

    public ji2(float f, float f2) {
        this.f3968a = f;
        this.f3969b = f2;
        this.f3970c = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * this.f3970c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ji2.class == obj.getClass()) {
            ji2 ji2Var = (ji2) obj;
            if (this.f3968a == ji2Var.f3968a && this.f3969b == ji2Var.f3969b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f3968a) + 527) * 31) + Float.floatToRawIntBits(this.f3969b);
    }
}

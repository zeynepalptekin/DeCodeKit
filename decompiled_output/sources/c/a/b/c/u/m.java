package c.a.b.c.u;

import android.graphics.RectF;
import androidx.annotation.h0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f2021a;

    public m(@androidx.annotation.r(from = 0.0d, to = 1.0d) float f) {
        this.f2021a = f;
    }

    @Override // c.a.b.c.u.d
    public float a(@h0 RectF rectF) {
        return this.f2021a * rectF.height();
    }

    @androidx.annotation.r(from = 0.0d, to = 1.0d)
    public float b() {
        return this.f2021a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f2021a == ((m) obj).f2021a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2021a)});
    }
}

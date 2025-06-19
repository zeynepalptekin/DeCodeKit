package c.a.b.c.u;

import android.graphics.RectF;
import androidx.annotation.h0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f2005a;

    public a(float f) {
        this.f2005a = f;
    }

    @Override // c.a.b.c.u.d
    public float a(@h0 RectF rectF) {
        return this.f2005a;
    }

    public float b() {
        return this.f2005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2005a == ((a) obj).f2005a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2005a)});
    }
}

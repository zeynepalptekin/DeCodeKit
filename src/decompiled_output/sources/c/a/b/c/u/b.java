package c.a.b.c.u;

import android.graphics.RectF;
import androidx.annotation.h0;
import androidx.annotation.p0;
import java.util.Arrays;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f2006a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2007b;

    public b(float f, @h0 d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f2006a;
            f += ((b) dVar).f2007b;
        }
        this.f2006a = dVar;
        this.f2007b = f;
    }

    @Override // c.a.b.c.u.d
    public float a(@h0 RectF rectF) {
        return Math.max(0.0f, this.f2006a.a(rectF) + this.f2007b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2006a.equals(bVar.f2006a) && this.f2007b == bVar.f2007b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2006a, Float.valueOf(this.f2007b)});
    }
}

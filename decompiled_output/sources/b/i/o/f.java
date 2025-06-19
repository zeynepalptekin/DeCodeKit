package b.i.o;

import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class f<F, S> {

    /* renamed from: a, reason: collision with root package name */
    @i0
    public final F f1147a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    public final S f1148b;

    public f(@i0 F f, @i0 S s) {
        this.f1147a = f;
        this.f1148b = s;
    }

    @h0
    public static <A, B> f<A, B> a(@i0 A a2, @i0 B b2) {
        return new f<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.a(fVar.f1147a, this.f1147a) && e.a(fVar.f1148b, this.f1148b);
    }

    public int hashCode() {
        F f = this.f1147a;
        int r0 = f == null ? 0 : f.hashCode();
        S s = this.f1148b;
        return r0 ^ (s != null ? s.hashCode() : 0);
    }

    @h0
    public String toString() {
        return "Pair{" + String.valueOf(this.f1147a) + " " + String.valueOf(this.f1148b) + "}";
    }
}

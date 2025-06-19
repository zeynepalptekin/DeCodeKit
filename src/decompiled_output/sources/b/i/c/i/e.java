package b.i.c.i;

import androidx.annotation.p0;
import androidx.annotation.y0;
import java.util.ArrayList;
import java.util.List;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class e<T> {

    @p0({p0.a.LIBRARY})
    public static class a extends e<Void> {
        @Override // b.i.c.i.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<d> list) {
            return null;
        }

        @Override // b.i.c.i.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // b.i.c.i.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @androidx.annotation.d
    public abstract T a(List<d> list);

    @y0
    public List<d> b() throws Exception {
        return new ArrayList();
    }

    @androidx.annotation.d
    public abstract T c();

    @androidx.annotation.d
    public abstract T d(List<String> list);
}

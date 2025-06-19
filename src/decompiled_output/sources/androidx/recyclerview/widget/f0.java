package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
class f0<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f640a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a<T>> f641b = new SparseArray<>(10);

    /* renamed from: c, reason: collision with root package name */
    a<T> f642c;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f643a;

        /* renamed from: b, reason: collision with root package name */
        public int f644b;

        /* renamed from: c, reason: collision with root package name */
        public int f645c;
        a<T> d;

        public a(Class<T> cls, int r2) {
            this.f643a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, r2));
        }

        boolean a(int r3) {
            int r0 = this.f644b;
            return r0 <= r3 && r3 < r0 + this.f645c;
        }

        T b(int r3) {
            return this.f643a[r3 - this.f644b];
        }
    }

    public f0(int r3) {
        this.f640a = r3;
    }

    public a<T> a(a<T> aVar) {
        int r0 = this.f641b.indexOfKey(aVar.f644b);
        if (r0 < 0) {
            this.f641b.put(aVar.f644b, aVar);
            return null;
        }
        a<T> aVarValueAt = this.f641b.valueAt(r0);
        this.f641b.setValueAt(r0, aVar);
        if (this.f642c == aVarValueAt) {
            this.f642c = aVar;
        }
        return aVarValueAt;
    }

    public void b() {
        this.f641b.clear();
    }

    public a<T> c(int r2) {
        return this.f641b.valueAt(r2);
    }

    public T d(int r3) {
        a<T> aVar = this.f642c;
        if (aVar == null || !aVar.a(r3)) {
            int r0 = this.f641b.indexOfKey(r3 - (r3 % this.f640a));
            if (r0 < 0) {
                return null;
            }
            this.f642c = this.f641b.valueAt(r0);
        }
        return this.f642c.b(r3);
    }

    public a<T> e(int r3) {
        a<T> aVar = this.f641b.get(r3);
        if (this.f642c == aVar) {
            this.f642c = null;
        }
        this.f641b.delete(r3);
        return aVar;
    }

    public int f() {
        return this.f641b.size();
    }
}

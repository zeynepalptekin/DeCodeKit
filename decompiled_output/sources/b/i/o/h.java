package b.i.o;

import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class h {

    public interface a<T> {
        boolean a(@h0 T t);

        @i0
        T b();
    }

    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f1152a;

        /* renamed from: b, reason: collision with root package name */
        private int f1153b;

        public b(int r2) {
            if (r2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1152a = new Object[r2];
        }

        private boolean c(@h0 T t) {
            for (int r1 = 0; r1 < this.f1153b; r1++) {
                if (this.f1152a[r1] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.i.o.h.a
        public boolean a(@h0 T t) {
            if (c(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int r0 = this.f1153b;
            Object[] objArr = this.f1152a;
            if (r0 >= objArr.length) {
                return false;
            }
            objArr[r0] = t;
            this.f1153b = r0 + 1;
            return true;
        }

        @Override // b.i.o.h.a
        public T b() {
            int r0 = this.f1153b;
            if (r0 <= 0) {
                return null;
            }
            int r2 = r0 - 1;
            Object[] objArr = this.f1152a;
            T t = (T) objArr[r2];
            objArr[r2] = null;
            this.f1153b = r0 - 1;
            return t;
        }
    }

    public static class c<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        private final Object f1154c;

        public c(int r1) {
            super(r1);
            this.f1154c = new Object();
        }

        @Override // b.i.o.h.b, b.i.o.h.a
        public boolean a(@h0 T t) {
            boolean zA;
            synchronized (this.f1154c) {
                zA = super.a(t);
            }
            return zA;
        }

        @Override // b.i.o.h.b, b.i.o.h.a
        public T b() {
            T t;
            synchronized (this.f1154c) {
                t = (T) super.b();
            }
            return t;
        }
    }

    private h() {
    }
}

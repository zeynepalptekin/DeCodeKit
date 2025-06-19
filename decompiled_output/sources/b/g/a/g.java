package b.g.a;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f915a = false;

    interface a<T> {
        boolean a(T t);

        T b();

        void c(T[] tArr, int r2);
    }

    static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f916a;

        /* renamed from: b, reason: collision with root package name */
        private int f917b;

        b(int r2) {
            if (r2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f916a = new Object[r2];
        }

        private boolean d(T t) {
            for (int r1 = 0; r1 < this.f917b; r1++) {
                if (this.f916a[r1] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.g.a.g.a
        public boolean a(T t) {
            int r0 = this.f917b;
            Object[] objArr = this.f916a;
            if (r0 >= objArr.length) {
                return false;
            }
            objArr[r0] = t;
            this.f917b = r0 + 1;
            return true;
        }

        @Override // b.g.a.g.a
        public T b() {
            int r0 = this.f917b;
            if (r0 <= 0) {
                return null;
            }
            int r2 = r0 - 1;
            Object[] objArr = this.f916a;
            T t = (T) objArr[r2];
            objArr[r2] = null;
            this.f917b = r0 - 1;
            return t;
        }

        @Override // b.g.a.g.a
        public void c(T[] tArr, int r7) {
            if (r7 > tArr.length) {
                r7 = tArr.length;
            }
            for (int r0 = 0; r0 < r7; r0++) {
                T t = tArr[r0];
                int r2 = this.f917b;
                Object[] objArr = this.f916a;
                if (r2 < objArr.length) {
                    objArr[r2] = t;
                    this.f917b = r2 + 1;
                }
            }
        }
    }

    private g() {
    }
}

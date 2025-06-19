package androidx.recyclerview.widget;

import androidx.recyclerview.widget.f0;

/* loaded from: classes.dex */
interface e0<T> {

    public interface a<T> {
        void a(f0.a<T> aVar);

        void b(int r1, int r2, int r3, int r4, int r5);

        void c(int r1, int r2);

        void d(int r1);
    }

    public interface b<T> {
        void a(int r1, int r2);

        void b(int r1, f0.a<T> aVar);

        void c(int r1, int r2);
    }

    a<T> a(a<T> aVar);

    b<T> b(b<T> bVar);
}

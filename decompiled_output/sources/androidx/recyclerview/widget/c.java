package androidx.recyclerview.widget;

import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final Executor f617a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.h0
    private final Executor f618b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.h0
    private final i.d<T> f619c;

    public static final class a<T> {
        private static final Object d = new Object();
        private static Executor e;

        /* renamed from: a, reason: collision with root package name */
        @i0
        private Executor f620a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f621b;

        /* renamed from: c, reason: collision with root package name */
        private final i.d<T> f622c;

        public a(@androidx.annotation.h0 i.d<T> dVar) {
            this.f622c = dVar;
        }

        @androidx.annotation.h0
        public c<T> a() {
            if (this.f621b == null) {
                synchronized (d) {
                    if (e == null) {
                        e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f621b = e;
            }
            return new c<>(this.f620a, this.f621b, this.f622c);
        }

        @androidx.annotation.h0
        public a<T> b(Executor executor) {
            this.f621b = executor;
            return this;
        }

        @androidx.annotation.h0
        @p0({p0.a.LIBRARY})
        public a<T> c(Executor executor) {
            this.f620a = executor;
            return this;
        }
    }

    c(@i0 Executor executor, @androidx.annotation.h0 Executor executor2, @androidx.annotation.h0 i.d<T> dVar) {
        this.f617a = executor;
        this.f618b = executor2;
        this.f619c = dVar;
    }

    @androidx.annotation.h0
    public Executor a() {
        return this.f618b;
    }

    @androidx.annotation.h0
    public i.d<T> b() {
        return this.f619c;
    }

    @i0
    @p0({p0.a.LIBRARY})
    public Executor c() {
        return this.f617a;
    }
}

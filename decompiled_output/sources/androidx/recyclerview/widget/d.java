package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d<T> {
    private static final Executor h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final t f626a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f627b;

    /* renamed from: c, reason: collision with root package name */
    Executor f628c;
    private final List<b<T>> d;

    @i0
    private List<T> e;

    @androidx.annotation.h0
    private List<T> f;
    int g;

    class a implements Runnable {
        final /* synthetic */ List d;
        final /* synthetic */ List e;
        final /* synthetic */ int f;
        final /* synthetic */ Runnable g;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0033a extends i.b {
            C0033a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.i.b
            public boolean a(int r2, int r3) {
                Object obj = a.this.d.get(r2);
                Object obj2 = a.this.e.get(r3);
                if (obj != null && obj2 != null) {
                    return d.this.f627b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.i.b
            public boolean b(int r2, int r3) {
                Object obj = a.this.d.get(r2);
                Object obj2 = a.this.e.get(r3);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f627b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.i.b
            @i0
            public Object c(int r2, int r3) {
                Object obj = a.this.d.get(r2);
                Object obj2 = a.this.e.get(r3);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f627b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.i.b
            public int d() {
                return a.this.e.size();
            }

            @Override // androidx.recyclerview.widget.i.b
            public int e() {
                return a.this.d.size();
            }
        }

        class b implements Runnable {
            final /* synthetic */ i.c d;

            b(i.c cVar) {
                this.d = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.g == aVar.f) {
                    dVar.c(aVar.e, this.d, aVar.g);
                }
            }
        }

        a(List list, List list2, int r4, Runnable runnable) {
            this.d = list;
            this.e = list2;
            this.f = r4;
            this.g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f628c.execute(new b(i.a(new C0033a())));
        }
    }

    public interface b<T> {
        void a(@androidx.annotation.h0 List<T> list, @androidx.annotation.h0 List<T> list2);
    }

    private static class c implements Executor {
        final Handler d = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.h0 Runnable runnable) {
            this.d.post(runnable);
        }
    }

    public d(@androidx.annotation.h0 RecyclerView.g gVar, @androidx.annotation.h0 i.d<T> dVar) {
        this(new androidx.recyclerview.widget.b(gVar), new c.a(dVar).a());
    }

    public d(@androidx.annotation.h0 t tVar, @androidx.annotation.h0 androidx.recyclerview.widget.c<T> cVar) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.emptyList();
        this.f626a = tVar;
        this.f627b = cVar;
        this.f628c = cVar.c() != null ? cVar.c() : h;
    }

    private void d(@androidx.annotation.h0 List<T> list, @i0 Runnable runnable) {
        Iterator<b<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@androidx.annotation.h0 b<T> bVar) {
        this.d.add(bVar);
    }

    @androidx.annotation.h0
    public List<T> b() {
        return this.f;
    }

    void c(@androidx.annotation.h0 List<T> list, @androidx.annotation.h0 i.c cVar, @i0 Runnable runnable) {
        List<T> list2 = this.f;
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        cVar.f(this.f626a);
        d(list2, runnable);
    }

    public void e(@androidx.annotation.h0 b<T> bVar) {
        this.d.remove(bVar);
    }

    public void f(@i0 List<T> list) {
        g(list, null);
    }

    public void g(@i0 List<T> list, @i0 Runnable runnable) {
        int r5 = this.g + 1;
        this.g = r5;
        List<T> list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.emptyList();
            this.f626a.a(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f627b.a().execute(new a(list2, list, r5, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        this.f626a.c(0, list.size());
        d(list3, runnable);
    }
}

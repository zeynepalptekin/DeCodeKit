package b.b.a.b;

import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.util.concurrent.Executor;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f837c;

    @h0
    private static final Executor d = new ExecutorC0042a();

    @h0
    private static final Executor e = new b();

    /* renamed from: a, reason: collision with root package name */
    @h0
    private c f838a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private c f839b;

    /* renamed from: b.b.a.b.a$a, reason: collision with other inner class name */
    static class ExecutorC0042a implements Executor {
        ExecutorC0042a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    private a() {
        b.b.a.b.b bVar = new b.b.a.b.b();
        this.f839b = bVar;
        this.f838a = bVar;
    }

    @h0
    public static Executor e() {
        return e;
    }

    @h0
    public static a f() {
        if (f837c != null) {
            return f837c;
        }
        synchronized (a.class) {
            if (f837c == null) {
                f837c = new a();
            }
        }
        return f837c;
    }

    @h0
    public static Executor g() {
        return d;
    }

    @Override // b.b.a.b.c
    public void a(Runnable runnable) {
        this.f838a.a(runnable);
    }

    @Override // b.b.a.b.c
    public boolean c() {
        return this.f838a.c();
    }

    @Override // b.b.a.b.c
    public void d(Runnable runnable) {
        this.f838a.d(runnable);
    }

    public void h(@i0 c cVar) {
        if (cVar == null) {
            cVar = this.f839b;
        }
        this.f838a = cVar;
    }
}

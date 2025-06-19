package b.g.a.i;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q {

    /* renamed from: c, reason: collision with root package name */
    public static final int f951c = 0;
    public static final int d = 1;
    public static final int e = 2;

    /* renamed from: a, reason: collision with root package name */
    HashSet<q> f952a = new HashSet<>(2);

    /* renamed from: b, reason: collision with root package name */
    int f953b = 0;

    public void a(q qVar) {
        this.f952a.add(qVar);
    }

    public void b() {
        this.f953b = 1;
        Iterator<q> it = this.f952a.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public void c() {
        this.f953b = 0;
        Iterator<q> it = this.f952a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void d() {
        if (this instanceof o) {
            this.f953b = 0;
        }
        Iterator<q> it = this.f952a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public boolean e() {
        return this.f953b == 1;
    }

    public void f(p pVar) {
    }

    public void g() {
        this.f953b = 0;
        this.f952a.clear();
    }

    public void h() {
    }
}

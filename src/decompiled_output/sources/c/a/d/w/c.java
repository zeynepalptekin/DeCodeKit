package c.a.d.w;

import com.google.firebase.components.p;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final String f2201a;

    /* renamed from: b, reason: collision with root package name */
    private final d f2202b;

    c(Set<f> set, d dVar) {
        this.f2201a = d(set);
        this.f2202b = dVar;
    }

    public static com.google.firebase.components.f<h> b() {
        return com.google.firebase.components.f.a(h.class).b(p.i(f.class)).f(b.b()).d();
    }

    static /* synthetic */ h c(com.google.firebase.components.g gVar) {
        return new c(gVar.b(f.class), d.a());
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // c.a.d.w.h
    public String a() {
        if (this.f2202b.b().isEmpty()) {
            return this.f2201a;
        }
        return this.f2201a + ' ' + d(this.f2202b.b());
    }
}

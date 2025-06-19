package c.a.d.w;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f2203b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f2204a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f2203b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f2203b;
                if (dVar == null) {
                    dVar = new d();
                    f2203b = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f2204a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f2204a);
        }
        return setUnmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.f2204a) {
            this.f2204a.add(f.a(str, str2));
        }
    }
}

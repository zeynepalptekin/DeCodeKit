package c.a.e.a0.q;

import c.a.e.a0.f;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f2294a;

    static {
        f2294a = f.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f2294a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}

package c.a.d.o;

import com.google.firebase.components.w;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f2188a;

    /* renamed from: b, reason: collision with root package name */
    private final T f2189b;

    public a(Class<T> cls, T t) {
        this.f2188a = (Class) w.b(cls);
        this.f2189b = (T) w.b(t);
    }

    public T a() {
        return this.f2189b;
    }

    public Class<T> b() {
        return this.f2188a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f2188a, this.f2189b);
    }
}

package c.a.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Field f2300a;

    public c(Field field) {
        c.a.e.a0.a.b(field);
        this.f2300a = field;
    }

    Object a(Object obj) throws IllegalAccessException {
        return this.f2300a.get(obj);
    }

    public <T extends Annotation> T b(Class<T> cls) {
        return (T) this.f2300a.getAnnotation(cls);
    }

    public Collection<Annotation> c() {
        return Arrays.asList(this.f2300a.getAnnotations());
    }

    public Class<?> d() {
        return this.f2300a.getType();
    }

    public Type e() {
        return this.f2300a.getGenericType();
    }

    public Class<?> f() {
        return this.f2300a.getDeclaringClass();
    }

    public String g() {
        return this.f2300a.getName();
    }

    public boolean h(int r2) {
        return (r2 & this.f2300a.getModifiers()) != 0;
    }

    boolean i() {
        return this.f2300a.isSynthetic();
    }
}

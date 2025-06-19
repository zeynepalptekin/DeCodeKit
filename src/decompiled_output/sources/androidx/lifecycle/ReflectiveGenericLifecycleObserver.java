package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f498a;

    /* renamed from: b, reason: collision with root package name */
    private final b.a f499b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f498a = obj;
        this.f499b = b.f502c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.h
    public void d(j jVar, g.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f499b.a(jVar, aVar, this.f498a);
    }
}

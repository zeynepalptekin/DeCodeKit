package c.a.e.a0.p;

import c.a.e.a0.p.i;
import c.a.e.x;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
final class m<T> extends x<T> {

    /* renamed from: a, reason: collision with root package name */
    private final c.a.e.f f2276a;

    /* renamed from: b, reason: collision with root package name */
    private final x<T> f2277b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f2278c;

    m(c.a.e.f fVar, x<T> xVar, Type type) {
        this.f2276a = fVar;
        this.f2277b = xVar;
        this.f2278c = type;
    }

    private Type j(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // c.a.e.x
    public T e(c.a.e.c0.a aVar) throws IOException {
        return this.f2277b.e(aVar);
    }

    @Override // c.a.e.x
    public void i(c.a.e.c0.d dVar, T t) throws IOException {
        x<T> xVarP = this.f2277b;
        Type typeJ = j(this.f2278c, t);
        if (typeJ != this.f2278c) {
            xVarP = this.f2276a.p(c.a.e.b0.a.c(typeJ));
            if (xVarP instanceof i.b) {
                x<T> xVar = this.f2277b;
                if (!(xVar instanceof i.b)) {
                    xVarP = xVar;
                }
            }
        }
        xVarP.i(dVar, t);
    }
}

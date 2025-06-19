package c.a.e.a0.p;

import c.a.e.t;
import c.a.e.x;
import c.a.e.y;

/* loaded from: classes.dex */
public final class d implements y {
    private final c.a.e.a0.c d;

    public d(c.a.e.a0.c cVar) {
        this.d = cVar;
    }

    x<?> a(c.a.e.a0.c cVar, c.a.e.f fVar, c.a.e.b0.a<?> aVar, c.a.e.z.b bVar) {
        x<?> lVar;
        Object objA = cVar.a(c.a.e.b0.a.b(bVar.value())).a();
        if (objA instanceof x) {
            lVar = (x) objA;
        } else if (objA instanceof y) {
            lVar = ((y) objA).b(fVar, aVar);
        } else {
            boolean z = objA instanceof t;
            if (!z && !(objA instanceof c.a.e.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z ? (t) objA : null, objA instanceof c.a.e.k ? (c.a.e.k) objA : null, fVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.d();
    }

    @Override // c.a.e.y
    public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
        c.a.e.z.b bVar = (c.a.e.z.b) aVar.f().getAnnotation(c.a.e.z.b.class);
        if (bVar == null) {
            return null;
        }
        return (x<T>) a(this.d, fVar, aVar, bVar);
    }
}

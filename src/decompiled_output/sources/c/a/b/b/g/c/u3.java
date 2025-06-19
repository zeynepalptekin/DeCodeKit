package c.a.b.b.g.c;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
final class u3<K> extends y3<K> {
    private final /* synthetic */ r3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u3(r3 r3Var) {
        super(r3Var, null);
        this.h = r3Var;
    }

    @Override // c.a.b.b.g.c.y3
    final K b(int r2) {
        return (K) this.h.f[r2];
    }
}

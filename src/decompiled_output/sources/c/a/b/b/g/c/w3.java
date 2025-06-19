package c.a.b.b.g.c;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
final class w3<V> extends y3<V> {
    private final /* synthetic */ r3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w3(r3 r3Var) {
        super(r3Var, null);
        this.h = r3Var;
    }

    @Override // c.a.b.b.g.c.y3
    final V b(int r2) {
        return (V) this.h.g[r2];
    }
}

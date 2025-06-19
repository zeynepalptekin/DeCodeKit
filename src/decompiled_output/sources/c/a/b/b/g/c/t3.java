package c.a.b.b.g.c;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class t3<K, V> extends y3<Map.Entry<K, V>> {
    private final /* synthetic */ r3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t3(r3 r3Var) {
        super(r3Var, null);
        this.h = r3Var;
    }

    @Override // c.a.b.b.g.c.y3
    final /* synthetic */ Object b(int r3) {
        return new a4(this.h, r3);
    }
}

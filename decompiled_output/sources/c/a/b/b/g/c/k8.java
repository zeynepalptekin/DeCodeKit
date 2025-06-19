package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class k8 implements s8 {

    /* renamed from: a, reason: collision with root package name */
    private s8[] f1743a;

    k8(s8... s8VarArr) {
        this.f1743a = s8VarArr;
    }

    @Override // c.a.b.b.g.c.s8
    public final boolean a(Class<?> cls) {
        for (s8 s8Var : this.f1743a) {
            if (s8Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.a.b.b.g.c.s8
    public final p8 b(Class<?> cls) {
        for (s8 s8Var : this.f1743a) {
            if (s8Var.a(cls)) {
                return s8Var.b(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}

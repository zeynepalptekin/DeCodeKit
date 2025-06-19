package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qa2 implements ya2 {

    /* renamed from: a, reason: collision with root package name */
    private ya2[] f4976a;

    qa2(ya2... ya2VarArr) {
        this.f4976a = ya2VarArr;
    }

    @Override // com.google.android.gms.internal.ads.ya2
    public final boolean a(Class<?> cls) {
        for (ya2 ya2Var : this.f4976a) {
            if (ya2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ya2
    public final va2 b(Class<?> cls) {
        for (ya2 ya2Var : this.f4976a) {
            if (ya2Var.a(cls)) {
                return ya2Var.b(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}

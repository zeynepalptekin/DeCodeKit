package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
final class n92 implements ya2 {

    /* renamed from: a, reason: collision with root package name */
    private static final n92 f4509a = new n92();

    private n92() {
    }

    public static n92 c() {
        return f4509a;
    }

    @Override // com.google.android.gms.internal.ads.ya2
    public final boolean a(Class<?> cls) {
        return l92.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.ya2
    public final va2 b(Class<?> cls) {
        if (!l92.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (va2) l92.G(cls.asSubclass(l92.class)).t(l92.e.f4227c, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}

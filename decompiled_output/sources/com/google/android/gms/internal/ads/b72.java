package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class b72 extends ThreadLocal<SecureRandom> {
    b72() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return c72.a();
    }
}

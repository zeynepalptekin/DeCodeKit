package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class v9 implements b4 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6544a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t9 f6545b;

    v9(t9 t9Var, String str) {
        this.f6545b = t9Var;
        this.f6544a = str;
    }

    @Override // com.google.android.gms.measurement.internal.b4
    public final void a(String str, int r2, Throwable th, byte[] bArr, Map<String, List<String>> map) throws IllegalStateException {
        this.f6545b.i(r2, th, bArr, this.f6544a);
    }
}

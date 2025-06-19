package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
public final class a62 implements az1 {
    private static final byte[] g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f2637a;

    /* renamed from: b, reason: collision with root package name */
    private final c62 f2638b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2639c;
    private final byte[] d;
    private final i62 e;
    private final b62 f;

    public a62(ECPrivateKey eCPrivateKey, byte[] bArr, String str, i62 i62Var, b62 b62Var) throws GeneralSecurityException {
        this.f2637a = eCPrivateKey;
        this.f2638b = new c62(eCPrivateKey);
        this.d = bArr;
        this.f2639c = str;
        this.e = i62Var;
        this.f = b62Var;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class a72 extends ThreadLocal<Mac> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x62 f2647a;

    a72(x62 x62Var) {
        this.f2647a = x62Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac macA = l62.g.a(this.f2647a.f5943b);
            macA.init(this.f2647a.f5944c);
            return macA;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xa2;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class iz1<KeyFormatProtoT extends xa2, KeyT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyFormatProtoT> f3891a;

    public iz1(Class<KeyFormatProtoT> cls) {
        this.f3891a = cls;
    }

    public final Class<KeyFormatProtoT> a() {
        return this.f3891a;
    }

    public abstract void b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyT c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT d(a82 a82Var) throws w92;
}

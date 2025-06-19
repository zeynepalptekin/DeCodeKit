package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xa2;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class gz1<KeyFormatProtoT extends xa2, KeyProtoT extends xa2> {

    /* renamed from: a, reason: collision with root package name */
    private final iz1<KeyFormatProtoT, KeyProtoT> f3599a;

    gz1(iz1<KeyFormatProtoT, KeyProtoT> iz1Var) {
        this.f3599a = iz1Var;
    }

    final KeyProtoT a(a82 a82Var) throws w92, GeneralSecurityException {
        xa2 xa2VarD = this.f3599a.d(a82Var);
        this.f3599a.b(xa2VarD);
        return this.f3599a.c(xa2VarD);
    }
}

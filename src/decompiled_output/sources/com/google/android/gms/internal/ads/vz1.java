package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xa2;

/* loaded from: classes.dex */
public abstract class vz1<KeyProtoT extends xa2, PublicKeyProtoT extends xa2> extends jz1<KeyProtoT> {
    private final Class<PublicKeyProtoT> d;

    @SafeVarargs
    protected vz1(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, lz1<?, KeyProtoT>... lz1VarArr) {
        super(cls, lz1VarArr);
        this.d = cls2;
    }
}

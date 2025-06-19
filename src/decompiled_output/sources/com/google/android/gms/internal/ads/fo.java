package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class fo {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private BigInteger f3423a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private String f3424b = "0";

    public final synchronized String a() {
        String string;
        string = this.f3423a.toString();
        this.f3423a = this.f3423a.add(BigInteger.ONE);
        this.f3424b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f3424b;
    }
}

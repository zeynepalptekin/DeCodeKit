package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class x61 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, ye> f5940a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final fs0 f5941b;

    public x61(fs0 fs0Var) {
        this.f5941b = fs0Var;
    }

    public final void a(String str) {
        try {
            this.f5940a.put(str, this.f5941b.e(str));
        } catch (RemoteException e) {
            tr.c("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final ye b(String str) {
        if (this.f5940a.containsKey(str)) {
            return this.f5940a.get(str);
        }
        return null;
    }
}

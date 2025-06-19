package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5920a;

    /* renamed from: b, reason: collision with root package name */
    private final yb f5921b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5922c;
    private g30 d;
    private final z6<Object> e = new a30(this);
    private final z6<Object> f = new c30(this);

    public x20(String str, yb ybVar, Executor executor) {
        this.f5920a = str;
        this.f5921b = ybVar;
        this.f5922c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(@androidx.annotation.i0 Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f5920a);
    }

    public final void b(g30 g30Var) {
        this.f5921b.b("/updateActiveView", this.e);
        this.f5921b.b("/untrackActiveViewUnit", this.f);
        this.d = g30Var;
    }

    public final void d() {
        this.f5921b.c("/updateActiveView", this.e);
        this.f5921b.c("/untrackActiveViewUnit", this.f);
    }

    public final void f(rw rwVar) {
        rwVar.o("/updateActiveView", this.e);
        rwVar.o("/untrackActiveViewUnit", this.f);
    }

    public final void g(rw rwVar) {
        rwVar.j("/updateActiveView", this.e);
        rwVar.j("/untrackActiveViewUnit", this.f);
    }
}

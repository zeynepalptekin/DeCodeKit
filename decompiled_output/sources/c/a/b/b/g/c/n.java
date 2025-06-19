package c.a.b.b.g.c;

import android.app.Activity;
import android.os.RemoteException;
import c.a.b.b.g.c.h;

/* loaded from: classes.dex */
final class n extends h.b {
    private final /* synthetic */ Activity h;
    private final /* synthetic */ String i;
    private final /* synthetic */ String j;
    private final /* synthetic */ h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(h hVar, Activity activity, String str, String str2) {
        super(hVar);
        this.k = hVar;
        this.h = activity;
        this.i = str;
        this.j = str2;
    }

    @Override // c.a.b.b.g.c.h.b
    final void a() throws RemoteException {
        this.k.i.setCurrentScreen(c.a.b.b.e.e.i2(this.h), this.i, this.j, this.d);
    }
}

package c.a.b.b.g.c;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class y1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w1 f1868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y1(w1 w1Var, Handler handler) {
        super(null);
        this.f1868a = w1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f1868a.c();
    }
}

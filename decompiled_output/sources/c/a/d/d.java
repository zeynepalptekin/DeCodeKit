package c.a.d;

import android.content.Context;

/* loaded from: classes.dex */
final /* synthetic */ class d implements c.a.d.s.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f2171a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2172b;

    private d(e eVar, Context context) {
        this.f2171a = eVar;
        this.f2172b = context;
    }

    public static c.a.d.s.a a(e eVar, Context context) {
        return new d(eVar, context);
    }

    @Override // c.a.d.s.a
    public Object get() {
        return e.z(this.f2171a, this.f2172b);
    }
}

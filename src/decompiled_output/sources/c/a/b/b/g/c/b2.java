package c.a.b.b.g.c;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class b2 implements a2 {

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.u("GservicesLoader.class")
    private static b2 f1657c;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Context f1658a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ContentObserver f1659b;

    private b2() {
        this.f1658a = null;
        this.f1659b = null;
    }

    private b2(Context context) {
        this.f1658a = context;
        this.f1659b = new e2(this, null);
        context.getContentResolver().registerContentObserver(s1.f1812a, true, this.f1659b);
    }

    static b2 a(Context context) {
        b2 b2Var;
        synchronized (b2.class) {
            if (f1657c == null) {
                f1657c = b.i.c.g.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new b2(context) : new b2();
            }
            b2Var = f1657c;
        }
        return b2Var;
    }

    static synchronized void b() {
        if (f1657c != null && f1657c.f1658a != null && f1657c.f1659b != null) {
            f1657c.f1658a.getContentResolver().unregisterContentObserver(f1657c.f1659b);
        }
        f1657c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // c.a.b.b.g.c.a2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String i(final String str) {
        if (this.f1658a == null) {
            return null;
        }
        try {
            return (String) z1.a(new c2(this, str) { // from class: c.a.b.b.g.c.f2

                /* renamed from: a, reason: collision with root package name */
                private final b2 f1683a;

                /* renamed from: b, reason: collision with root package name */
                private final String f1684b;

                {
                    this.f1683a = this;
                    this.f1684b = str;
                }

                @Override // c.a.b.b.g.c.c2
                public final Object a() {
                    return this.f1683a.c(this.f1684b);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    final /* synthetic */ String c(String str) {
        return s1.a(this.f1658a.getContentResolver(), str, null);
    }
}

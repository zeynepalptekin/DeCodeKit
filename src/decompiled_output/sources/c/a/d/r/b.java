package c.a.d.r;

import android.content.Context;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.annotation.x0;
import c.a.d.r.c;
import com.google.firebase.components.f;
import com.google.firebase.components.g;
import com.google.firebase.components.p;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private d f2191a;

    private b(Context context) {
        this.f2191a = d.a(context);
    }

    @p0({p0.a.TESTS})
    @x0
    b(d dVar) {
        this.f2191a = dVar;
    }

    @h0
    public static f<c> b() {
        return f.a(c.class).b(p.g(Context.class)).f(a.b()).d();
    }

    static /* synthetic */ c c(g gVar) {
        return new b((Context) gVar.a(Context.class));
    }

    @Override // c.a.d.r.c
    @h0
    public c.a a(@h0 String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zC = this.f2191a.c(str, jCurrentTimeMillis);
        boolean zB = this.f2191a.b(jCurrentTimeMillis);
        return (zC && zB) ? c.a.COMBINED : zB ? c.a.GLOBAL : zC ? c.a.SDK : c.a.NONE;
    }
}

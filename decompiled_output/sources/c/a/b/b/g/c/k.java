package c.a.b.b.g.c;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c.a.b.b.g.c.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class k extends h.b {
    private final /* synthetic */ String h;
    private final /* synthetic */ String i;
    private final /* synthetic */ Context j;
    private final /* synthetic */ Bundle k;
    private final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(h hVar, String str, String str2, Context context, Bundle bundle) {
        super(hVar);
        this.l = hVar;
        this.h = str;
        this.i = str2;
        this.j = context;
        this.k = bundle;
    }

    @Override // c.a.b.b.g.c.h.b
    public final void a() {
        String str;
        String str2;
        String str3;
        boolean z;
        int r2;
        try {
            this.l.e = new ArrayList();
            h hVar = this.l;
            if (h.U(this.h, this.i)) {
                String str4 = this.i;
                str2 = this.h;
                str3 = str4;
                str = this.l.f1701a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            h.g0(this.j);
            boolean z2 = h.k.booleanValue() || str2 != null;
            this.l.i = this.l.d(this.j, z2);
            if (this.l.i == null) {
                Log.w(this.l.f1701a, "Failed to connect to measurement client.");
                return;
            }
            int r3 = h.d0(this.j);
            int r4 = h.b0(this.j);
            if (z2) {
                r2 = Math.max(r3, r4);
                z = r4 < r3;
            } else {
                if (r3 > 0) {
                    r4 = r3;
                }
                z = r3 > 0;
                r2 = r4;
            }
            this.l.i.initialize(c.a.b.b.e.e.i2(this.j), new f(32053L, r2, z, str, str2, str3, this.k), this.d);
        } catch (Exception e) {
            this.l.t(e, true, false);
        }
    }
}

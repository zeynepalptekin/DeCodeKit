package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class e52 extends l92<e52, a> implements za2 {
    private static volatile kb2<e52> zzel;
    private static final e52 zzibh;
    private String zzibf = "";
    private x92<q42> zzibg = l92.F();

    public static final class a extends l92.b<e52, a> implements za2 {
        private a() {
            super(e52.zzibh);
        }

        /* synthetic */ a(g52 g52Var) {
            this();
        }
    }

    static {
        e52 e52Var = new e52();
        zzibh = e52Var;
        l92.w(e52.class, e52Var);
    }

    private e52() {
    }

    public static e52 I() {
        return zzibh;
    }

    public final List<q42> H() {
        return this.zzibg;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        g52 g52Var = null;
        switch (g52.f3499a[r2 - 1]) {
            case 1:
                return new e52();
            case 2:
                return new a(g52Var);
            case 3:
                return l92.u(zzibh, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzibf", "zzibg", q42.class});
            case 4:
                return zzibh;
            case 5:
                kb2<e52> aVar = zzel;
                if (aVar == null) {
                    synchronized (e52.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzibh);
                            zzel = aVar;
                        }
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

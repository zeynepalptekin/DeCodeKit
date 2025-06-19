package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class g22 extends l92<g22, a> implements za2 {
    private static volatile kb2<g22> zzel;
    private static final g22 zzhwv;
    private j22 zzhws;
    private int zzhwu;

    public static final class a extends l92.b<g22, a> implements za2 {
        private a() {
            super(g22.zzhwv);
        }

        /* synthetic */ a(h22 h22Var) {
            this();
        }
    }

    static {
        g22 g22Var = new g22();
        zzhwv = g22Var;
        l92.w(g22.class, g22Var);
    }

    private g22() {
    }

    public static g22 K(a82 a82Var, y82 y82Var) throws w92 {
        return (g22) l92.m(zzhwv, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwu;
    }

    public final j22 I() {
        j22 j22Var = this.zzhws;
        return j22Var == null ? j22.I() : j22Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        h22 h22Var = null;
        switch (h22.f3621a[r2 - 1]) {
            case 1:
                return new g22();
            case 2:
                return new a(h22Var);
            case 3:
                return l92.u(zzhwv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhwu", "zzhws"});
            case 4:
                return zzhwv;
            case 5:
                kb2<g22> aVar = zzel;
                if (aVar == null) {
                    synchronized (g22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhwv);
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class w22 extends l92<w22, a> implements za2 {
    private static volatile kb2<w22> zzel;
    private static final w22 zzhxl;
    private int zzhwu;
    private z22 zzhxj;

    public static final class a extends l92.b<w22, a> implements za2 {
        private a() {
            super(w22.zzhxl);
        }

        /* synthetic */ a(x22 x22Var) {
            this();
        }
    }

    static {
        w22 w22Var = new w22();
        zzhxl = w22Var;
        l92.w(w22.class, w22Var);
    }

    private w22() {
    }

    public static w22 K(a82 a82Var, y82 y82Var) throws w92 {
        return (w22) l92.m(zzhxl, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwu;
    }

    public final z22 I() {
        z22 z22Var = this.zzhxj;
        return z22Var == null ? z22.I() : z22Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        x22 x22Var = null;
        switch (x22.f5926a[r2 - 1]) {
            case 1:
                return new w22();
            case 2:
                return new a(x22Var);
            case 3:
                return l92.u(zzhxl, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhxj", "zzhwu"});
            case 4:
                return zzhxl;
            case 5:
                kb2<w22> aVar = zzel;
                if (aVar == null) {
                    synchronized (w22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxl);
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class z22 extends l92<z22, a> implements za2 {
    private static volatile kb2<z22> zzel;
    private static final z22 zzhxm;
    private int zzhxh;

    public static final class a extends l92.b<z22, a> implements za2 {
        private a() {
            super(z22.zzhxm);
        }

        /* synthetic */ a(y22 y22Var) {
            this();
        }
    }

    static {
        z22 z22Var = new z22();
        zzhxm = z22Var;
        l92.w(z22.class, z22Var);
    }

    private z22() {
    }

    public static z22 I() {
        return zzhxm;
    }

    public final int H() {
        return this.zzhxh;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        y22 y22Var = null;
        switch (y22.f6085a[r1 - 1]) {
            case 1:
                return new z22();
            case 2:
                return new a(y22Var);
            case 3:
                return l92.u(zzhxm, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhxh"});
            case 4:
                return zzhxm;
            case 5:
                kb2<z22> aVar = zzel;
                if (aVar == null) {
                    synchronized (z22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxm);
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

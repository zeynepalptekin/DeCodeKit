package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class d32 extends l92<d32, a> implements za2 {
    private static volatile kb2<d32> zzel;
    private static final d32 zzhxo;
    private int zzhwq;
    private int zzhwu;

    public static final class a extends l92.b<d32, a> implements za2 {
        private a() {
            super(d32.zzhxo);
        }

        /* synthetic */ a(c32 c32Var) {
            this();
        }
    }

    static {
        d32 d32Var = new d32();
        zzhxo = d32Var;
        l92.w(d32.class, d32Var);
    }

    private d32() {
    }

    public static d32 J(a82 a82Var, y82 y82Var) throws w92 {
        return (d32) l92.m(zzhxo, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwu;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        c32 c32Var = null;
        switch (c32.f2919a[r2 - 1]) {
            case 1:
                return new d32();
            case 2:
                return new a(c32Var);
            case 3:
                return l92.u(zzhxo, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhwu", "zzhwq"});
            case 4:
                return zzhxo;
            case 5:
                kb2<d32> aVar = zzel;
                if (aVar == null) {
                    synchronized (d32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxo);
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

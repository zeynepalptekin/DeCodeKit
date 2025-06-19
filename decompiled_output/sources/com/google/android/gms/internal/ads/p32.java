package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class p32 extends l92<p32, a> implements za2 {
    private static volatile kb2<p32> zzel;
    private static final p32 zzhye;
    private w32 zzhyb;
    private k32 zzhyc;
    private int zzhyd;

    public static final class a extends l92.b<p32, a> implements za2 {
        private a() {
            super(p32.zzhye);
        }

        /* synthetic */ a(q32 q32Var) {
            this();
        }
    }

    static {
        p32 p32Var = new p32();
        zzhye = p32Var;
        l92.w(p32.class, p32Var);
    }

    private p32() {
    }

    public static p32 K() {
        return zzhye;
    }

    public final w32 H() {
        w32 w32Var = this.zzhyb;
        return w32Var == null ? w32.K() : w32Var;
    }

    public final k32 I() {
        k32 k32Var = this.zzhyc;
        return k32Var == null ? k32.I() : k32Var;
    }

    public final j32 J() {
        j32 j32VarE = j32.e(this.zzhyd);
        return j32VarE == null ? j32.UNRECOGNIZED : j32VarE;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        q32 q32Var = null;
        switch (q32.f4947a[r2 - 1]) {
            case 1:
                return new p32();
            case 2:
                return new a(q32Var);
            case 3:
                return l92.u(zzhye, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhyb", "zzhyc", "zzhyd"});
            case 4:
                return zzhye;
            case 5:
                kb2<p32> aVar = zzel;
                if (aVar == null) {
                    synchronized (p32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhye);
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

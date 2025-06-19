package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class o32 extends l92<o32, a> implements za2 {
    private static volatile kb2<o32> zzel;
    private static final o32 zzhya;
    private p32 zzhxz;

    public static final class a extends l92.b<o32, a> implements za2 {
        private a() {
            super(o32.zzhya);
        }

        /* synthetic */ a(n32 n32Var) {
            this();
        }
    }

    static {
        o32 o32Var = new o32();
        zzhya = o32Var;
        l92.w(o32.class, o32Var);
    }

    private o32() {
    }

    public static o32 J(a82 a82Var, y82 y82Var) throws w92 {
        return (o32) l92.m(zzhya, a82Var, y82Var);
    }

    public final p32 H() {
        p32 p32Var = this.zzhxz;
        return p32Var == null ? p32.K() : p32Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        n32 n32Var = null;
        switch (n32.f4485a[r1 - 1]) {
            case 1:
                return new o32();
            case 2:
                return new a(n32Var);
            case 3:
                return l92.u(zzhya, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhxz"});
            case 4:
                return zzhya;
            case 5:
                kb2<o32> aVar = zzel;
                if (aVar == null) {
                    synchronized (o32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhya);
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class n22 extends l92<n22, a> implements za2 {
    private static volatile kb2<n22> zzel;
    private static final n22 zzhxd;
    private r22 zzhxb;
    private e42 zzhxc;

    public static final class a extends l92.b<n22, a> implements za2 {
        private a() {
            super(n22.zzhxd);
        }

        /* synthetic */ a(m22 m22Var) {
            this();
        }
    }

    static {
        n22 n22Var = new n22();
        zzhxd = n22Var;
        l92.w(n22.class, n22Var);
    }

    private n22() {
    }

    public static n22 K(a82 a82Var, y82 y82Var) throws w92 {
        return (n22) l92.m(zzhxd, a82Var, y82Var);
    }

    public final r22 H() {
        r22 r22Var = this.zzhxb;
        return r22Var == null ? r22.J() : r22Var;
    }

    public final e42 I() {
        e42 e42Var = this.zzhxc;
        return e42Var == null ? e42.J() : e42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        m22 m22Var = null;
        switch (m22.f4336a[r2 - 1]) {
            case 1:
                return new n22();
            case 2:
                return new a(m22Var);
            case 3:
                return l92.u(zzhxd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhxb", "zzhxc"});
            case 4:
                return zzhxd;
            case 5:
                kb2<n22> aVar = zzel;
                if (aVar == null) {
                    synchronized (n22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxd);
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

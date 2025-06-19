package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class r22 extends l92<r22, a> implements za2 {
    private static volatile kb2<r22> zzel;
    private static final r22 zzhxg;
    private int zzhwu;
    private s22 zzhxe;

    public static final class a extends l92.b<r22, a> implements za2 {
        private a() {
            super(r22.zzhxg);
        }

        /* synthetic */ a(q22 q22Var) {
            this();
        }
    }

    static {
        r22 r22Var = new r22();
        zzhxg = r22Var;
        l92.w(r22.class, r22Var);
    }

    private r22() {
    }

    public static r22 J() {
        return zzhxg;
    }

    public static r22 L(a82 a82Var, y82 y82Var) throws w92 {
        return (r22) l92.m(zzhxg, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwu;
    }

    public final s22 I() {
        s22 s22Var = this.zzhxe;
        return s22Var == null ? s22.I() : s22Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        q22 q22Var = null;
        switch (q22.f4943a[r2 - 1]) {
            case 1:
                return new r22();
            case 2:
                return new a(q22Var);
            case 3:
                return l92.u(zzhxg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhxe", "zzhwu"});
            case 4:
                return zzhxg;
            case 5:
                kb2<r22> aVar = zzel;
                if (aVar == null) {
                    synchronized (r22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxg);
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

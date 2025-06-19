package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class y42 extends l92<y42, a> implements za2 {
    private static volatile kb2<y42> zzel;
    private static final y42 zzias;
    private String zziar = "";

    public static final class a extends l92.b<y42, a> implements za2 {
        private a() {
            super(y42.zzias);
        }

        /* synthetic */ a(x42 x42Var) {
            this();
        }
    }

    static {
        y42 y42Var = new y42();
        zzias = y42Var;
        l92.w(y42.class, y42Var);
    }

    private y42() {
    }

    public static y42 I() {
        return zzias;
    }

    public static y42 K(a82 a82Var, y82 y82Var) throws w92 {
        return (y42) l92.m(zzias, a82Var, y82Var);
    }

    public final String H() {
        return this.zziar;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        x42 x42Var = null;
        switch (x42.f5932a[r1 - 1]) {
            case 1:
                return new y42();
            case 2:
                return new a(x42Var);
            case 3:
                return l92.u(zzias, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zziar"});
            case 4:
                return zzias;
            case 5:
                kb2<y42> aVar = zzel;
                if (aVar == null) {
                    synchronized (y42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzias);
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

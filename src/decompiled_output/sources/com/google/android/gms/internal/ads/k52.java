package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class k52 extends l92<k52, a> implements za2 {
    private static volatile kb2<k52> zzel;
    private static final k52 zzibj;

    public static final class a extends l92.b<k52, a> implements za2 {
        private a() {
            super(k52.zzibj);
        }

        /* synthetic */ a(l52 l52Var) {
            this();
        }
    }

    static {
        k52 k52Var = new k52();
        zzibj = k52Var;
        l92.w(k52.class, k52Var);
    }

    private k52() {
    }

    public static k52 I(a82 a82Var, y82 y82Var) throws w92 {
        return (k52) l92.m(zzibj, a82Var, y82Var);
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        l52 l52Var = null;
        switch (l52.f4201a[r1 - 1]) {
            case 1:
                return new k52();
            case 2:
                return new a(l52Var);
            case 3:
                return l92.u(zzibj, "\u0000\u0000", null);
            case 4:
                return zzibj;
            case 5:
                kb2<k52> aVar = zzel;
                if (aVar == null) {
                    synchronized (k52.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzibj);
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

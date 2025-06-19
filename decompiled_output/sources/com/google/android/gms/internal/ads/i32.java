package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class i32 extends l92<i32, a> implements za2 {
    private static volatile kb2<i32> zzel;
    private static final i32 zzhxq;

    public static final class a extends l92.b<i32, a> implements za2 {
        private a() {
            super(i32.zzhxq);
        }

        /* synthetic */ a(h32 h32Var) {
            this();
        }
    }

    static {
        i32 i32Var = new i32();
        zzhxq = i32Var;
        l92.w(i32.class, i32Var);
    }

    private i32() {
    }

    public static i32 I(a82 a82Var, y82 y82Var) throws w92 {
        return (i32) l92.m(zzhxq, a82Var, y82Var);
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        h32 h32Var = null;
        switch (h32.f3625a[r1 - 1]) {
            case 1:
                return new i32();
            case 2:
                return new a(h32Var);
            case 3:
                return l92.u(zzhxq, "\u0000\u0000", null);
            case 4:
                return zzhxq;
            case 5:
                kb2<i32> aVar = zzel;
                if (aVar == null) {
                    synchronized (i32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxq);
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

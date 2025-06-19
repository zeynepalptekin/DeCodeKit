package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class s22 extends l92<s22, a> implements za2 {
    private static volatile kb2<s22> zzel;
    private static final s22 zzhxi;
    private int zzhxh;

    public static final class a extends l92.b<s22, a> implements za2 {
        private a() {
            super(s22.zzhxi);
        }

        /* synthetic */ a(t22 t22Var) {
            this();
        }
    }

    static {
        s22 s22Var = new s22();
        zzhxi = s22Var;
        l92.w(s22.class, s22Var);
    }

    private s22() {
    }

    public static s22 I() {
        return zzhxi;
    }

    public final int H() {
        return this.zzhxh;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        t22 t22Var = null;
        switch (t22.f5339a[r1 - 1]) {
            case 1:
                return new s22();
            case 2:
                return new a(t22Var);
            case 3:
                return l92.u(zzhxi, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhxh"});
            case 4:
                return zzhxi;
            case 5:
                kb2<s22> aVar = zzel;
                if (aVar == null) {
                    synchronized (s22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxi);
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

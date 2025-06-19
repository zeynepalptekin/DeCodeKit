package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class j22 extends l92<j22, a> implements za2 {
    private static volatile kb2<j22> zzel;
    private static final j22 zzhwx;
    private int zzhww;

    public static final class a extends l92.b<j22, a> implements za2 {
        private a() {
            super(j22.zzhwx);
        }

        /* synthetic */ a(i22 i22Var) {
            this();
        }
    }

    static {
        j22 j22Var = new j22();
        zzhwx = j22Var;
        l92.w(j22.class, j22Var);
    }

    private j22() {
    }

    public static j22 I() {
        return zzhwx;
    }

    public final int H() {
        return this.zzhww;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        i22 i22Var = null;
        switch (i22.f3756a[r1 - 1]) {
            case 1:
                return new j22();
            case 2:
                return new a(i22Var);
            case 3:
                return l92.u(zzhwx, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhww"});
            case 4:
                return zzhwx;
            case 5:
                kb2<j22> aVar = zzel;
                if (aVar == null) {
                    synchronized (j22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhwx);
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

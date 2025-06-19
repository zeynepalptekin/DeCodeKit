package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class w32 extends l92<w32, a> implements za2 {
    private static volatile kb2<w32> zzel;
    private static final w32 zzhyn;
    private int zzhyk;
    private int zzhyl;
    private a82 zzhym = a82.e;

    public static final class a extends l92.b<w32, a> implements za2 {
        private a() {
            super(w32.zzhyn);
        }

        /* synthetic */ a(v32 v32Var) {
            this();
        }
    }

    static {
        w32 w32Var = new w32();
        zzhyn = w32Var;
        l92.w(w32.class, w32Var);
    }

    private w32() {
    }

    public static w32 K() {
        return zzhyn;
    }

    public final x32 H() {
        x32 x32VarE = x32.e(this.zzhyk);
        return x32VarE == null ? x32.UNRECOGNIZED : x32VarE;
    }

    public final y32 I() {
        y32 y32VarE = y32.e(this.zzhyl);
        return y32VarE == null ? y32.UNRECOGNIZED : y32VarE;
    }

    public final a82 J() {
        return this.zzhym;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        v32 v32Var = null;
        switch (v32.f5630a[r2 - 1]) {
            case 1:
                return new w32();
            case 2:
                return new a(v32Var);
            case 3:
                return l92.u(zzhyn, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzhyk", "zzhyl", "zzhym"});
            case 4:
                return zzhyn;
            case 5:
                kb2<w32> aVar = zzel;
                if (aVar == null) {
                    synchronized (w32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhyn);
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

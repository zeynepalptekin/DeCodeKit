package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class f42 extends l92<f42, a> implements za2 {
    private static volatile kb2<f42> zzel;
    private static final f42 zzhzg;
    private int zzhww;
    private int zzhzf;

    public static final class a extends l92.b<f42, a> implements za2 {
        private a() {
            super(f42.zzhzg);
        }

        /* synthetic */ a(g42 g42Var) {
            this();
        }
    }

    static {
        f42 f42Var = new f42();
        zzhzg = f42Var;
        l92.w(f42.class, f42Var);
    }

    private f42() {
    }

    public static f42 J() {
        return zzhzg;
    }

    public final int H() {
        return this.zzhww;
    }

    public final y32 I() {
        y32 y32VarE = y32.e(this.zzhzf);
        return y32VarE == null ? y32.UNRECOGNIZED : y32VarE;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        g42 g42Var = null;
        switch (g42.f3498a[r2 - 1]) {
            case 1:
                return new f42();
            case 2:
                return new a(g42Var);
            case 3:
                return l92.u(zzhzg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhzf", "zzhww"});
            case 4:
                return zzhzg;
            case 5:
                kb2<f42> aVar = zzel;
                if (aVar == null) {
                    synchronized (f42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhzg);
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

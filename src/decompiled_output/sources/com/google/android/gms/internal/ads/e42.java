package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class e42 extends l92<e42, a> implements za2 {
    private static volatile kb2<e42> zzel;
    private static final e42 zzhze;
    private int zzhwq;
    private int zzhwu;
    private f42 zzhzc;

    public static final class a extends l92.b<e42, a> implements za2 {
        private a() {
            super(e42.zzhze);
        }

        /* synthetic */ a(d42 d42Var) {
            this();
        }
    }

    static {
        e42 e42Var = new e42();
        zzhze = e42Var;
        l92.w(e42.class, e42Var);
    }

    private e42() {
    }

    public static e42 J() {
        return zzhze;
    }

    public static e42 L(a82 a82Var, y82 y82Var) throws w92 {
        return (e42) l92.m(zzhze, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwu;
    }

    public final f42 I() {
        f42 f42Var = this.zzhzc;
        return f42Var == null ? f42.J() : f42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        d42 d42Var = null;
        switch (d42.f3068a[r2 - 1]) {
            case 1:
                return new e42();
            case 2:
                return new a(d42Var);
            case 3:
                return l92.u(zzhze, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzhzc", "zzhwu", "zzhwq"});
            case 4:
                return zzhze;
            case 5:
                kb2<e42> aVar = zzel;
                if (aVar == null) {
                    synchronized (e42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhze);
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

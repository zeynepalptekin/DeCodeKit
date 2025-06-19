package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class m42 extends l92<m42, a> implements za2 {
    private static volatile kb2<m42> zzel;
    private static final m42 zzhzz;
    private String zzhzh = "";
    private a82 zzhzi = a82.e;
    private int zzhzy;

    public static final class a extends l92.b<m42, a> implements za2 {
        private a() {
            super(m42.zzhzz);
        }

        /* synthetic */ a(o42 o42Var) {
            this();
        }
    }

    static {
        m42 m42Var = new m42();
        zzhzz = m42Var;
        l92.w(m42.class, m42Var);
    }

    private m42() {
    }

    public static m42 J() {
        return zzhzz;
    }

    public final String H() {
        return this.zzhzh;
    }

    public final a82 I() {
        return this.zzhzi;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        o42 o42Var = null;
        switch (o42.f4646a[r2 - 1]) {
            case 1:
                return new m42();
            case 2:
                return new a(o42Var);
            case 3:
                return l92.u(zzhzz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhzh", "zzhzi", "zzhzy"});
            case 4:
                return zzhzz;
            case 5:
                kb2<m42> aVar = zzel;
                if (aVar == null) {
                    synchronized (m42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhzz);
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

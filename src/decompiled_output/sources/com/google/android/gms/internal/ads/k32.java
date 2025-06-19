package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class k32 extends l92<k32, a> implements za2 {
    private static volatile kb2<k32> zzel;
    private static final k32 zzhxy;
    private m42 zzhxx;

    public static final class a extends l92.b<k32, a> implements za2 {
        private a() {
            super(k32.zzhxy);
        }

        /* synthetic */ a(m32 m32Var) {
            this();
        }
    }

    static {
        k32 k32Var = new k32();
        zzhxy = k32Var;
        l92.w(k32.class, k32Var);
    }

    private k32() {
    }

    public static k32 I() {
        return zzhxy;
    }

    public final m42 H() {
        m42 m42Var = this.zzhxx;
        return m42Var == null ? m42.J() : m42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r1, Object obj, Object obj2) {
        m32 m32Var = null;
        switch (m32.f4340a[r1 - 1]) {
            case 1:
                return new k32();
            case 2:
                return new a(m32Var);
            case 3:
                return l92.u(zzhxy, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhxx"});
            case 4:
                return zzhxy;
            case 5:
                kb2<k32> aVar = zzel;
                if (aVar == null) {
                    synchronized (k32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxy);
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

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class z42 extends l92<z42, a> implements za2 {
    private static volatile kb2<z42> zzel;
    private static final z42 zziau;
    private int zzhwq;
    private c52 zziat;

    public static final class a extends l92.b<z42, a> implements za2 {
        private a() {
            super(z42.zziau);
        }

        /* synthetic */ a(a52 a52Var) {
            this();
        }

        public final a v(c52 c52Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((z42) this.e).L(c52Var);
            return this;
        }

        public final a w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((z42) this.e).I(0);
            return this;
        }
    }

    static {
        z42 z42Var = new z42();
        zziau = z42Var;
        l92.w(z42.class, z42Var);
    }

    private z42() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(c52 c52Var) {
        c52Var.getClass();
        this.zziat = c52Var;
    }

    public static a N() {
        return zziau.z();
    }

    public static z42 Q(a82 a82Var, y82 y82Var) throws w92 {
        return (z42) l92.m(zziau, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwq;
    }

    public final c52 M() {
        c52 c52Var = this.zziat;
        return c52Var == null ? c52.J() : c52Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        a52 a52Var = null;
        switch (a52.f2633a[r2 - 1]) {
            case 1:
                return new z42();
            case 2:
                return new a(a52Var);
            case 3:
                return l92.u(zziau, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhwq", "zziat"});
            case 4:
                return zziau;
            case 5:
                kb2<z42> aVar = zzel;
                if (aVar == null) {
                    synchronized (z42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zziau);
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

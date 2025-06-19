package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class eh2 extends l92<eh2, a> implements za2 {
    private static final eh2 zzacb;
    private static volatile kb2<eh2> zzel;
    private fh2 zzaby;
    private a82 zzabz;
    private a82 zzaca;
    private int zzdw;

    public static final class a extends l92.b<eh2, a> implements za2 {
        private a() {
            super(eh2.zzacb);
        }

        /* synthetic */ a(dh2 dh2Var) {
            this();
        }
    }

    static {
        eh2 eh2Var = new eh2();
        zzacb = eh2Var;
        l92.w(eh2.class, eh2Var);
    }

    private eh2() {
        a82 a82Var = a82.e;
        this.zzabz = a82Var;
        this.zzaca = a82Var;
    }

    public static eh2 H(a82 a82Var, y82 y82Var) throws w92 {
        return (eh2) l92.m(zzacb, a82Var, y82Var);
    }

    public final fh2 I() {
        fh2 fh2Var = this.zzaby;
        return fh2Var == null ? fh2.a0() : fh2Var;
    }

    public final a82 J() {
        return this.zzabz;
    }

    public final a82 K() {
        return this.zzaca;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        dh2 dh2Var = null;
        switch (dh2.f3128a[r2 - 1]) {
            case 1:
                return new eh2();
            case 2:
                return new a(dh2Var);
            case 3:
                return l92.u(zzacb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzaby", "zzabz", "zzaca"});
            case 4:
                return zzacb;
            case 5:
                kb2<eh2> aVar = zzel;
                if (aVar == null) {
                    synchronized (eh2.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzacb);
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

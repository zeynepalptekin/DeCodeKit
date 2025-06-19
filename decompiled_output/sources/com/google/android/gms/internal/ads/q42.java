package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

@Deprecated
/* loaded from: classes.dex */
public final class q42 extends l92<q42, a> implements za2 {
    private static volatile kb2<q42> zzel;
    private static final q42 zziae;
    private int zziab;
    private boolean zziac;
    private String zziaa = "";
    private String zzhzh = "";
    private String zziad = "";

    public static final class a extends l92.b<q42, a> implements za2 {
        private a() {
            super(q42.zziae);
        }

        /* synthetic */ a(p42 p42Var) {
            this();
        }
    }

    static {
        q42 q42Var = new q42();
        zziae = q42Var;
        l92.w(q42.class, q42Var);
    }

    private q42() {
    }

    public final String H() {
        return this.zzhzh;
    }

    public final String I() {
        return this.zziaa;
    }

    public final int J() {
        return this.zziab;
    }

    public final boolean K() {
        return this.zziac;
    }

    public final String L() {
        return this.zziad;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        p42 p42Var = null;
        switch (p42.f4782a[r2 - 1]) {
            case 1:
                return new q42();
            case 2:
                return new a(p42Var);
            case 3:
                return l92.u(zziae, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zziaa", "zzhzh", "zziab", "zziac", "zziad"});
            case 4:
                return zziae;
            case 5:
                kb2<q42> aVar = zzel;
                if (aVar == null) {
                    synchronized (q42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zziae);
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

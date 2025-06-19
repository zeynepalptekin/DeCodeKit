package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class c52 extends l92<c52, a> implements za2 {
    private static volatile kb2<c52> zzel;
    private static final c52 zziax;
    private String zziav = "";
    private m42 zziaw;

    public static final class a extends l92.b<c52, a> implements za2 {
        private a() {
            super(c52.zziax);
        }

        /* synthetic */ a(b52 b52Var) {
            this();
        }
    }

    static {
        c52 c52Var = new c52();
        zziax = c52Var;
        l92.w(c52.class, c52Var);
    }

    private c52() {
    }

    public static c52 J() {
        return zziax;
    }

    public static c52 L(a82 a82Var, y82 y82Var) throws w92 {
        return (c52) l92.m(zziax, a82Var, y82Var);
    }

    public final String H() {
        return this.zziav;
    }

    public final m42 I() {
        m42 m42Var = this.zziaw;
        return m42Var == null ? m42.J() : m42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        b52 b52Var = null;
        switch (b52.f2794a[r2 - 1]) {
            case 1:
                return new c52();
            case 2:
                return new a(b52Var);
            case 3:
                return l92.u(zziax, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zziav", "zziaw"});
            case 4:
                return zziax;
            case 5:
                kb2<c52> aVar = zzel;
                if (aVar == null) {
                    synchronized (c52.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zziax);
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

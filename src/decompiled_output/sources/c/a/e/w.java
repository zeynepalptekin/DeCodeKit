package c.a.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class w {
    public static final w d = new a("DEFAULT", 0);
    public static final w e;
    private static final /* synthetic */ w[] f;

    enum a extends w {
        a(String str, int r3) {
            super(str, r3, null);
        }

        @Override // c.a.e.w
        public l e(Long l) {
            return new r((Number) l);
        }
    }

    static {
        w wVar = new w("STRING", 1) { // from class: c.a.e.w.b
            {
                a aVar = null;
            }

            @Override // c.a.e.w
            public l e(Long l) {
                return new r(String.valueOf(l));
            }
        };
        e = wVar;
        f = new w[]{d, wVar};
    }

    private w(String str, int r2) {
    }

    /* synthetic */ w(String str, int r2, a aVar) {
        this(str, r2);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f.clone();
    }

    public abstract l e(Long l);
}

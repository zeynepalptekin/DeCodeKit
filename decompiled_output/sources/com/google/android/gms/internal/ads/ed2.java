package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'n' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class ed2 {
    public static final ed2 f = new ed2("DOUBLE", 0, hd2.DOUBLE, 1);
    public static final ed2 g = new ed2("FLOAT", 1, hd2.FLOAT, 5);
    public static final ed2 h = new ed2("INT64", 2, hd2.LONG, 0);
    public static final ed2 i = new ed2("UINT64", 3, hd2.LONG, 0);
    public static final ed2 j = new ed2("INT32", 4, hd2.INT, 0);
    public static final ed2 k = new ed2("FIXED64", 5, hd2.LONG, 1);
    public static final ed2 l = new ed2("FIXED32", 6, hd2.INT, 5);
    public static final ed2 m = new ed2("BOOL", 7, hd2.BOOLEAN, 0);
    public static final ed2 n;
    public static final ed2 o;
    public static final ed2 p;
    public static final ed2 q;
    public static final ed2 r;
    public static final ed2 s;
    public static final ed2 t;
    public static final ed2 u;
    public static final ed2 v;
    public static final ed2 w;
    private static final /* synthetic */ ed2[] x;
    private final hd2 d;
    private final int e;

    static {
        final int r6 = 2;
        final int r7 = 3;
        final hd2 hd2Var = hd2.STRING;
        final String str = "STRING";
        final int r11 = 8;
        n = new ed2(str, r11, hd2Var, r6) { // from class: com.google.android.gms.internal.ads.dd2
            {
                int r2 = 8;
                int r4 = 2;
                bd2 bd2Var = null;
            }
        };
        final hd2 hd2Var2 = hd2.MESSAGE;
        final String str2 = "GROUP";
        final int r12 = 9;
        o = new ed2(str2, r12, hd2Var2, r7) { // from class: com.google.android.gms.internal.ads.gd2
            {
                int r2 = 9;
                int r4 = 3;
                bd2 bd2Var = null;
            }
        };
        final hd2 hd2Var3 = hd2.MESSAGE;
        final String str3 = "MESSAGE";
        final int r13 = 10;
        p = new ed2(str3, r13, hd2Var3, r6) { // from class: com.google.android.gms.internal.ads.fd2
            {
                int r2 = 10;
                int r4 = 2;
                bd2 bd2Var = null;
            }
        };
        final hd2 hd2Var4 = hd2.BYTE_STRING;
        final String str4 = "BYTES";
        final int r14 = 11;
        q = new ed2(str4, r14, hd2Var4, r6) { // from class: com.google.android.gms.internal.ads.id2
            {
                int r2 = 11;
                int r4 = 2;
                bd2 bd2Var = null;
            }
        };
        r = new ed2("UINT32", 12, hd2.INT, 0);
        s = new ed2("ENUM", 13, hd2.ENUM, 0);
        t = new ed2("SFIXED32", 14, hd2.INT, 5);
        u = new ed2("SFIXED64", 15, hd2.LONG, 1);
        v = new ed2("SINT32", 16, hd2.INT, 0);
        ed2 ed2Var = new ed2("SINT64", 17, hd2.LONG, 0);
        w = ed2Var;
        x = new ed2[]{f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, ed2Var};
    }

    private ed2(String str, int r2, hd2 hd2Var, int r4) {
        this.d = hd2Var;
        this.e = r4;
    }

    /* synthetic */ ed2(String str, int r2, hd2 hd2Var, int r4, bd2 bd2Var) {
        this(str, r2, hd2Var, r4);
    }

    public static ed2[] values() {
        return (ed2[]) x.clone();
    }

    public final hd2 e() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }
}

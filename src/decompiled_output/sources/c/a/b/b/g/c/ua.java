package c.a.b.b.g.c;

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
public class ua {
    public static final ua f = new ua("DOUBLE", 0, xa.DOUBLE, 1);
    public static final ua g = new ua("FLOAT", 1, xa.FLOAT, 5);
    public static final ua h = new ua("INT64", 2, xa.LONG, 0);
    public static final ua i = new ua("UINT64", 3, xa.LONG, 0);
    public static final ua j = new ua("INT32", 4, xa.INT, 0);
    public static final ua k = new ua("FIXED64", 5, xa.LONG, 1);
    public static final ua l = new ua("FIXED32", 6, xa.INT, 5);
    public static final ua m = new ua("BOOL", 7, xa.BOOLEAN, 0);
    public static final ua n;
    public static final ua o;
    public static final ua p;
    public static final ua q;
    public static final ua r;
    public static final ua s;
    public static final ua t;
    public static final ua u;
    public static final ua v;
    public static final ua w;
    private static final /* synthetic */ ua[] x;
    private final xa d;
    private final int e;

    static {
        final int r6 = 2;
        final int r7 = 3;
        final xa xaVar = xa.STRING;
        final String str = "STRING";
        final int r11 = 8;
        n = new ua(str, r11, xaVar, r6) { // from class: c.a.b.b.g.c.ta
            {
                int r2 = 8;
                int r4 = 2;
                ra raVar = null;
            }
        };
        final xa xaVar2 = xa.MESSAGE;
        final String str2 = "GROUP";
        final int r12 = 9;
        o = new ua(str2, r12, xaVar2, r7) { // from class: c.a.b.b.g.c.wa
            {
                int r2 = 9;
                int r4 = 3;
                ra raVar = null;
            }
        };
        final xa xaVar3 = xa.MESSAGE;
        final String str3 = "MESSAGE";
        final int r13 = 10;
        p = new ua(str3, r13, xaVar3, r6) { // from class: c.a.b.b.g.c.va
            {
                int r2 = 10;
                int r4 = 2;
                ra raVar = null;
            }
        };
        final xa xaVar4 = xa.BYTE_STRING;
        final String str4 = "BYTES";
        final int r14 = 11;
        q = new ua(str4, r14, xaVar4, r6) { // from class: c.a.b.b.g.c.ya
            {
                int r2 = 11;
                int r4 = 2;
                ra raVar = null;
            }
        };
        r = new ua("UINT32", 12, xa.INT, 0);
        s = new ua("ENUM", 13, xa.ENUM, 0);
        t = new ua("SFIXED32", 14, xa.INT, 5);
        u = new ua("SFIXED64", 15, xa.LONG, 1);
        v = new ua("SINT32", 16, xa.INT, 0);
        ua uaVar = new ua("SINT64", 17, xa.LONG, 0);
        w = uaVar;
        x = new ua[]{f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, uaVar};
    }

    private ua(String str, int r2, xa xaVar, int r4) {
        this.d = xaVar;
        this.e = r4;
    }

    /* synthetic */ ua(String str, int r2, xa xaVar, int r4, ra raVar) {
        this(str, r2, xaVar, r4);
    }

    public static ua[] values() {
        return (ua[]) x.clone();
    }

    public final xa e() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }
}

package c.a.e.a0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2237a = a();

    private f() {
    }

    private static int a() {
        return d(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int r1 = 0; r1 < str.length(); r1++) {
                char cCharAt = str.charAt(r1);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f2237a;
    }

    static int d(String str) throws NumberFormatException {
        int r0 = f(str);
        if (r0 == -1) {
            r0 = b(str);
        }
        if (r0 == -1) {
            return 6;
        }
        return r0;
    }

    public static boolean e() {
        return f2237a >= 9;
    }

    private static int f(String str) throws NumberFormatException {
        try {
            String[] strArrSplit = str.split("[._]");
            int r0 = Integer.parseInt(strArrSplit[0]);
            return (r0 != 1 || strArrSplit.length <= 1) ? r0 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}

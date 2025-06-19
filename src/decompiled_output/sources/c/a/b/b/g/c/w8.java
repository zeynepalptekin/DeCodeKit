package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class w8 {
    static String a(r8 r8Var, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(r8Var, sb, 0);
        return sb.toString();
    }

    private static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int r1 = 0; r1 < str.length(); r1++) {
            char cCharAt = str.charAt(r1);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(c.a.b.b.g.c.r8 r13, java.lang.StringBuilder r14, int r15) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.w8.c(c.a.b.b.g.c.r8, java.lang.StringBuilder, int):void");
    }

    static final void d(StringBuilder sb, int r7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, r7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, r7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int r0 = 0;
        for (int r1 = 0; r1 < r7; r1++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(y9.a(y5.n((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof y5) {
            sb.append(": \"");
            sb.append(y9.a((y5) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof h7) {
            sb.append(" {");
            c((h7) obj, sb, r7 + 2);
            sb.append("\n");
            while (r0 < r7) {
                sb.append(' ');
                r0++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int r8 = r7 + 2;
        d(sb, r8, "key", entry.getKey());
        d(sb, r8, "value", entry.getValue());
        sb.append("\n");
        while (r0 < r7) {
            sb.append(' ');
            r0++;
        }
        sb.append("}");
    }
}

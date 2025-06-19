package c.a.b.b.g.c;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class i3 {
    private static String a(@NullableDecl Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String string = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + String.valueOf(name2).length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static String b(@NullableDecl String str, @NullableDecl Object... objArr) {
        int r3;
        String strValueOf = String.valueOf(str);
        int r0 = 0;
        for (int r1 = 0; r1 < objArr.length; r1++) {
            objArr[r1] = a(objArr[r1]);
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int r2 = 0;
        while (r0 < objArr.length && (r3 = strValueOf.indexOf("%s", r2)) != -1) {
            sb.append((CharSequence) strValueOf, r2, r3);
            sb.append(objArr[r0]);
            r2 = r3 + 2;
            r0++;
        }
        sb.append((CharSequence) strValueOf, r2, strValueOf.length());
        if (r0 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[r0]);
            for (int r6 = r0 + 1; r6 < objArr.length; r6++) {
                sb.append(", ");
                sb.append(objArr[r6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}

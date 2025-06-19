package b.i.o;

import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c {
    private c() {
    }

    public static void a(Object obj, StringBuilder sb) {
        int r1;
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if ((simpleName == null || simpleName.length() <= 0) && (r1 = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(r1 + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }
}

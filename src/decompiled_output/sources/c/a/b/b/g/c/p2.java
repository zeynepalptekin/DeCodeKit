package c.a.b.b.g.c;

import android.util.Log;

/* loaded from: classes.dex */
final class p2 extends l2<Boolean> {
    p2(q2 q2Var, String str, Boolean bool, boolean z) {
        super(q2Var, str, bool, true, null);
    }

    @Override // c.a.b.b.g.c.l2
    final /* synthetic */ Boolean e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (s1.f1814c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (s1.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strN = super.n();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 28 + String.valueOf(strValueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(strN);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

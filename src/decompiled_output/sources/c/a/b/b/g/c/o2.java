package c.a.b.b.g.c;

import android.util.Log;

/* loaded from: classes.dex */
final class o2 extends l2<Double> {
    o2(q2 q2Var, String str, Double d, boolean z) {
        super(q2Var, str, d, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // c.a.b.b.g.c.l2
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Double e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strN = super.n();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 27 + String.valueOf(strValueOf).length());
        sb.append("Invalid double value for ");
        sb.append(strN);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

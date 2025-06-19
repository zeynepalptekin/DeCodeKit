package c.a.b.b.g.c;

import android.util.Log;

/* loaded from: classes.dex */
final class m2 extends l2<Long> {
    m2(q2 q2Var, String str, Long l, boolean z) {
        super(q2Var, str, l, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // c.a.b.b.g.c.l2
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Long e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strN = super.n();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 25 + String.valueOf(strValueOf).length());
        sb.append("Invalid long value for ");
        sb.append(strN);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

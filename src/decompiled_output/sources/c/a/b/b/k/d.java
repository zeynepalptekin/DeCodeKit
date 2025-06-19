package c.a.b.b.k;

/* loaded from: classes.dex */
public final class d extends IllegalStateException {
    private d(String str, @androidx.annotation.i0 Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(m<?> mVar) {
        String string;
        if (!mVar.u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excQ = mVar.q();
        if (excQ != null) {
            string = "failure";
        } else if (mVar.v()) {
            String strValueOf = String.valueOf(mVar.r());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
            sb.append("result ");
            sb.append(strValueOf);
            string = sb.toString();
        } else {
            string = mVar.t() ? "cancellation" : "unknown issue";
        }
        String strValueOf2 = String.valueOf(string);
        return new d(strValueOf2.length() != 0 ? "Complete with: ".concat(strValueOf2) : new String("Complete with: "), excQ);
    }
}

package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class pa extends IllegalArgumentException {
    pa(int r3, int r4) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(r3);
        sb.append(" of ");
        sb.append(r4);
        super(sb.toString());
    }
}

package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class l5 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    private final k5 f1758b = new k5();

    l5() {
    }

    @Override // c.a.b.b.g.c.h5
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f1758b.a(th, true).add(th2);
    }
}

package c.a.b.c.r;

import android.graphics.Typeface;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f1985a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0143a f1986b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1987c;

    /* renamed from: c.a.b.c.r.a$a, reason: collision with other inner class name */
    public interface InterfaceC0143a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0143a interfaceC0143a, Typeface typeface) {
        this.f1985a = typeface;
        this.f1986b = interfaceC0143a;
    }

    private void d(Typeface typeface) {
        if (this.f1987c) {
            return;
        }
        this.f1986b.a(typeface);
    }

    @Override // c.a.b.c.r.f
    public void a(int r1) {
        d(this.f1985a);
    }

    @Override // c.a.b.c.r.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f1987c = true;
    }
}

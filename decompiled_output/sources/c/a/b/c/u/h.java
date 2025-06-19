package c.a.b.c.u;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private View f2009a;

    /* renamed from: b, reason: collision with root package name */
    private j f2010b;

    /* renamed from: c, reason: collision with root package name */
    private ScrollView f2011c;
    private final int[] d = new int[2];
    private final int[] e = new int[2];
    private final ViewTreeObserver.OnScrollChangedListener f = new a();

    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            h.this.e();
        }
    }

    public h(View view, j jVar, ScrollView scrollView) {
        this.f2009a = view;
        this.f2010b = jVar;
        this.f2011c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f2011c = scrollView;
    }

    public void b(j jVar) {
        this.f2010b = jVar;
    }

    public void c(@h0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f);
    }

    public void d(@h0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f);
    }

    public void e() {
        j jVar;
        float f;
        ScrollView scrollView = this.f2011c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f2011c.getLocationInWindow(this.d);
        this.f2011c.getChildAt(0).getLocationInWindow(this.e);
        int top = (this.f2009a.getTop() - this.d[1]) + this.e[1];
        int height = this.f2009a.getHeight();
        int height2 = this.f2011c.getHeight();
        if (top < 0) {
            jVar = this.f2010b;
            f = (top / height) + 1.0f;
        } else {
            int r0 = top + height;
            if (r0 <= height2) {
                if (this.f2010b.z() != 1.0f) {
                    this.f2010b.o0(1.0f);
                    this.f2009a.invalidate();
                }
                return;
            }
            int r02 = r0 - height2;
            jVar = this.f2010b;
            f = 1.0f - (r02 / height);
        }
        jVar.o0(Math.max(0.0f, Math.min(1.0f, f)));
        this.f2009a.invalidate();
    }
}

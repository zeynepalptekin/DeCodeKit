package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class d extends ProgressBar {
    private static final int j = 500;
    private static final int k = 500;
    long d;
    boolean e;
    boolean f;
    boolean g;
    private final Runnable h;
    private final Runnable i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.e = false;
            dVar.d = -1L;
            dVar.setVisibility(8);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.f = false;
            if (dVar.g) {
                return;
            }
            dVar.d = System.currentTimeMillis();
            d.this.setVisibility(0);
        }
    }

    public d(@h0 Context context) {
        this(context, null);
    }

    public d(@h0 Context context, @i0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = -1L;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = new a();
        this.i = new b();
    }

    private void b() {
        removeCallbacks(this.h);
        removeCallbacks(this.i);
    }

    public synchronized void a() {
        this.g = true;
        removeCallbacks(this.i);
        this.f = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.d;
        if (jCurrentTimeMillis >= 500 || this.d == -1) {
            setVisibility(8);
        } else if (!this.e) {
            postDelayed(this.h, 500 - jCurrentTimeMillis);
            this.e = true;
        }
    }

    public synchronized void c() {
        this.d = -1L;
        this.g = false;
        removeCallbacks(this.h);
        this.e = false;
        if (!this.f) {
            postDelayed(this.i, 500L);
            this.f = true;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }
}

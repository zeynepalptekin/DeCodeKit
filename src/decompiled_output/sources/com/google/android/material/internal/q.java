package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class q {

    /* renamed from: c, reason: collision with root package name */
    private float f6750c;

    @i0
    private c.a.b.c.r.d f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f6748a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final c.a.b.c.r.f f6749b = new a();
    private boolean d = true;

    @i0
    private WeakReference<b> e = new WeakReference<>(null);

    class a extends c.a.b.c.r.f {
        a() {
        }

        @Override // c.a.b.c.r.f
        public void a(int r2) {
            q.this.d = true;
            b bVar = (b) q.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // c.a.b.c.r.f
        public void b(@h0 Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            q.this.d = true;
            b bVar = (b) q.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        @h0
        int[] getState();

        boolean onStateChange(int[] r1);
    }

    public q(@i0 b bVar) {
        h(bVar);
    }

    private float c(@i0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f6748a.measureText(charSequence, 0, charSequence.length());
    }

    @i0
    public c.a.b.c.r.d d() {
        return this.f;
    }

    @h0
    public TextPaint e() {
        return this.f6748a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.f6750c;
        }
        float fC = c(str);
        this.f6750c = fC;
        this.d = false;
        return fC;
    }

    public boolean g() {
        return this.d;
    }

    public void h(@i0 b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void i(@i0 c.a.b.c.r.d dVar, Context context) {
        if (this.f != dVar) {
            this.f = dVar;
            if (dVar != null) {
                dVar.j(context, this.f6748a, this.f6749b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.f6748a.drawableState = bVar.getState();
                }
                dVar.i(context, this.f6748a, this.f6749b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z) {
        this.d = z;
    }

    public void k(Context context) {
        this.f.i(context, this.f6748a, this.f6749b);
    }
}

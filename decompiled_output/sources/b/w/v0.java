package b.w;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
class v0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    protected a f1513a;

    static class a extends ViewGroup {
        static Method i;
        ViewGroup d;
        View e;
        ArrayList<Drawable> f;
        v0 g;
        private boolean h;

        static {
            try {
                i = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, v0 v0Var) {
            super(context);
            this.f = null;
            this.d = viewGroup;
            this.e = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.g = v0Var;
        }

        private void c() {
            if (this.h) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f;
                if (arrayList == null || arrayList.size() == 0) {
                    this.h = true;
                    this.d.removeView(this);
                }
            }
        }

        private void e(int[] r6) {
            int[] r1 = new int[2];
            int[] r0 = new int[2];
            this.d.getLocationOnScreen(r1);
            this.e.getLocationOnScreen(r0);
            r6[0] = r0[0] - r1[0];
            r6[1] = r0[1] - r1[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f == null) {
                this.f = new ArrayList<>();
            }
            if (this.f.contains(drawable)) {
                return;
            }
            this.f.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.d && viewGroup.getParent() != null && b.i.p.f0.J0(viewGroup)) {
                    int[] r2 = new int[2];
                    int[] r1 = new int[2];
                    viewGroup.getLocationOnScreen(r2);
                    this.d.getLocationOnScreen(r1);
                    b.i.p.f0.Y0(view, r2[0] - r1[0]);
                    b.i.p.f0.Z0(view, r2[1] - r1[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.d.getLocationOnScreen(new int[2]);
            this.e.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.e.getWidth(), this.e.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int r2 = 0; r2 < size; r2++) {
                this.f.get(r2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int r6, int r7, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!(this.d instanceof ViewGroup) || i == null) {
                return null;
            }
            try {
                e(new int[2]);
                i.invoke(this.d, Integer.valueOf(r6), Integer.valueOf(r7), rect);
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] r5, Rect rect) {
            if (this.d == null) {
                return null;
            }
            rect.offset(r5[0], r5[1]);
            if (!(this.d instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            r5[0] = 0;
            r5[1] = 0;
            int[] r1 = new int[2];
            e(r1);
            rect.offset(r1[0], r1[1]);
            return super.invalidateChildInParent(r5, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@androidx.annotation.h0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@androidx.annotation.h0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f) != null && arrayList.contains(drawable));
        }
    }

    v0(Context context, ViewGroup viewGroup, View view) {
        this.f1513a = new a(context, viewGroup, view, this);
    }

    static v0 e(View view) {
        ViewGroup viewGroupF = f(view);
        if (viewGroupF == null) {
            return null;
        }
        int childCount = viewGroupF.getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = viewGroupF.getChildAt(r2);
            if (childAt instanceof a) {
                return ((a) childAt).g;
            }
        }
        return new q0(viewGroupF.getContext(), viewGroupF, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // b.w.x0
    public void b(@androidx.annotation.h0 Drawable drawable) {
        this.f1513a.a(drawable);
    }

    @Override // b.w.x0
    public void d(@androidx.annotation.h0 Drawable drawable) {
        this.f1513a.g(drawable);
    }
}

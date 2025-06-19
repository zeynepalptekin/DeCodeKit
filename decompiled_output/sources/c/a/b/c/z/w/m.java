package c.a.b.c.z.w;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import c.a.b.c.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@m0(21)
/* loaded from: classes.dex */
public class m extends SharedElementCallback {

    @i0
    private static WeakReference<View> f;

    @i0
    private Rect d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2147a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2148b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2149c = false;

    @i0
    private d e = new e();

    class a extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f2150a;

        a(Window window) {
            this.f2150a = window;
        }

        @Override // c.a.b.c.z.w.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.i(this.f2150a);
        }

        @Override // c.a.b.c.z.w.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.h(this.f2150a);
        }
    }

    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f2152a;

        b(Activity activity) {
            this.f2152a = activity;
        }

        @Override // c.a.b.c.z.w.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f != null && (view = (View) m.f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f = null;
            }
            this.f2152a.finish();
            this.f2152a.overridePendingTransition(0, 0);
        }
    }

    class c extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f2154a;

        c(Window window) {
            this.f2154a = window;
        }

        @Override // c.a.b.c.z.w.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.h(this.f2154a);
        }
    }

    public interface d {
        @i0
        c.a.b.c.u.o a(@h0 View view);
    }

    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.a.b.c.z.w.m.d
        @i0
        public c.a.b.c.u.o a(@h0 View view) {
            if (view instanceof c.a.b.c.u.s) {
                return ((c.a.b.c.u.s) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(b.i.e.b.a(0, b.i.e.c.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }

    private void m(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f2149c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f2148b) {
                o(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    private void n(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.e0(true);
            lVar.addListener(new b(activity));
            if (this.f2148b) {
                o(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    private static void o(Window window, l lVar) {
        window.setTransitionBackgroundFadeDuration(lVar.getDuration());
    }

    @i0
    public d e() {
        return this.e;
    }

    public boolean f() {
        return this.f2149c;
    }

    public boolean g() {
        return this.f2148b;
    }

    public void j(@i0 d dVar) {
        this.e = dVar;
    }

    public void k(boolean z) {
        this.f2149c = z;
    }

    public void l(boolean z) {
        this.f2148b = z;
    }

    @Override // android.app.SharedElementCallback
    @i0
    public Parcelable onCaptureSharedElementSnapshot(@h0 View view, @h0 Matrix matrix, @h0 RectF rectF) {
        f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @i0
    public View onCreateSnapshotView(@h0 Context context, @i0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        c.a.b.c.u.o oVarA;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f) != null && this.e != null && (view = weakReference.get()) != null && (oVarA = this.e.a(view)) != null) {
            viewOnCreateSnapshotView.setTag(a.h.mtrl_motion_snapshot_view, oVarA);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@h0 List<String> list, @h0 Map<String, View> map) {
        View view;
        Activity activityA;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activityA = com.google.android.material.internal.b.a(view.getContext())) == null) {
            return;
        }
        Window window = activityA.getWindow();
        if (this.f2147a) {
            m(window);
        } else {
            n(activityA, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@h0 List<String> list, @h0 List<View> list2, @h0 List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(a.h.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(a.h.mtrl_motion_snapshot_view, null);
        }
        if (!this.f2147a && !list2.isEmpty()) {
            this.d = v.i(list2.get(0));
        }
        this.f2147a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@h0 List<String> list, @h0 List<View> list2, @h0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(a.h.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f2147a || list2.isEmpty() || this.d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.height(), 1073741824));
        Rect rect = this.d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}

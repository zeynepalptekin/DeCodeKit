package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.p0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class e1 {
    private static final String h = "TooltipPopup";

    /* renamed from: a, reason: collision with root package name */
    private final Context f145a;

    /* renamed from: b, reason: collision with root package name */
    private final View f146b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f147c;
    private final WindowManager.LayoutParams d = new WindowManager.LayoutParams();
    private final Rect e = new Rect();
    private final int[] f = new int[2];
    private final int[] g = new int[2];

    e1(@androidx.annotation.h0 Context context) {
        this.f145a = context;
        View viewInflate = LayoutInflater.from(context).inflate(a.j.abc_tooltip, (ViewGroup) null);
        this.f146b = viewInflate;
        this.f147c = (TextView) viewInflate.findViewById(a.g.message);
        this.d.setTitle(e1.class.getSimpleName());
        this.d.packageName = this.f145a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.d;
        layoutParams.type = b.i.p.a0.e;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.l.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int r10, int r11, boolean z, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int r112;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f145a.getResources().getDimensionPixelOffset(a.e.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            r10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f145a.getResources().getDimensionPixelOffset(a.e.tooltip_precise_anchor_extra_offset);
            height = r11 + dimensionPixelOffset2;
            r112 = r11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            r112 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f145a.getResources().getDimensionPixelOffset(z ? a.e.tooltip_y_offset_touch : a.e.tooltip_y_offset_non_touch);
        View viewB = b(view);
        if (viewB == null) {
            Log.e(h, "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.e);
        Rect rect = this.e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f145a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f);
        int[] r9 = this.f;
        int r4 = r9[0];
        int[] r5 = this.g;
        r9[0] = r4 - r5[0];
        r9[1] = r9[1] - r5[1];
        layoutParams.x = (r9[0] + r10) - (viewB.getWidth() / 2);
        int r92 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f146b.measure(r92, r92);
        int measuredHeight = this.f146b.getMeasuredHeight();
        int[] r102 = this.f;
        int r2 = ((r102[1] + r112) - dimensionPixelOffset3) - measuredHeight;
        int r103 = r102[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + r103 <= this.e.height() : r2 < 0) {
            layoutParams.y = r2;
        } else {
            layoutParams.y = r103;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f145a.getSystemService("window")).removeView(this.f146b);
        }
    }

    boolean d() {
        return this.f146b.getParent() != null;
    }

    void e(View view, int r9, int r10, boolean z, CharSequence charSequence) throws Resources.NotFoundException {
        if (d()) {
            c();
        }
        this.f147c.setText(charSequence);
        a(view, r9, r10, z, this.d);
        ((WindowManager) this.f145a.getSystemService("window")).addView(this.f146b, this.d);
    }
}

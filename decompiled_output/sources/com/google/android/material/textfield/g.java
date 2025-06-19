package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.k0;
import c.a.b.c.a;
import com.google.android.material.internal.s;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class g extends androidx.appcompat.widget.e {
    private static final int j = 15;

    @h0
    private final k0 g;

    @i0
    private final AccessibilityManager h;

    @h0
    private final Rect i;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int r9, long j) {
            g gVar = g.this;
            g.this.e(r9 < 0 ? gVar.g.C() : gVar.getAdapter().getItem(r9));
            AdapterView.OnItemClickListener onItemClickListener = g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || r9 < 0) {
                    view = g.this.g.F();
                    r9 = g.this.g.E();
                    j = g.this.g.D();
                }
                onItemClickListener.onItemClick(g.this.g.A(), view, r9, j);
            }
            g.this.g.dismiss();
        }
    }

    public g(@h0 Context context) {
        this(context, null);
    }

    public g(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.autoCompleteTextViewStyle);
    }

    public g(@h0 Context context, @i0 AttributeSet attributeSet, int r10) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r10, 0), attributeSet, r10);
        this.i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.MaterialAutoCompleteTextView, r10, a.n.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayJ.hasValue(a.o.MaterialAutoCompleteTextView_android_inputType) && typedArrayJ.getInt(a.o.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.h = (AccessibilityManager) context2.getSystemService("accessibility");
        k0 k0Var = new k0(context2);
        this.g = k0Var;
        k0Var.d0(true);
        this.g.S(this);
        this.g.a0(2);
        this.g.n(getAdapter());
        this.g.f0(new a());
        typedArrayJ.recycle();
    }

    @i0
    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutC = c();
        int r2 = 0;
        if (adapter == null || textInputLayoutC == null) {
            return 0;
        }
        int r3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int r5 = Math.min(adapter.getCount(), Math.max(0, this.g.E()) + 15);
        View view = null;
        int r6 = 0;
        for (int r8 = Math.max(0, r5 - 15); r8 < r5; r8++) {
            int itemViewType = adapter.getItemViewType(r8);
            if (itemViewType != r2) {
                view = null;
                r2 = itemViewType;
            }
            view = adapter.getView(r8, view, textInputLayoutC);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(r3, r4);
            r6 = Math.max(r6, view.getMeasuredWidth());
        }
        Drawable drawableE = this.g.e();
        if (drawableE != null) {
            drawableE.getPadding(this.i);
            Rect rect = this.i;
            r6 += rect.left + rect.right;
        }
        return r6 + textInputLayoutC.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    @i0
    public CharSequence getHint() {
        TextInputLayout textInputLayoutC = c();
        return (textInputLayoutC == null || !textInputLayoutC.X()) ? super.getHint() : textInputLayoutC.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null && textInputLayoutC.X() && super.getHint() == null && com.google.android.material.internal.g.c()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        if (View.MeasureSpec.getMode(r2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(r2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@i0 T t) {
        super.setAdapter(t);
        this.g.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.h) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.g.y();
        } else {
            super.showDropDown();
        }
    }
}

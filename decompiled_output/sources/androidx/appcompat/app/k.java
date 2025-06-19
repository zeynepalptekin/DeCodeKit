package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.x;
import androidx.appcompat.widget.x0;
import b.a.a;
import b.i.p.f0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class k {
    private static final String e = "AppCompatViewInflater";

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f73a = new Object[2];

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f71b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f72c = {R.attr.onClick};
    private static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    private static final b.f.i<String, Constructor<? extends View>> f = new b.f.i<>();

    private static class a implements View.OnClickListener {
        private final View d;
        private final String e;
        private Method f;
        private Context g;

        public a(@h0 View view, @h0 String str) {
            this.d = view;
            this.e = str;
        }

        private void a(@i0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.e, View.class)) != null) {
                        this.f = method;
                        this.g = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.d.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.d.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.e + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.d.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@h0 View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f == null) {
                a(this.d.getContext());
            }
            try {
                this.f.invoke(this.g, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || f0.F0(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f72c);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private View r(Context context, String str, String str2) throws InflateException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String str3;
        Constructor<? extends View> constructor = f.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f71b);
            f.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f73a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f73a[0] = context;
            this.f73a[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            for (int r7 = 0; r7 < d.length; r7++) {
                View viewR = r(context, str, d[r7]);
                if (viewR != null) {
                    return viewR;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr = this.f73a;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(a.m.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(a.m.View_theme, 0)) != 0) {
            Log.i(e, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof b.a.f.d) && ((b.a.f.d) context).c() == resourceId) ? context : new b.a.f.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @h0
    protected androidx.appcompat.widget.e b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.g c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.h d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.i e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.i(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.l f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.n g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.n(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.p h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.p(context, attributeSet);
    }

    @h0
    protected androidx.appcompat.widget.q i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.q(context, attributeSet);
    }

    @h0
    protected t j(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @h0
    protected u k(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @h0
    protected v l(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @h0
    protected x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @h0
    protected a0 n(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    @h0
    protected c0 o(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    @i0
    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View q(View view, String str, @h0 Context context, @h0 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View viewN;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = x0.b(context2);
        }
        switch (str) {
            case "TextView":
                viewN = n(context2, attributeSet);
                u(viewN, str);
                break;
            case "ImageView":
                viewN = h(context2, attributeSet);
                u(viewN, str);
                break;
            case "Button":
                viewN = c(context2, attributeSet);
                u(viewN, str);
                break;
            case "EditText":
                viewN = f(context2, attributeSet);
                u(viewN, str);
                break;
            case "Spinner":
                viewN = m(context2, attributeSet);
                u(viewN, str);
                break;
            case "ImageButton":
                viewN = g(context2, attributeSet);
                u(viewN, str);
                break;
            case "CheckBox":
                viewN = d(context2, attributeSet);
                u(viewN, str);
                break;
            case "RadioButton":
                viewN = j(context2, attributeSet);
                u(viewN, str);
                break;
            case "CheckedTextView":
                viewN = e(context2, attributeSet);
                u(viewN, str);
                break;
            case "AutoCompleteTextView":
                viewN = b(context2, attributeSet);
                u(viewN, str);
                break;
            case "MultiAutoCompleteTextView":
                viewN = i(context2, attributeSet);
                u(viewN, str);
                break;
            case "RatingBar":
                viewN = k(context2, attributeSet);
                u(viewN, str);
                break;
            case "SeekBar":
                viewN = l(context2, attributeSet);
                u(viewN, str);
                break;
            case "ToggleButton":
                viewN = o(context2, attributeSet);
                u(viewN, str);
                break;
            default:
                viewN = p(context2, str, attributeSet);
                break;
        }
        if (viewN == null && context != context2) {
            viewN = s(context2, str, attributeSet);
        }
        if (viewN != null) {
            a(viewN, attributeSet);
        }
        return viewN;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public interface w0 extends SpinnerAdapter {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f201a;

        /* renamed from: b, reason: collision with root package name */
        private final LayoutInflater f202b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutInflater f203c;

        public a(@androidx.annotation.h0 Context context) {
            this.f201a = context;
            this.f202b = LayoutInflater.from(context);
        }

        @androidx.annotation.h0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f203c;
            return layoutInflater != null ? layoutInflater : this.f202b;
        }

        @androidx.annotation.i0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f203c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@androidx.annotation.i0 Resources.Theme theme) {
            this.f203c = theme == null ? null : theme == this.f201a.getTheme() ? this.f202b : LayoutInflater.from(new b.a.f.d(this.f201a, theme));
        }
    }

    @androidx.annotation.i0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@androidx.annotation.i0 Resources.Theme theme);
}

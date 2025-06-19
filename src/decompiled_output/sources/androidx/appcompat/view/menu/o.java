package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o {

    public interface a {
        boolean d();

        boolean e();

        void f(boolean z, char c2);

        void g(j jVar, int r2);

        j getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void c(g gVar);

    int getWindowAnimations();
}

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.n;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface d0 {
    void b(Menu menu, n.a aVar);

    boolean c();

    void d();

    boolean e();

    boolean f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    void n(SparseArray<Parcelable> sparseArray);

    void o(int r1);

    void p();

    void q(SparseArray<Parcelable> sparseArray);

    void setIcon(int r1);

    void setIcon(Drawable drawable);

    void setLogo(int r1);

    void setUiOptions(int r1);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}

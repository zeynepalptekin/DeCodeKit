package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f772c = -1;
    public static final int d = -2;

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f773a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f774b;

    @Deprecated
    public void a(@h0 View view, int r2, @h0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@h0 ViewGroup viewGroup, int r2, @h0 Object obj) {
        a(viewGroup, r2, obj);
    }

    @Deprecated
    public void c(@h0 View view) {
    }

    public void d(@h0 ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(@h0 Object obj) {
        return -1;
    }

    @i0
    public CharSequence g(int r1) {
        return null;
    }

    public float h(int r1) {
        return 1.0f;
    }

    @h0
    @Deprecated
    public Object i(@h0 View view, int r2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @h0
    public Object j(@h0 ViewGroup viewGroup, int r2) {
        return i(viewGroup, r2);
    }

    public abstract boolean k(@h0 View view, @h0 Object obj);

    public void l() {
        synchronized (this) {
            if (this.f774b != null) {
                this.f774b.onChanged();
            }
        }
        this.f773a.notifyChanged();
    }

    public void m(@h0 DataSetObserver dataSetObserver) {
        this.f773a.registerObserver(dataSetObserver);
    }

    public void n(@i0 Parcelable parcelable, @i0 ClassLoader classLoader) {
    }

    @i0
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@h0 View view, int r2, @h0 Object obj) {
    }

    public void q(@h0 ViewGroup viewGroup, int r2, @h0 Object obj) {
        p(viewGroup, r2, obj);
    }

    void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f774b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(@h0 View view) {
    }

    public void t(@h0 ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(@h0 DataSetObserver dataSetObserver) {
        this.f773a.unregisterObserver(dataSetObserver);
    }
}

package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class q extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList<c> d;
    private FrameLayout e;
    private Context f;
    private i g;
    private int h;
    private TabHost.OnTabChangeListener i;
    private c j;
    private boolean k;

    static class a implements TabHost.TabContentFactory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f458a;

        public a(Context context) {
            this.f458a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f458a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        String d;

        static class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int r1) {
                return new b[r1];
            }
        }

        b(Parcel parcel) {
            super(parcel);
            this.d = parcel.readString();
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeString(this.d);
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        @h0
        final String f459a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        final Class<?> f460b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        final Bundle f461c;
        Fragment d;

        c(@h0 String str, @h0 Class<?> cls, @i0 Bundle bundle) {
            this.f459a = str;
            this.f460b = cls;
            this.f461c = bundle;
        }
    }

    @Deprecated
    public q(@h0 Context context) {
        super(context, null);
        this.d = new ArrayList<>();
        f(context, null);
    }

    @Deprecated
    public q(@h0 Context context, @i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList<>();
        f(context, attributeSet);
    }

    @i0
    private r b(@i0 String str, @i0 r rVar) {
        Fragment fragment;
        c cVarE = e(str);
        if (this.j != cVarE) {
            if (rVar == null) {
                rVar = this.g.b();
            }
            c cVar = this.j;
            if (cVar != null && (fragment = cVar.d) != null) {
                rVar.r(fragment);
            }
            if (cVarE != null) {
                Fragment fragment2 = cVarE.d;
                if (fragment2 == null) {
                    Fragment fragmentA = this.g.k().a(this.f.getClassLoader(), cVarE.f460b.getName());
                    cVarE.d = fragmentA;
                    fragmentA.N1(cVarE.f461c);
                    rVar.h(this.h, cVarE.d, cVarE.f459a);
                } else {
                    rVar.m(fragment2);
                }
            }
            this.j = cVarE;
        }
        return rVar;
    }

    private void c() {
        if (this.e == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.h);
            this.e = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.h);
        }
    }

    private void d(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.e = frameLayout2;
            frameLayout2.setId(this.h);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @i0
    private c e(String str) {
        int size = this.d.size();
        for (int r1 = 0; r1 < size; r1++) {
            c cVar = this.d.get(r1);
            if (cVar.f459a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@h0 TabHost.TabSpec tabSpec, @h0 Class<?> cls, @i0 Bundle bundle) {
        tabSpec.setContent(new a(this.f));
        String tag = tabSpec.getTag();
        c cVar = new c(tag, cls, bundle);
        if (this.k) {
            Fragment fragmentG = this.g.g(tag);
            cVar.d = fragmentG;
            if (fragmentG != null && !fragmentG.g0()) {
                r rVarB = this.g.b();
                rVarB.r(cVar.d);
                rVarB.n();
            }
        }
        this.d.add(cVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void g(@h0 Context context, @h0 i iVar) {
        d(context);
        super.setup();
        this.f = context;
        this.g = iVar;
        c();
    }

    @Deprecated
    public void h(@h0 Context context, @h0 i iVar, int r3) {
        d(context);
        super.setup();
        this.f = context;
        this.g = iVar;
        this.h = r3;
        c();
        this.e.setId(r3);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.d.size();
        r rVarB = null;
        for (int r3 = 0; r3 < size; r3++) {
            c cVar = this.d.get(r3);
            Fragment fragmentG = this.g.g(cVar.f459a);
            cVar.d = fragmentG;
            if (fragmentG != null && !fragmentG.g0()) {
                if (cVar.f459a.equals(currentTabTag)) {
                    this.j = cVar;
                } else {
                    if (rVarB == null) {
                        rVarB = this.g.b();
                    }
                    rVarB.r(cVar.d);
                }
            }
        }
        this.k = true;
        r rVarB2 = b(currentTabTag, rVarB);
        if (rVarB2 != null) {
            rVarB2.n();
            this.g.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.d);
    }

    @Override // android.view.View
    @h0
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.d = getCurrentTabTag();
        return bVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@i0 String str) {
        r rVarB;
        if (this.k && (rVarB = b(str, null)) != null) {
            rVarB.n();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.i;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@i0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.i = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}

package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class w extends Fragment {
    static final int r0 = 16711681;
    static final int s0 = 16711682;
    static final int t0 = 16711683;
    private final Handler g0 = new Handler();
    private final Runnable h0 = new a();
    private final AdapterView.OnItemClickListener i0 = new b();
    ListAdapter j0;
    ListView k0;
    View l0;
    TextView m0;
    View n0;
    View o0;
    CharSequence p0;
    boolean q0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = w.this.k0;
            listView.focusableViewAvailable(listView);
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int r9, long j) {
            w.this.t2((ListView) adapterView, view, r9, j);
        }
    }

    private void o2() {
        if (this.k0 != null) {
            return;
        }
        View viewX = X();
        if (viewX == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (viewX instanceof ListView) {
            this.k0 = (ListView) viewX;
        } else {
            TextView textView = (TextView) viewX.findViewById(r0);
            this.m0 = textView;
            if (textView == null) {
                this.l0 = viewX.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.n0 = viewX.findViewById(s0);
            this.o0 = viewX.findViewById(t0);
            View viewFindViewById = viewX.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.k0 = listView;
            View view = this.l0;
            if (view == null) {
                CharSequence charSequence = this.p0;
                if (charSequence != null) {
                    this.m0.setText(charSequence);
                    listView = this.k0;
                    view = this.m0;
                    listView.setEmptyView(view);
                }
            } else {
                listView.setEmptyView(view);
            }
        }
        this.q0 = true;
        this.k0.setOnItemClickListener(this.i0);
        ListAdapter listAdapter = this.j0;
        if (listAdapter != null) {
            this.j0 = null;
            w2(listAdapter);
        } else if (this.n0 != null) {
            y2(false, false);
        }
        this.g0.post(this.h0);
    }

    private void y2(boolean z, boolean z2) {
        o2();
        View view = this.n0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.q0 == z) {
            return;
        }
        this.q0 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_out));
                this.o0.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.o0.clearAnimation();
            }
            this.n0.setVisibility(8);
            this.o0.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_in));
            this.o0.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.o0.clearAnimation();
        }
        this.n0.setVisibility(0);
        this.o0.setVisibility(8);
    }

    public void A2(int r2) {
        o2();
        this.k0.setSelection(r2);
    }

    @Override // androidx.fragment.app.Fragment
    @i0
    public View C0(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle) {
        Context contextC1 = C1();
        FrameLayout frameLayout = new FrameLayout(contextC1);
        LinearLayout linearLayout = new LinearLayout(contextC1);
        linearLayout.setId(s0);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextC1, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextC1);
        frameLayout2.setId(t0);
        TextView textView = new TextView(contextC1);
        textView.setId(r0);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextC1);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void F0() {
        this.g0.removeCallbacks(this.h0);
        this.k0 = null;
        this.q0 = false;
        this.o0 = null;
        this.n0 = null;
        this.l0 = null;
        this.m0 = null;
        super.F0();
    }

    @Override // androidx.fragment.app.Fragment
    public void X0(@h0 View view, @i0 Bundle bundle) {
        super.X0(view, bundle);
        o2();
    }

    @i0
    public ListAdapter p2() {
        return this.j0;
    }

    @h0
    public ListView q2() {
        o2();
        return this.k0;
    }

    public long r2() {
        o2();
        return this.k0.getSelectedItemId();
    }

    public int s2() {
        o2();
        return this.k0.getSelectedItemPosition();
    }

    public void t2(@h0 ListView listView, @h0 View view, int r3, long j) {
    }

    @h0
    public final ListAdapter u2() {
        ListAdapter listAdapterP2 = p2();
        if (listAdapterP2 != null) {
            return listAdapterP2;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void v2(@i0 CharSequence charSequence) {
        o2();
        TextView textView = this.m0;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.p0 == null) {
            this.k0.setEmptyView(this.m0);
        }
        this.p0 = charSequence;
    }

    public void w2(@i0 ListAdapter listAdapter) {
        boolean z = this.j0 != null;
        this.j0 = listAdapter;
        ListView listView = this.k0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.q0 || z) {
                return;
            }
            y2(true, G1().getWindowToken() != null);
        }
    }

    public void x2(boolean z) {
        y2(z, true);
    }

    public void z2(boolean z) {
        y2(z, false);
    }
}

package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.recyclerview.widget.RecyclerView;
import b.i.p.f0;

/* loaded from: classes.dex */
public final class a extends RecyclerView.f0 {
    private a(@h0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @h0
    static a O(@h0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(f0.B());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    @h0
    FrameLayout P() {
        return (FrameLayout) this.f561a;
    }
}

package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.qx2;

/* loaded from: classes.dex */
public final class o extends FrameLayout implements View.OnClickListener {
    private final ImageButton d;
    private final w e;

    public o(Context context, r rVar, @i0 w wVar) {
        super(context);
        this.e = wVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.d = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        this.d.setBackgroundColor(0);
        this.d.setOnClickListener(this);
        ImageButton imageButton2 = this.d;
        qx2.a();
        int r1 = jr.r(context, rVar.f2416a);
        qx2.a();
        int r0 = jr.r(context, 0);
        qx2.a();
        int r2 = jr.r(context, rVar.f2417b);
        qx2.a();
        imageButton2.setPadding(r1, r0, r2, jr.r(context, rVar.d));
        this.d.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.d;
        qx2.a();
        int r12 = jr.r(context, rVar.e + rVar.f2416a + rVar.f2417b);
        qx2.a();
        addView(imageButton3, new FrameLayout.LayoutParams(r12, jr.r(context, rVar.e + rVar.d), 17));
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        int r0;
        if (z) {
            imageButton = this.d;
            r0 = 8;
        } else {
            imageButton = this.d;
            r0 = 0;
        }
        imageButton.setVisibility(r0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.e2();
        }
    }
}

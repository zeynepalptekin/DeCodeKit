package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class t2 extends RelativeLayout {
    private static final float[] e = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    @androidx.annotation.i0
    private AnimationDrawable d;

    public t2(Context context, q2 q2Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.r.k(q2Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(e, null, null));
        shapeDrawable.getPaint().setColor(q2Var.z8());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.p.e();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(q2Var.X2())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(q2Var.X2());
            textView.setTextColor(q2Var.A8());
            textView.setTextSize(q2Var.B8());
            qx2.a();
            int r4 = jr.r(context, 4);
            qx2.a();
            textView.setPadding(r4, 0, jr.r(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<v2> listC8 = q2Var.C8();
        if (listC8 != null && listC8.size() > 1) {
            this.d = new AnimationDrawable();
            Iterator<v2> it = listC8.iterator();
            while (it.hasNext()) {
                try {
                    this.d.addFrame((Drawable) c.a.b.b.e.e.e2(it.next().J6()), q2Var.D8());
                } catch (Exception e2) {
                    tr.c("Error while getting drawable.", e2);
                }
            }
            com.google.android.gms.ads.internal.p.e();
            imageView.setBackground(this.d);
        } else if (listC8.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) c.a.b.b.e.e.e2(listC8.get(0).J6()));
            } catch (Exception e3) {
                tr.c("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.d;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

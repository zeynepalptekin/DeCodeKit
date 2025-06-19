package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
class s {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f190c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f191a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f192b;

    s(ProgressBar progressBar) {
        this.f191a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable d(Drawable drawable, boolean z) {
        if (drawable instanceof androidx.core.graphics.drawable.f) {
            androidx.core.graphics.drawable.f fVar = (androidx.core.graphics.drawable.f) drawable;
            Drawable drawableB = fVar.b();
            if (drawableB != null) {
                fVar.a(d(drawableB, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int r3 = 0; r3 < numberOfLayers; r3++) {
                    int id = layerDrawable.getId(r3);
                    drawableArr[r3] = d(layerDrawable.getDrawable(r3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int r2 = 0; r2 < numberOfLayers; r2++) {
                    layerDrawable2.setId(r2, layerDrawable.getId(r2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f192b == null) {
                    this.f192b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int r2 = 0; r2 < numberOfFrames; r2++) {
            Drawable drawableD = d(animationDrawable.getFrame(r2), true);
            drawableD.setLevel(10000);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(r2));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f192b;
    }

    void c(AttributeSet attributeSet, int r5) {
        a1 a1VarG = a1.G(this.f191a.getContext(), attributeSet, f190c, r5, 0);
        Drawable drawableI = a1VarG.i(0);
        if (drawableI != null) {
            this.f191a.setIndeterminateDrawable(e(drawableI));
        }
        Drawable drawableI2 = a1VarG.i(1);
        if (drawableI2 != null) {
            this.f191a.setProgressDrawable(d(drawableI2, false));
        }
        a1VarG.I();
    }
}

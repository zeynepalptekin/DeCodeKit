package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: b, reason: collision with root package name */
    private static final int f382b = 1048576;

    /* renamed from: c, reason: collision with root package name */
    private static final String f383c = "sharedElement:snapshot:bitmap";
    private static final String d = "sharedElement:snapshot:imageScaleType";
    private static final String e = "sharedElement:snapshot:imageMatrix";

    /* renamed from: a, reason: collision with root package name */
    private Matrix f384a;

    public interface a {
        void a();
    }

    private static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int r0 = (int) (intrinsicWidth * fMin);
        int r1 = (int) (intrinsicHeight * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r0, r1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = drawable.getBounds();
        int r5 = bounds.left;
        int r6 = bounds.top;
        int r7 = bounds.right;
        int r4 = bounds.bottom;
        drawable.setBounds(0, 0, r0, r1);
        drawable.draw(canvas);
        drawable.setBounds(r5, r6, r7, r4);
        return bitmapCreateBitmap;
    }

    public Parcelable b(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapA;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapA = a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f383c, bitmapA);
                bundle.putString(d, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(e, fArr);
                }
                return bundle;
            }
        }
        int r0 = Math.round(rectF.width());
        int r1 = Math.round(rectF.height());
        if (r0 <= 0 || r1 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (r0 * r1));
        int r02 = (int) (r0 * fMin);
        int r12 = (int) (r1 * fMin);
        if (this.f384a == null) {
            this.f384a = new Matrix();
        }
        this.f384a.set(matrix);
        this.f384a.postTranslate(-rectF.left, -rectF.top);
        this.f384a.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r02, r12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.f384a);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public View c(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f383c);
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(d)));
        if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
            return imageView2;
        }
        float[] floatArray = bundle.getFloatArray(e);
        Matrix matrix = new Matrix();
        matrix.setValues(floatArray);
        imageView2.setImageMatrix(matrix);
        return imageView2;
    }

    public void d(List<String> list, Map<String, View> map) {
    }

    public void e(List<View> list) {
    }

    public void f(List<String> list, List<View> list2, List<View> list3) {
    }

    public void g(List<String> list, List<View> list2, List<View> list3) {
    }

    public void h(List<String> list, List<View> list2, a aVar) {
        aVar.a();
    }
}

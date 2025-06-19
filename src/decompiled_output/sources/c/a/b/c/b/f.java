package c.a.b.c.b;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f1942a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f1942a = new Matrix();
    }

    @Override // android.util.Property
    @h0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(@h0 ImageView imageView) {
        this.f1942a.set(imageView.getImageMatrix());
        return this.f1942a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@h0 ImageView imageView, @h0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}

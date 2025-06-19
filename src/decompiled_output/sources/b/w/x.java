package b.w;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes.dex */
class x<T> extends Property<T, Float> {

    /* renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f1515a;

    /* renamed from: b, reason: collision with root package name */
    private final PathMeasure f1516b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1517c;
    private final float[] d;
    private final PointF e;
    private float f;

    x(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.d = new float[2];
        this.e = new PointF();
        this.f1515a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f1516b = pathMeasure;
        this.f1517c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f) {
        this.f = f.floatValue();
        this.f1516b.getPosTan(this.f1517c * f.floatValue(), this.d, null);
        PointF pointF = this.e;
        float[] fArr = this.d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f1515a.set(t, pointF);
    }
}

package b.v.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import b.i.p.f0;

/* loaded from: classes.dex */
class a extends ImageView {
    private static final int f = 503316480;
    private static final int g = 1023410176;
    private static final float h = 0.0f;
    private static final float i = 1.75f;
    private static final float j = 3.5f;
    private static final int k = 4;
    private Animation.AnimationListener d;
    int e;

    /* renamed from: b.v.b.a$a, reason: collision with other inner class name */
    private class C0103a extends OvalShape {
        private RadialGradient d;
        private Paint e = new Paint();

        C0103a(int r3) {
            a.this.e = r3;
            b((int) rect().width());
        }

        private void b(int r9) {
            float f = r9 / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, a.this.e, new int[]{a.g, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.d = radialGradient;
            this.e.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.e);
            canvas.drawCircle(width, height, r0 - a.this.e, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            b((int) f);
        }
    }

    a(Context context, int r7) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int r0 = (int) (i * f2);
        int r1 = (int) (0.0f * f2);
        this.e = (int) (j * f2);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            f0.G1(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0103a(this.e));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.e, r1, r0, f);
            int r6 = this.e;
            setPadding(r6, r6, r6, r6);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(r7);
        f0.B1(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.d = animationListener;
    }

    public void c(int r2) {
        setBackgroundColor(b.i.c.c.e(getContext(), r2));
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.d;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.d;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.e * 2), getMeasuredHeight() + (this.e * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(r2);
        }
    }
}

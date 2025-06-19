package c.a.b.c.v;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o;
import androidx.annotation.p;
import androidx.annotation.z;
import c.a.b.c.a;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class g extends c<g, a, b> {

    public interface a extends c.a.b.c.v.a<g> {
    }

    public interface b extends c.a.b.c.v.b<g> {
    }

    public g(@h0 Context context) {
        this(context, null);
    }

    public g(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.sliderStyle);
    }

    public g(@h0 Context context, @i0 AttributeSet attributeSet, int r5) {
        super(context, attributeSet, r5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ boolean F() {
        return super.F();
    }

    @Override // c.a.b.c.v.c
    protected boolean S() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // c.a.b.c.v.c, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@h0 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // c.a.b.c.v.c, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@h0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.a.b.c.v.c, android.view.View
    @h0
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // c.a.b.c.v.c
    @p
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // c.a.b.c.v.c
    @p
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // c.a.b.c.v.c
    @p
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // c.a.b.c.v.c
    @p
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // c.a.b.c.v.c
    @h0
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // c.a.b.c.v.c
    @p
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // c.a.b.c.v.c, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int r1, @h0 KeyEvent keyEvent) {
        return super.onKeyDown(r1, keyEvent);
    }

    @Override // c.a.b.c.v.c, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int r1, @h0 KeyEvent keyEvent) {
        return super.onKeyUp(r1, keyEvent);
    }

    @Override // c.a.b.c.v.c, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@h0 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    @Override // c.a.b.c.v.c, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int r1) {
        super.setFocusedThumbIndex(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setHaloRadius(@p @z(from = FabTransformationScrimBehavior.j) int r1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.setHaloRadius(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@o int r1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.setHaloRadiusResource(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setHaloTintList(@h0 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setLabelBehavior(int r1) {
        super.setLabelBehavior(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setLabelFormatter(@i0 e eVar) {
        super.setLabelFormatter(eVar);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@o int r1) {
        super.setThumbElevationResource(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setThumbRadius(@p @z(from = FabTransformationScrimBehavior.j) int r1) {
        super.setThumbRadius(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@o int r1) {
        super.setThumbRadiusResource(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setThumbTintList(@h0 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@h0 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@h0 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTickTintList(@h0 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@h0 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTrackHeight(@p @z(from = FabTransformationScrimBehavior.j) int r1) {
        super.setTrackHeight(r1);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@h0 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setTrackTintList(@h0 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // c.a.b.c.v.c
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }
}

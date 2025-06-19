package b.a.f;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.m0;
import androidx.annotation.p0;
import java.util.List;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i implements Window.Callback {
    final Window.Callback d;

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.d = callback;
    }

    public final Window.Callback a() {
        return this.d;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.d.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.d.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, Menu menu) {
        return this.d.onCreatePanelMenu(r2, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int r2) {
        return this.d.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, MenuItem menuItem) {
        return this.d.onMenuItemSelected(r2, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, Menu menu) {
        return this.d.onMenuOpened(r2, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, Menu menu) {
        this.d.onPanelClosed(r2, menu);
    }

    @Override // android.view.Window.Callback
    @m0(26)
    public void onPointerCaptureChanged(boolean z) {
        this.d.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, View view, Menu menu) {
        return this.d.onPreparePanel(r2, view, menu);
    }

    @Override // android.view.Window.Callback
    @m0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int r4) {
        this.d.onProvideKeyboardShortcuts(list, menu, r4);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @m0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.d.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.d.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.d.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @m0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int r3) {
        return this.d.onWindowStartingActionMode(callback, r3);
    }
}

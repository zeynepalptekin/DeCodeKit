package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
/* loaded from: classes.dex */
public final class ws extends kt implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> u = new HashMap();
    private final cu f;
    private final boolean g;
    private int h;
    private int i;
    private MediaPlayer j;
    private Uri k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private xt q;
    private boolean r;
    private int s;
    private ht t;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            u.put(-1004, "MEDIA_ERROR_IO");
            u.put(-1007, "MEDIA_ERROR_MALFORMED");
            u.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            u.put(-110, "MEDIA_ERROR_TIMED_OUT");
            u.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        u.put(100, "MEDIA_ERROR_SERVER_DIED");
        u.put(1, "MEDIA_ERROR_UNKNOWN");
        u.put(1, "MEDIA_INFO_UNKNOWN");
        u.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        u.put(701, "MEDIA_INFO_BUFFERING_START");
        u.put(702, "MEDIA_INFO_BUFFERING_END");
        u.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        u.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        u.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            u.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            u.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public ws(Context context, boolean z, boolean z2, au auVar, cu cuVar) {
        super(context);
        this.h = 0;
        this.i = 0;
        setSurfaceTextureListener(this);
        this.f = cuVar;
        this.r = z;
        this.g = z2;
        cuVar.d(this);
    }

    private final void t(boolean z) {
        oo.m("AdMediaPlayerView release");
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.j();
            this.q = null;
        }
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.j.release();
            this.j = null;
            v(0);
            if (z) {
                this.i = 0;
                this.i = 0;
            }
        }
    }

    private final void u(float f) {
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer == null) {
            tr.i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final void v(int r3) {
        if (r3 == 3) {
            this.f.b();
            this.e.d();
        } else if (this.h == 3) {
            this.f.c();
            this.e.e();
        }
        this.h = r3;
    }

    private final void x() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        oo.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.k == null || surfaceTexture == null) {
            return;
        }
        t(false);
        try {
            com.google.android.gms.ads.internal.p.s();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.j = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.j.setOnCompletionListener(this);
            this.j.setOnErrorListener(this);
            this.j.setOnInfoListener(this);
            this.j.setOnPreparedListener(this);
            this.j.setOnVideoSizeChangedListener(this);
            this.n = 0;
            if (this.r) {
                xt xtVar = new xt(getContext());
                this.q = xtVar;
                xtVar.b(surfaceTexture, getWidth(), getHeight());
                this.q.start();
                SurfaceTexture surfaceTextureK = this.q.k();
                if (surfaceTextureK != null) {
                    surfaceTexture = surfaceTextureK;
                } else {
                    this.q.j();
                    this.q = null;
                }
            }
            this.j.setDataSource(getContext(), this.k);
            com.google.android.gms.ads.internal.p.t();
            this.j.setSurface(new Surface(surfaceTexture));
            this.j.setAudioStreamType(3);
            this.j.setScreenOnWhilePlaying(true);
            this.j.prepareAsync();
            v(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String strValueOf = String.valueOf(this.k);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(strValueOf);
            tr.d(sb.toString(), e);
            onError(this.j, 1, 0);
        }
    }

    private final void y() throws IllegalStateException {
        if (this.g && z() && this.j.getCurrentPosition() > 0 && this.i != 3) {
            oo.m("AdMediaPlayerView nudging MediaPlayer");
            u(0.0f);
            this.j.start();
            int currentPosition = this.j.getCurrentPosition();
            long jA = com.google.android.gms.ads.internal.p.j().a();
            while (z() && this.j.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.p.j().a() - jA <= 250) {
            }
            this.j.pause();
            a();
        }
    }

    private final boolean z() {
        int r0;
        return (this.j == null || (r0 = this.h) == -1 || r0 == 0 || r0 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.kt, com.google.android.gms.internal.ads.du
    public final void a() {
        u(this.e.a());
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void d() throws IllegalStateException {
        oo.m("AdMediaPlayerView pause");
        if (z() && this.j.isPlaying()) {
            this.j.pause();
            v(4);
            to.h.post(new it(this));
        }
        this.i = 4;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void f() throws IllegalStateException {
        oo.m("AdMediaPlayerView play");
        if (z()) {
            this.j.start();
            v(3);
            this.d.b();
            to.h.post(new ft(this));
        }
        this.i = 3;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getCurrentPosition() {
        if (z()) {
            return this.j.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getDuration() {
        if (z()) {
            return this.j.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void h(int r3) throws IllegalStateException {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(r3);
        oo.m(sb.toString());
        if (!z()) {
            this.s = r3;
        } else {
            this.j.seekTo(r3);
            this.s = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void i() throws IllegalStateException {
        oo.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.j.release();
            this.j = null;
            v(0);
            this.i = 0;
        }
        this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void j(float f, float f2) {
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.e(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void k(ht htVar) {
        this.t = htVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int r2) {
        this.n = r2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        oo.m("AdMediaPlayerView completion");
        v(5);
        this.i = 5;
        to.h.post(new bt(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int r3, int r4) {
        String str = u.get(Integer.valueOf(r3));
        String str2 = u.get(Integer.valueOf(r4));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        tr.i(sb.toString());
        v(-1);
        this.i = -1;
        to.h.post(new at(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int r3, int r4) {
        String str = u.get(Integer.valueOf(r3));
        String str2 = u.get(Integer.valueOf(r4));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        oo.m(sb.toString());
        return true;
    }

    @Override // android.view.View
    protected final void onMeasure(int r6, int r7) throws IllegalStateException {
        int r62;
        int defaultSize = TextureView.getDefaultSize(this.l, r6);
        int defaultSize2 = TextureView.getDefaultSize(this.m, r7);
        if (this.l > 0 && this.m > 0 && this.q == null) {
            int mode = View.MeasureSpec.getMode(r6);
            int size = View.MeasureSpec.getSize(r6);
            int mode2 = View.MeasureSpec.getMode(r7);
            int size2 = View.MeasureSpec.getSize(r7);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int r0 = this.l;
                int r1 = r0 * size2;
                int r2 = this.m;
                if (r1 < size * r2) {
                    defaultSize = (r0 * size2) / r2;
                    defaultSize2 = size2;
                } else {
                    if (r0 * size2 > size * r2) {
                        defaultSize2 = (r2 * size) / r0;
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int r02 = (this.m * size) / this.l;
                if (mode2 != Integer.MIN_VALUE || r02 <= size2) {
                    defaultSize2 = r02;
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int r12 = (this.l * size2) / this.m;
                defaultSize = (mode != Integer.MIN_VALUE || r12 <= size) ? r12 : size;
                defaultSize2 = size2;
            } else {
                int r22 = this.l;
                int r4 = this.m;
                if (mode2 != Integer.MIN_VALUE || r4 <= size2) {
                    defaultSize2 = r4;
                } else {
                    r22 = (r22 * size2) / r4;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || r22 <= size) {
                    defaultSize = r22;
                } else {
                    defaultSize2 = (this.m * size) / this.l;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.i(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int r63 = this.o;
            if ((r63 > 0 && r63 != defaultSize) || ((r62 = this.p) > 0 && r62 != defaultSize2)) {
                y();
            }
            this.o = defaultSize;
            this.p = defaultSize2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        oo.m("AdMediaPlayerView prepared");
        v(2);
        this.f.f();
        to.h.post(new ys(this));
        this.l = mediaPlayer.getVideoWidth();
        this.m = mediaPlayer.getVideoHeight();
        int r4 = this.s;
        if (r4 != 0) {
            h(r4);
        }
        y();
        int r42 = this.l;
        int r0 = this.m;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(r42);
        sb.append(" x ");
        sb.append(r0);
        tr.h(sb.toString());
        if (this.i == 3) {
            f();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int r2, int r3) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        oo.m("AdMediaPlayerView surface created");
        x();
        to.h.post(new dt(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        oo.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null && this.s == 0) {
            this.s = mediaPlayer.getCurrentPosition();
        }
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.j();
        }
        to.h.post(new gt(this));
        t(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int r5, int r6) throws IllegalStateException {
        oo.m("AdMediaPlayerView surface changed");
        boolean z = this.i == 3;
        boolean z2 = this.l == r5 && this.m == r6;
        if (this.j != null && z && z2) {
            int r4 = this.s;
            if (r4 != 0) {
                h(r4);
            }
            f();
        }
        xt xtVar = this.q;
        if (xtVar != null) {
            xtVar.i(r5, r6);
        }
        to.h.post(new ct(this, r5, r6));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f.e(this);
        this.d.a(surfaceTexture, this.t);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int r4, int r5) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(r4);
        sb.append(" x ");
        sb.append(r5);
        oo.m(sb.toString());
        this.l = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.m = videoHeight;
        if (this.l == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int r3) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(r3);
        oo.m(sb.toString());
        to.h.post(new Runnable(this, r3) { // from class: com.google.android.gms.internal.ads.zs
            private final ws d;
            private final int e;

            {
                this.d = this;
                this.e = r3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.w(this.e);
            }
        });
        super.onWindowVisibilityChanged(r3);
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final String r() {
        String str = this.r ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void setVideoPath(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        fu2 fu2VarI = fu2.i(uri);
        if (fu2VarI == null || fu2VarI.d != null) {
            if (fu2VarI != null) {
                uri = Uri.parse(fu2VarI.d);
            }
            this.k = uri;
            this.s = 0;
            x();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = ws.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    final /* synthetic */ void w(int r2) {
        ht htVar = this.t;
        if (htVar != null) {
            htVar.onWindowVisibilityChanged(r2);
        }
    }
}

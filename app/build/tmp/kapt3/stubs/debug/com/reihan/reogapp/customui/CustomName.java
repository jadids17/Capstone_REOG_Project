package com.reihan.reogapp.customui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/reihan/reogapp/customui/CustomName;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clearButtonImage", "Landroid/graphics/drawable/Drawable;", "hideClearButton", "", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "setButtonDrawables", "startOfTheText", "topOfTheText", "endOfTheText", "bottomOfTheText", "showClearButton", "app_debug"})
public final class CustomName extends androidx.appcompat.widget.AppCompatEditText implements android.view.View.OnTouchListener {
    private android.graphics.drawable.Drawable clearButtonImage;
    
    public CustomName(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public CustomName(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomName(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void init() {
    }
    
    private final void showClearButton() {
    }
    
    private final void hideClearButton() {
    }
    
    private final void setButtonDrawables(android.graphics.drawable.Drawable startOfTheText, android.graphics.drawable.Drawable topOfTheText, android.graphics.drawable.Drawable endOfTheText, android.graphics.drawable.Drawable bottomOfTheText) {
    }
    
    @java.lang.Override
    public boolean onTouch(@org.jetbrains.annotations.Nullable
    android.view.View v, @org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
}
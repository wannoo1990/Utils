package com.sixun.basework.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.CycleInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/**
 * 动画工具类
 *
 */
public final class AnimationUtils {

    /**
     * 不能实例化此类
     */
    private AnimationUtils() {
        throw new Error("Do not need instantiate!");
    }

    /**
     * 默认动画持续时间
     */
    public static final long DEFAULT_ANIMATION_DURATION = 400;
    
    /*
     * **********************旋转动画*********************************
     */

    /**
     * 获取一个旋转动画
     *
     * @param fromDegrees       开始角度
     * @param toDegrees         结束角度
     * @param pivotXType        旋转中心点X轴坐标相对类型
     * @param pivotXValue       旋转中心点X轴坐标
     * @param pivotYType        旋转中心点Y轴坐标相对类型
     * @param pivotYValue       旋转中心点Y轴坐标
     * @param durationMillis    持续时间
     * @param animationListener 动画监听器
     * @return 一个旋转动画
     */
    public static RotateAnimation getRotateAnimation(float fromDegrees, float toDegrees, int pivotXType, float pivotXValue, int pivotYType, float pivotYValue, long durationMillis, AnimationListener animationListener) {
        RotateAnimation rotateAnimation = new RotateAnimation(fromDegrees, toDegrees, pivotXType, pivotXValue, pivotYType, pivotYValue);
        rotateAnimation.setDuration(durationMillis);
        if (animationListener != null) {
            rotateAnimation.setAnimationListener(animationListener);
        }
        return rotateAnimation;
    }

    /**
     * 获取一个根据视图自身中心点旋转的动画
     *
     * @param durationMillis    动画持续时间
     * @param animationListener 动画监听器
     * @return 一个根据中心点旋转的动画
     */
    public static RotateAnimation getRotateAnimationByCenter(long durationMillis, AnimationListener animationListener) {
        return getRotateAnimation(0f, 359f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f, durationMillis, animationListener);
    }

    /**
     * 获取一个根据视图自身中心点旋转的动画
     *
     * @param duration 动画持续时间
     * @return 一个根据中心点旋转的动画
     */
    public static RotateAnimation getRotateAnimationByCenter(long duration) {
        return getRotateAnimationByCenter(duration, null);
    }

    /**
     * 获取一个根据视图自身中心点旋转的动画
     *
     * @param animationListener 动画监听器
     * @return 一个根据中心点旋转的动画
     */
    public static RotateAnimation getRotateAnimationByCenter(AnimationListener animationListener) {
        return getRotateAnimationByCenter(DEFAULT_ANIMATION_DURATION, animationListener);
    }

    /**
     * 获取一个根据中心点旋转的动画
     *
     * @return 一个根据中心点旋转的动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static RotateAnimation getRotateAnimationByCenter() {
        return getRotateAnimationByCenter(DEFAULT_ANIMATION_DURATION, null);
    }
    
    /*
     * **********************透明渐变动画*********************************
     */

    /**
     * 获取一个透明度渐变动画
     *
     * @param fromAlpha         开始时的透明度
     * @param toAlpha           结束时的透明度都
     * @param durationMillis    持续时间
     * @param animationListener 动画监听器
     * @return 一个透明度渐变动画
     */
    public static AlphaAnimation getAlphaAnimation(float fromAlpha, float toAlpha, long durationMillis, AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(fromAlpha, toAlpha);
        alphaAnimation.setDuration(durationMillis);
        if (animationListener != null) {
            alphaAnimation.setAnimationListener(animationListener);
        }
        return alphaAnimation;
    }

    /**
     * 获取一个透明度渐变动画
     *
     * @param fromAlpha      开始时的透明度
     * @param toAlpha        结束时的透明度都
     * @param durationMillis 持续时间
     * @return 一个透明度渐变动画
     */
    public static AlphaAnimation getAlphaAnimation(float fromAlpha, float toAlpha, long durationMillis) {
        return getAlphaAnimation(fromAlpha, toAlpha, durationMillis, null);
    }

    /**
     * 获取一个透明度渐变动画
     *
     * @param fromAlpha         开始时的透明度
     * @param toAlpha           结束时的透明度都
     * @param animationListener 动画监听器
     * @return 一个透明度渐变动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static AlphaAnimation getAlphaAnimation(float fromAlpha, float toAlpha, AnimationListener animationListener) {
        return getAlphaAnimation(fromAlpha, toAlpha, DEFAULT_ANIMATION_DURATION, animationListener);
    }

    /**
     * 获取一个透明度渐变动画
     *
     * @param fromAlpha 开始时的透明度
     * @param toAlpha   结束时的透明度都
     * @return 一个透明度渐变动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static AlphaAnimation getAlphaAnimation(float fromAlpha, float toAlpha) {
        return getAlphaAnimation(fromAlpha, toAlpha, DEFAULT_ANIMATION_DURATION, null);
    }

    /**
     * 获取一个由完全显示变为不可见的透明度渐变动画
     *
     * @param durationMillis    持续时间
     * @param animationListener 动画监听器
     * @return 一个由完全显示变为不可见的透明度渐变动画
     */
    public static AlphaAnimation getHiddenAlphaAnimation(long durationMillis, AnimationListener animationListener) {
        return getAlphaAnimation(1.0f, 0.0f, durationMillis, animationListener);
    }

    /**
     * 获取一个由完全显示变为不可见的透明度渐变动画
     *
     * @param durationMillis 持续时间
     * @return 一个由完全显示变为不可见的透明度渐变动画
     */
    public static AlphaAnimation getHiddenAlphaAnimation(long durationMillis) {
        return getHiddenAlphaAnimation(durationMillis, null);
    }

    /**
     * 获取一个由完全显示变为不可见的透明度渐变动画
     *
     * @param animationListener 动画监听器
     * @return 一个由完全显示变为不可见的透明度渐变动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static AlphaAnimation getHiddenAlphaAnimation(AnimationListener animationListener) {
        return getHiddenAlphaAnimation(DEFAULT_ANIMATION_DURATION, animationListener);
    }

    /**
     * 获取一个由完全显示变为不可见的透明度渐变动画
     *
     * @return 一个由完全显示变为不可见的透明度渐变动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static AlphaAnimation getHiddenAlphaAnimation() {
        return getHiddenAlphaAnimation(DEFAULT_ANIMATION_DURATION, null);
    }

    /**
     * 获取一个由不可见变为完全显示的透明度渐变动画
     *
     * @param durationMillis    持续时间
     * @param animationListener 动画监听器
     * @return 一个由不可见变为完全显示的透明度渐变动画
     */
    public static AlphaAnimation getShowAlphaAnimation(long durationMillis, AnimationListener animationListener) {
        return getAlphaAnimation(0.0f, 1.0f, durationMillis, animationListener);
    }

    /**
     * 获取一个由不可见变为完全显示的透明度渐变动画
     *
     * @param durationMillis 持续时间
     * @return 一个由不可见变为完全显示的透明度渐变动画
     */
    public static AlphaAnimation getShowAlphaAnimation(long durationMillis) {
        return getAlphaAnimation(0.0f, 1.0f, durationMillis, null);
    }

    /**
     * 获取一个由不可见变为完全显示的透明度渐变动画
     *
     * @param animationListener 动画监听器
     * @return 一个由不可见变为完全显示的透明度渐变动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static AlphaAnimation getShowAlphaAnimation(AnimationListener animationListener) {
        return getAlphaAnimation(0.0f, 1.0f, DEFAULT_ANIMATION_DURATION, animationListener);
    }

    /**
     * 获取一个由不可见变为完全显示的透明度渐变动画
     *
     * @return 一个由不可见变为完全显示的透明度渐变动画，默认持续时间为DEFAULT_ANIMATION_DURATION
     */
    public static AlphaAnimation getShowAlphaAnimation() {
        return getAlphaAnimation(0.0f, 1.0f, DEFAULT_ANIMATION_DURATION, null);
    }
    
    /*
     * **********************缩小放大动画*********************************
     */

    /**
     * 获取一个缩小动画
     *
     * @param durationMillis 持续时间
     * @param animationListener 动画监听器
     * @return 返回一个缩小的动画
     */
    public static ScaleAnimation getLessenScaleAnimation(long durationMillis, AnimationListener animationListener) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, ScaleAnimation.RELATIVE_TO_SELF, ScaleAnimation.RELATIVE_TO_SELF);
        if(animationListener!=null){
        	  scaleAnimation.setDuration(durationMillis);
        }
        scaleAnimation.setAnimationListener(animationListener);
        return scaleAnimation;
    }

    /**
     * 获取一个缩小动画
     *
     * @param durationMillis 持续时间
     * @return 返回一个缩小的动画
     */
    public static ScaleAnimation getLessenScaleAnimation(long durationMillis) {
        return getLessenScaleAnimation(durationMillis,null);
    }

    /**
     * 获取一个缩小动画
     *
     * @param animationListener 动画监听器
     * @return 返回一个缩小的动画
     */
    public static ScaleAnimation getLessenScaleAnimation(AnimationListener animationListener) {
        return getLessenScaleAnimation(DEFAULT_ANIMATION_DURATION, animationListener);
    }

    /**
     * 获取一个放大动画
     *
     * @param durationMillis  持续时间
     * @param animationListener 动画监听器
     * @return 返回一个放大的效果
     */
    public static ScaleAnimation getAmplificationAnimation(long durationMillis, AnimationListener animationListener) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, ScaleAnimation.RELATIVE_TO_SELF, ScaleAnimation.RELATIVE_TO_SELF);
        scaleAnimation.setDuration(durationMillis);
        if(animationListener!=null){
        	 scaleAnimation.setAnimationListener(animationListener);
        }
        return scaleAnimation;
    }

    /**
     * 获取一个放大动画
     *
     * @param durationMillis  持续时间
     * @return 返回一个放大的效果
     */
    public static ScaleAnimation getAmplificationAnimation(long durationMillis) {
        return getLessenScaleAnimation(durationMillis,null);
    }

    /**
     * 获取一个放大动画
     *
     * @param animationListener  动画监听器
     * @return 返回一个放大的效果
     */
    public static ScaleAnimation getAmplificationAnimation(AnimationListener animationListener) {
        return getLessenScaleAnimation(DEFAULT_ANIMATION_DURATION, animationListener);
    }
    
    /*
     *  **************************视图透明度渐变动画*********************************** 
	 * 
	 */

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)）
     *
     * @param view              被处理的视图
     * @param isBanClick        在执行动画的过程中是否禁止点击
     * @param durationMillis    持续时间，毫秒
     * @param animationListener 动画监听器
     */
    public static void invisibleViewByAlpha(final View view,long durationMillis, final boolean isBanClick,
    		final AnimationListener animationListener) {
        if (view.getVisibility() != View.INVISIBLE) {
            view.setVisibility(View.INVISIBLE);
            AlphaAnimation hiddenAlphaAnimation = getHiddenAlphaAnimation(durationMillis);
            hiddenAlphaAnimation.setAnimationListener(new AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    if (isBanClick) {
                        view.setClickable(false);
                    }
                    if (animationListener != null) {
                        animationListener.onAnimationStart(animation);
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    if (animationListener != null) {
                        animationListener.onAnimationRepeat(animation);
                    }
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    if (isBanClick) {
                        view.setClickable(true);
                    }
                    if (animationListener != null) {
                        animationListener.onAnimationEnd(animation);
                    }
                }
            });
            view.startAnimation(hiddenAlphaAnimation);
        }
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)）
     *
     * @param view              被处理的视图
     * @param durationMillis    持续时间，毫秒
     * @param animationListener 动画监听器
     */
    public static void invisibleViewByAlpha(final View view,
                                            long durationMillis, final AnimationListener animationListener) {
        invisibleViewByAlpha(view, durationMillis, false, animationListener);
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)）
     *
     * @param view           被处理的视图
     * @param durationMillis 持续时间，毫秒
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void invisibleViewByAlpha(final View view,
                                            long durationMillis, boolean isBanClick) {
        invisibleViewByAlpha(view, durationMillis, isBanClick, null);
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)）
     *
     * @param view           被处理的视图
     * @param durationMillis 持续时间，毫秒
     */
    public static void invisibleViewByAlpha(final View view, long durationMillis) {
        invisibleViewByAlpha(view, durationMillis, false, null);
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view              被处理的视图
     * @param isBanClick        在执行动画的过程中是否禁止点击
     * @param animationListener 动画监听器
     */
    public static void invisibleViewByAlpha(final View view,
                                            boolean isBanClick, final AnimationListener animationListener) {
        invisibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                isBanClick, animationListener);
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view              被处理的视图
     * @param animationListener 动画监听器
     */
    public static void invisibleViewByAlpha(final View view,
                                            final AnimationListener animationListener) {
        invisibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                false, animationListener);
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view       被处理的视图
     * @param isBanClick 在执行动画的过程中是否禁止点击
     */
    public static void invisibleViewByAlpha(final View view, boolean isBanClick) {
        invisibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                isBanClick, null);
    }

    /**
     * 将给定视图渐渐隐去（view.setVisibility(View.INVISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view 被处理的视图
     */
    public static void invisibleViewByAlpha(final View view) {
        invisibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                false, null);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)）
     *
     * @param view              被处理的视图
     * @param durationMillis    持续时间，毫秒
     * @param isBanClick        在执行动画的过程中是否禁止点击
     * @param animationListener 动画监听器
     */
    public static void goneViewByAlpha(final View view, long durationMillis,
                                       final boolean isBanClick, final AnimationListener animationListener) {
        if (view.getVisibility() != View.GONE) {
            view.setVisibility(View.GONE);
            AlphaAnimation hiddenAlphaAnimation = getHiddenAlphaAnimation(durationMillis);
            hiddenAlphaAnimation.setAnimationListener(new AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    if (isBanClick) {
                        view.setClickable(false);
                    }
                    if (animationListener != null) {
                        animationListener.onAnimationStart(animation);
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    if (animationListener != null) {
                        animationListener.onAnimationRepeat(animation);
                    }
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    if (isBanClick) {
                        view.setClickable(true);
                    }
                    if (animationListener != null) {
                        animationListener.onAnimationEnd(animation);
                    }
                }
            });
            view.startAnimation(hiddenAlphaAnimation);
        }
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)）
     *
     * @param view              被处理的视图
     * @param durationMillis    持续时间，毫秒
     * @param animationListener 动画监听器
     */
    public static void goneViewByAlpha(final View view, long durationMillis,
                                       final AnimationListener animationListener) {
        goneViewByAlpha(view, durationMillis, false, animationListener);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)）
     *
     * @param view           被处理的视图
     * @param durationMillis 持续时间，毫秒
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void goneViewByAlpha(final View view, long durationMillis,
                                       final boolean isBanClick) {
        goneViewByAlpha(view, durationMillis, isBanClick, null);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)）
     *
     * @param view           被处理的视图
     * @param durationMillis 持续时间，毫秒
     */
    public static void goneViewByAlpha(final View view, long durationMillis) {
        goneViewByAlpha(view, durationMillis, false, null);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view              被处理的视图
     * @param isBanClick        在执行动画的过程中是否禁止点击
     * @param animationListener 动画监听器
     */
    public static void goneViewByAlpha(final View view,
                                       final boolean isBanClick, final AnimationListener animationListener) {
        goneViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                isBanClick, animationListener);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view              被处理的视图
     * @param animationListener 动画监听器
     */
    public static void goneViewByAlpha(final View view,
                                       final AnimationListener animationListener) {
        goneViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION, false,
                animationListener);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view       被处理的视图
     * @param isBanClick 在执行动画的过程中是否禁止点击
     */
    public static void goneViewByAlpha(final View view, final boolean isBanClick) {
        goneViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                isBanClick, null);
    }

    /**
     * 将给定视图渐渐隐去最后从界面中移除（view.setVisibility(View.GONE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view 被处理的视图
     */
    public static void goneViewByAlpha(final View view) {
        goneViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION, false, null);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)）
     *
     * @param view              被处理的视图
     * @param durationMillis    持续时间，毫秒
     * @param isBanClick        在执行动画的过程中是否禁止点击
     * @param animationListener 动画监听器
     */
    public static void visibleViewByAlpha(final View view, long durationMillis,
                                          final boolean isBanClick, final AnimationListener animationListener) {
        if (view.getVisibility() != View.VISIBLE) {
            view.setVisibility(View.VISIBLE);
            AlphaAnimation showAlphaAnimation = getShowAlphaAnimation(durationMillis);
            showAlphaAnimation.setAnimationListener(new AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    if (isBanClick) {
                        view.setClickable(false);
                    }
                    if (animationListener != null) {
                        animationListener.onAnimationStart(animation);
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    if (animationListener != null) {
                        animationListener.onAnimationRepeat(animation);
                    }
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    if (isBanClick) {
                        view.setClickable(true);
                    }
                    if (animationListener != null) {
                        animationListener.onAnimationEnd(animation);
                    }
                }
            });
            view.startAnimation(showAlphaAnimation);
        }
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)）
     *
     * @param view              被处理的视图
     * @param durationMillis    持续时间，毫秒
     * @param animationListener 动画监听器
     */
    public static void visibleViewByAlpha(final View view, long durationMillis,
                                          final AnimationListener animationListener) {
        visibleViewByAlpha(view, durationMillis, false, animationListener);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)）
     *
     * @param view           被处理的视图
     * @param durationMillis 持续时间，毫秒
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void visibleViewByAlpha(final View view, long durationMillis,
                                          final boolean isBanClick) {
        visibleViewByAlpha(view, durationMillis, isBanClick, null);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)）
     *
     * @param view           被处理的视图
     * @param durationMillis 持续时间，毫秒
     */
    public static void visibleViewByAlpha(final View view, long durationMillis) {
        visibleViewByAlpha(view, durationMillis, false, null);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view              被处理的视图
     * @param animationListener 动画监听器
     * @param isBanClick        在执行动画的过程中是否禁止点击
     */
    public static void visibleViewByAlpha(final View view,
                                          final boolean isBanClick, final AnimationListener animationListener) {
        visibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                isBanClick, animationListener);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view              被处理的视图
     * @param animationListener 动画监听器
     */
    public static void visibleViewByAlpha(final View view,
                                          final AnimationListener animationListener) {
        visibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                false, animationListener);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view       被处理的视图
     * @param isBanClick 在执行动画的过程中是否禁止点击
     */
    public static void visibleViewByAlpha(final View view,
                                          final boolean isBanClick) {
        visibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                isBanClick, null);
    }

    /**
     * 将给定视图渐渐显示出来（view.setVisibility(View.VISIBLE)），
     * 默认的持续时间为DEFAULT_ALPHA_ANIMATION_DURATION
     *
     * @param view 被处理的视图
     */
    public static void visibleViewByAlpha(final View view) {
        visibleViewByAlpha(view, AnimationUtils.DEFAULT_ANIMATION_DURATION,
                false, null);
    }

	/*
	 *  ***************************视图移动动画********************************** 
	 * 
	 */

    /**
     * 视图移动
     *
     * @param view           要移动的视图
     * @param fromXDelta     X轴开始坐标
     * @param toXDelta       X轴结束坐标
     * @param fromYDelta     Y轴开始坐标
     * @param toYDelta       Y轴结束坐标
     * @param cycles         重复
     * @param durationMillis 持续时间
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void translate(final View view, float fromXDelta,
                                 float toXDelta, float fromYDelta, float toYDelta, float cycles,
                                 long durationMillis, final boolean isBanClick) {
        TranslateAnimation translateAnimation = new TranslateAnimation(
                fromXDelta, toXDelta, fromYDelta, toYDelta);
        translateAnimation.setDuration(durationMillis);
        if (cycles > 0.0) {
            translateAnimation.setInterpolator(new CycleInterpolator(cycles));
        }
        translateAnimation.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                if (isBanClick) {
                    view.setClickable(false);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (isBanClick) {
                    view.setClickable(true);
                }
            }
        });
        view.startAnimation(translateAnimation);
    }

    /**
     * 视图移动
     *
     * @param view           要移动的视图
     * @param fromXDelta     X轴开始坐标
     * @param toXDelta       X轴结束坐标
     * @param fromYDelta     Y轴开始坐标
     * @param toYDelta       Y轴结束坐标
     * @param cycles         重复
     * @param durationMillis 持续时间
     */
    public static void translate(final View view, float fromXDelta,
                                 float toXDelta, float fromYDelta, float toYDelta, float cycles,
                                 long durationMillis) {
        translate(view, fromXDelta, toXDelta, fromYDelta, toYDelta, cycles,
                durationMillis, false);
    }
    
    /*
	 *  ***************************视图摇晃********************************** 
	 * 
	 */

    /**
     * 视图摇晃
     *
     * @param view           要摇动的视图
     * @param fromXDelta     X轴开始坐标
     * @param toXDelta       X轴结束坐标
     * @param cycles         重复次数
     * @param durationMillis 持续时间
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void shake(View view, float fromXDelta, float toXDelta,
                             float cycles, long durationMillis, final boolean isBanClick) {
        translate(view, fromXDelta, toXDelta, 0.0f, 0.0f, cycles,
                durationMillis, isBanClick);
    }

    /**
     * 视图摇晃
     *
     * @param view           要摇动的视图
     * @param fromXDelta     X轴开始坐标
     * @param toXDelta       X轴结束坐标
     * @param cycles         重复次数
     * @param durationMillis 持续时间
     */
    public static void shake(View view, float fromXDelta, float toXDelta,
                             float cycles, long durationMillis) {
        translate(view, fromXDelta, toXDelta, 0.0f, 0.0f, cycles,
                durationMillis, false);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，重复7次
     *
     * @param view
     * @param cycles         重复次数
     * @param durationMillis 持续时间
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void shake(View view, float cycles, long durationMillis,
                             final boolean isBanClick) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, cycles, durationMillis,
                isBanClick);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，持续700毫秒
     *
     * @param view
     * @param cycles         重复次数
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void shake(View view, float cycles, final boolean isBanClick) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, cycles, 700, isBanClick);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10
     *
     * @param view
     * @param cycles         重复次数
     * @param durationMillis 持续时间
     */
    public static void shake(View view, float cycles, long durationMillis) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, cycles, durationMillis, false);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，重复7次
     *
     * @param view
     * @param durationMillis 持续时间
     * @param isBanClick     在执行动画的过程中是否禁止点击
     */
    public static void shake(View view, long durationMillis,
                             final boolean isBanClick) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, 7, durationMillis, isBanClick);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，持续700毫秒
     *
     * @param view   要摇动的视图
     * @param cycles 重复次数
     */
    public static void shake(View view, float cycles) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, cycles, 700, false);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，重复7次
     *
     * @param view
     * @param durationMillis 持续时间
     */
    public static void shake(View view, long durationMillis) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, 7, durationMillis, false);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，重复7次，持续700毫秒
     *
     * @param view
     * @param isBanClick 在执行动画的过程中是否禁止点击
     */
    public static void shake(View view, final boolean isBanClick) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, 7, 700, isBanClick);
    }

    /**
     * 视图摇晃，默认摇晃幅度为10，重复7次，持续700毫秒
     *
     * @param view
     */
    public static void shake(View view) {
        translate(view, 0.0f, 10.0f, 0.0f, 0.0f, 7, 700, false);
    }

}

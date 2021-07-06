package com.design.pattern.mediator.demo2;

/**
 * @author yangsanity
 */
public class ClassUtil {

    public static class Button implements Component {

        private OnClickListener onClickListener;

        public void setOnClickListener(OnClickListener onClickListener) {
            this.onClickListener = onClickListener;
        }
    }

    public static class Input implements Component {

        public String text() {
            return "";
        }

        public void show() {
        }

        public void hide() {
        }
    }

    public static class Text implements Component {

        public void hide() {
        }
    }

    public static class Selection implements Component {

        public String select() {
            return "";
        }
    }

    public static class View {}

    public interface OnClickListener {

        void onClick(View v);
    }

    public interface Component {

    }
}

package com.design.pattern.mediator.demo2.v2;

import com.design.pattern.mediator.demo2.ClassUtil.Button;
import com.design.pattern.mediator.demo2.ClassUtil.Component;
import com.design.pattern.mediator.demo2.ClassUtil.Input;
import com.design.pattern.mediator.demo2.ClassUtil.Selection;
import com.design.pattern.mediator.demo2.ClassUtil.Text;

/**
 * @author yangsanity
 */
public interface Mediator {

    void handleEvent(Component component, String event);

    default void setLoginButton(Button loginButton) {}

    default void setRegButton(Button regButton) {}

    default void setUsernameInput(Input usernameInput) {}

    default void setPasswordInput(Input passwordInput) {}

    default void setRepeatedPswdInput(Input repeatedPswdInput) {}

    default void setHintText(Text hintText) {}

    default void setSelection(Selection selection) {}
}

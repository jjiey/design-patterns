package com.design.pattern.mediator.demo2.v2;

import com.design.pattern.mediator.demo2.ClassUtil.Button;
import com.design.pattern.mediator.demo2.ClassUtil.Component;
import com.design.pattern.mediator.demo2.ClassUtil.Input;
import com.design.pattern.mediator.demo2.ClassUtil.Selection;
import com.design.pattern.mediator.demo2.ClassUtil.Text;

/**
 * @author yangsanity
 */
public class LandingPageDialog implements Mediator {

    private Button loginButton;
    private Button regButton;
    private Selection selection;
    private Input usernameInput;
    private Input passwordInput;
    private Input repeatedPswdInput;
    private Text hintText;

    @Override
    public void handleEvent(Component component, String event) {
        if (component.equals(loginButton)) {
            String username = usernameInput.text();
            String password = passwordInput.text();
            // 校验数据...
            // 做业务处理...
        } else if (component.equals(regButton)) {
            // 获取usernameInput、passwordInput、repeatedPswdInput数据...
            // 校验数据...
            // 做业务处理...
        } else if (component.equals(selection)) {
            String selectedItem = selection.select();
            if ("login".equals(selectedItem)) {
                usernameInput.show();
                passwordInput.show();
                repeatedPswdInput.hide();
                hintText.hide();
                //...省略其他代码
            } else if ("register".equals(selectedItem)) {
                //....
            }
        }
    }
}

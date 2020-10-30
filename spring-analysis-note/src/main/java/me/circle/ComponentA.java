package me.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhanglifeng
 * @since 2020-10-13 14:27
 */
@Component
public class ComponentA {

	@Autowired
    private ComponentB componentB;

//    public ComponentA(ComponentB componentB) {
//        this.componentB = componentB;
//    }

    public void methodA() {
		System.out.println(componentB);
    }
}

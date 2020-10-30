package me.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhanglifeng
 * @since 2020-10-13 14:27
 */
@Service
public class ComponentB {

	@Autowired
    private ComponentA componentA;

//    public ComponentB(ComponentA componentA) {
//        this.componentA = componentA;
//    }

    public void methodB() {
		System.out.println(componentA);
    }

}
